package com.bootcamp.orchestrator.util;

import com.google.gson.Gson;
import com.grpcAssignment.GetDataResponse;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class JsonToByteArrayConverter {
    public String convertToBase64Json(GetDataResponse getDataResponse) {
        try {
            Gson gson = new Gson();
            String getDataResponseJson = gson.toJson(getDataResponse);
            byte[] base64EncodedByteArray = Base64.getEncoder().encode(getDataResponseJson.getBytes(StandardCharsets.UTF_8));
            return new String(base64EncodedByteArray, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "Error converting JSON to Base64: " + e.getMessage();
        }
    }
}
