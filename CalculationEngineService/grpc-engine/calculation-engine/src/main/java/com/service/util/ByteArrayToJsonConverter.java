package com.service.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class ByteArrayToJsonConverter {

    public JsonObject convertFromBase64Json(String subjectArray) {
        try {
            byte[] jsonBytes = Base64.getDecoder().decode(subjectArray.getBytes(StandardCharsets.UTF_8));

            Gson gson = new Gson();
            String json = new String(jsonBytes, StandardCharsets.UTF_8);
            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
