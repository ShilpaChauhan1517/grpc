package com.bootcamp.orchestrator.responsebuilder;

import com.bootcamp.grpc.orchestrator.proto.ErrorDetail;
import com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse;
import com.bootcamp.grpc.orchestrator.proto.ProductResponse;
import com.bootcamp.grpc.orchestrator.proto.ProductDetails;
import com.bootcamp.grpc.orchestrator.proto.ControlData;
import com.bootcamp.grpc.orchestrator.proto.ProductTrait;
import com.bootcamp.grpc.orchestrator.proto.ResponseDetail;
import com.bootcamp.orchestrator.util.RequestHeaderCodeUtil;
import com.calculationService.CalculationEngineResponse;
import com.calculationService.CalculationEngineResponseList;
import com.calculationService.FeatureResponse;

import java.util.Map;

public class OrchestratorResponseBuilder {
    public static OrchestratorResponse buildOrchestratorResponse(CalculationEngineResponseList calculationEngineResponseList, Map<String, String> templateToProductMap, String subjectId) {
        OrchestratorResponse.Builder responseBuilder = OrchestratorResponse.newBuilder();
        Map<String, String> productMap = templateToProductMap;

        try {
            for (int i = 0; i < calculationEngineResponseList.getResponsesCount(); i++) {
                CalculationEngineResponse calculationEngineResponse = calculationEngineResponseList.getResponses(i);

                ProductDetails.Builder productDetailsBuilder = ProductDetails.newBuilder();
                for (FeatureResponse featureResponse : calculationEngineResponse.getFeatureResponsesList()) {
                    ProductTrait.Builder productTraitBuilder = ProductTrait.newBuilder()
                            .setFeatureName(featureResponse.getFeatureName())
                            .setFeatureValue(featureResponse.getFeatureValue());
                    productDetailsBuilder.addProductTraits(productTraitBuilder.build());
                }

                productDetailsBuilder.setSubjectId(subjectId);
                productDetailsBuilder.setProductId(RequestHeaderCodeUtil.getProductCode());

                ResponseDetail responseDetail = ResponseDetail.newBuilder()
                        .setResponseCode(calculationEngineResponse.getResponseHeader().getResponseCode())
                        .setResponseDesc(calculationEngineResponse.getResponseHeader().getResponseDesc())
                        .build();

                ErrorDetail errorDetail = ErrorDetail.newBuilder()
                        .setErrorCode(calculationEngineResponse.getErrors().getErrorCode())
                        .setErrorDesc(calculationEngineResponse.getErrors().getErrorDesc())
                        .build();

                ControlData controlDataBuilder = ControlData.newBuilder()
                        .setStatus(responseDetail.getResponseCode().equals("200") ? "success" : "failure")
                        .setIsHit(responseDetail.getResponseCode().equals("200") ? "Y" : "N")
                        .addResponseDetails(responseDetail)
                        .addErrorDetails(errorDetail)
                        .build();

                productDetailsBuilder.setControlData(controlDataBuilder);

                // Retrieve template-Id from CalculationResponse
                String templateId = calculationEngineResponse.getTemplateId();

                // Retrieve productName from HashMap with the help of templateId as key
                String product = templateToProductMap.get(templateId);

                if (product == null) {
                    System.err.println("TemplateId not found: " + templateId);
                    continue;
                }

                ProductResponse productResponseBuilder = ProductResponse.newBuilder()
                        .addProductDetails(productDetailsBuilder)
                        .setProduct(product)
                        .build();

                responseBuilder.addProductResponses(productResponseBuilder);
            }

        } catch (Exception e) {
            System.err.println("Error building OrchestratorResponse: " + e.getMessage());
        }

        return responseBuilder.build();
    }
}

