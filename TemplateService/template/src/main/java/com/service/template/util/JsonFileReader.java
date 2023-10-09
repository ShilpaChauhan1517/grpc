package com.service.template.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFileReader {
    public static TemplateData readJsonFile(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            TemplateData templateData = objectMapper.readValue(new File(filePath), TemplateData.class);
            return templateData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
