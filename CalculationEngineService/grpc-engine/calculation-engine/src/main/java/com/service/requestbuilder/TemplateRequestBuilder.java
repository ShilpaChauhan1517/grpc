package com.service.requestbuilder;

import com.calculationService.CalculationEngineRequest;
import com.service.util.GetTransactionDetail;
import com.templateService.RequestHeader;
import com.templateService.Template;
import com.templateService.TemplateRequest;
import java.util.List;
import java.util.stream.Collectors;

public class TemplateRequestBuilder {
    public static TemplateRequest buildTemplateRequest(CalculationEngineRequest request) {

        RequestHeader requestHeader = RequestHeader.newBuilder()
                .setTransactionId(GetTransactionDetail.generateTransactionId())
                .setMemberCode(request.getRequestHeader().getProductCode())
                .setProductCode(request.getRequestHeader().getMemberCode())
                .setMonitoringDate(request.getRequestHeader().getMonitoringDate())
                .build();

        List<Template> templates = request.getModelsList()
                .stream()
                .map(model -> Template.newBuilder()
                        .setTemplateID(model.getTemplateId())
                        .build())
                .collect(Collectors.toList());

        return TemplateRequest.newBuilder()
                .setRequestHeader(requestHeader)
                .addAllTemplates(templates)
                .build();
    }
}
