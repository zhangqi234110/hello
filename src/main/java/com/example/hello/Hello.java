package com.example.hello;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public Map<Object, Object> he(HttpSession session){
        Map<Object, Object> map = new HashMap<>();
        //map.put("cookie",sessionId);
        map.put("ni","hao");
        map.put("wo","piaoliang");
        map.put("sessionid",session.getId());
        int a=1/0;
        return map;
    }
}
