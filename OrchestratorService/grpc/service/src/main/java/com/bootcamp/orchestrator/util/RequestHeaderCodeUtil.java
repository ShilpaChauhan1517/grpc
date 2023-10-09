package com.bootcamp.orchestrator.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class RequestHeaderCodeUtil {

    private static String productCode;
    private static String memberCode;

    @Value("${productCode}")
    public void setProductCode(String productCodeValue) {
        productCode = productCodeValue;
    }

    @Value("${memberCode}")
    public void setMemberCode(String memberCodeValue) {
        memberCode = memberCodeValue;
    }

    public static String getProductCode() {
        return productCode;
    }

    public static String getMemberCode() {
        return memberCode;
    }
}


