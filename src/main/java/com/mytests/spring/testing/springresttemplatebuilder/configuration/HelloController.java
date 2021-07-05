package com.mytests.spring.testing.springresttemplatebuilder.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Controller to test RestTemplate configuration
 */
@RestController
@RequestMapping("/spring-rest")
public class HelloController {

    private static final String RESOURCE_URL = "/baz";
    private RestTemplate restTemplate;

    @Autowired
    public HelloController(RestTemplateBuilder builder) {
        this.restTemplate = builder.rootUri("http://localhost:8080/spring-rest").build();
    }

    @RequestMapping("/foo")
    public String foo() {

        ResponseEntity<String> response = restTemplate.getForEntity(RESOURCE_URL, String.class);

        return response.getBody();
    }

    @RequestMapping("/baz")
    public String baz() {
        return "Foo";
    }

}
