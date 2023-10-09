package com.bootcamp.orchestrator.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class CalculationEngineProperties {

    @Value("${grpc.services.calculation-engine.host}")
    private String host;

    @Value("${grpc.services.calculation-engine.port}")
    private int port;

}