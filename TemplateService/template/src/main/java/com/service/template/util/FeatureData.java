package com.service.template.util;

import com.google.gson.annotations.SerializedName;

public class FeatureData {
    @SerializedName("seqID")
    private int seqID;

    @SerializedName("featureName")
    private String featureName;

    @SerializedName("attributeName")
    private String attributeName;

    // Getter methods
    public int getSeqID() {
        return seqID;
    }

    public String getFeatureName() {
        return featureName;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
