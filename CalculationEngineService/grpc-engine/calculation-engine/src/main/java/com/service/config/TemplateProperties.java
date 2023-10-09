package com.service.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Component
public class TemplateProperties {

    @Value("${grpc.services.template.host}")
    private String host;

    @Value("${grpc.services.template.port}")
    private int port;

}
