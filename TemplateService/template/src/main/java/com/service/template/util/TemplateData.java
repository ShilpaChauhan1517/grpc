package com.service.template.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class TemplateData {
    @JsonProperty("templateID")
    private String templateID;

    @JsonProperty("templateName")
    private String templateName;

    @JsonProperty("featureList")
    private List<FeatureData> featureList;

}
