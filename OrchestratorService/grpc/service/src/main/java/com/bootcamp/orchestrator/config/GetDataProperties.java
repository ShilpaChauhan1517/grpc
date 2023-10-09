package com.bootcamp.orchestrator.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class GetDataProperties {

    @Value("${grpc.services.get-data.host}")
    private String host;

    @Value("${grpc.services.get-data.port}")
    private int port;

}