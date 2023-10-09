package com.bootcamp.orchestrator.requestbuilder;

import com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest;
import com.bootcamp.orchestrator.util.GetTransactionDetail;
import com.bootcamp.orchestrator.util.RequestHeaderCodeUtil;
import com.calculationService.CalculationEngineRequest;
import com.calculationService.Model;
import com.calculationService.RequestHeader;
import com.calculationService.SubjectData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CalculationEngineRequestBuilder {

    public static CalculationEngineRequest buildCalculationEngineRequest(OrchestratorRequest request, String byteArrayOfSubjectJson) {

        try {
            String transactionId = GetTransactionDetail.generateTransactionId();
            String productCode = RequestHeaderCodeUtil.getProductCode();
            String memberCode = RequestHeaderCodeUtil.getMemberCode();

            RequestHeader requestHeader = RequestHeader.newBuilder()
                    .setTransactionId(transactionId)
                    .setMemberCode(memberCode)
                    .setProductCode(productCode)
                    .setMonitoringDate(request.getMonitoringDate())
                    .build();

            SubjectData subjectData = SubjectData.newBuilder()
                    .setSubject(byteArrayOfSubjectJson)
                    .build();

            List<Model> modelsList = request.getProductsList().stream()
                    .filter(product -> "y".equalsIgnoreCase(product.getIsRequested()))
                    .map(product -> Model.newBuilder()
                            .setTemplateId(product.getAdviserTemplateId())
                            .build())
                    .collect(Collectors.toList());

            // Build the CalculationEngineRequest
            CalculationEngineRequest.Builder calculationEngineRequestBuilder = CalculationEngineRequest.newBuilder();

            calculationEngineRequestBuilder.setRequestHeader(requestHeader);
            calculationEngineRequestBuilder.addSubjectData(subjectData);
            calculationEngineRequestBuilder.addAllModels(modelsList);

            // Return the CalculationEngineRequest
            return calculationEngineRequestBuilder.build();

        } catch (Exception e) {
            System.err.println("Error building CalculationEngineRequest: " + e.getMessage());
            return null;
        }
    }
}