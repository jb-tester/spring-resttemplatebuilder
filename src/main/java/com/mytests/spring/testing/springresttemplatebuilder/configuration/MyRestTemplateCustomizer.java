package com.mytests.spring.testing.springresttemplatebuilder.configuration;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

/**
 * customize rest template: add interceptor
 */
public class MyRestTemplateCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        restTemplate.getInterceptors().add(new MyInterceptor());
    }
}
