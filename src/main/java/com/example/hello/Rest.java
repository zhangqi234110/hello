package com.example.hello;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

public class Rest {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate client = restTemplateBuilder.build();
        ResponseEntity<String> forEntity = client.getForEntity("http://v.juhe.cn/weather/index?cityname={1}&key={2}", String.class,"上海市","8a8b93293158961596749bb01b7ab2c0");
        String body = forEntity.getBody();
        System.out.println(body);
    }
}
