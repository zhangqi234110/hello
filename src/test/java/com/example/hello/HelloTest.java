package com.example.hello;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class HelloTest {


    @Test
    void te(){

        System.out.println("你好啊！");
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate client = restTemplateBuilder.build();
        ResponseEntity<String> forEntity = client.getForEntity("http://localhost:8080/hello", String.class);
        String body = forEntity.getBody();
        System.out.println(body);
    }
}