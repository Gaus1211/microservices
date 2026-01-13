package com.fitness.aiservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "gemini.api")
@Data
public class GeminiProperties {

    private String url;
    private String key;


}
