package com.mytests.spring.testing.springresttemplatebuilder.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * intercepts the requests
 */
public class MyInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        System.out.println("**********************************");
        System.out.println("Request "+request.getMethod() + " " + request.getURI() + " was executed " );
        System.out.println("**********************************");

        return execution.execute(request, body);
    }


}
