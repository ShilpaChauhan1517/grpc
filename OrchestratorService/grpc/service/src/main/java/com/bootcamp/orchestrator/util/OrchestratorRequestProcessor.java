package com.bootcamp.orchestrator.util;

import com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest;
import com.bootcamp.grpc.orchestrator.proto.Product;

import java.util.HashMap;
import java.util.Map;

public class OrchestratorRequestProcessor {
    public static Map<String, String> extractTemplateIdsAndProducts(OrchestratorRequest request) {
        Map<String, String> templateIdToProductMap = new HashMap<>();

        for (Product product : request.getProductsList()) {
            if ("y".equalsIgnoreCase(product.getIsRequested())) {
                String templateId = product.getAdviserTemplateId();
                String productName = product.getProduct();
                templateIdToProductMap.put(templateId, productName);
            }
        }
        return templateIdToProductMap;
    }
}
