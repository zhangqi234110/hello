package com.example.hello.controller;

import com.example.hello.pojo.User;
import com.example.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello2")
    public Map se(){



        Jedis jedis = new Jedis("localhost");
        String a="sad aa";
        jedis.set("aa",a);

        int c=10;
        List<User> all = userService.findAll();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code","200");
        objectObjectHashMap.put("data",all);
        objectObjectHashMap.put("me",a);
        System.out.println(all.get(1).getName());
        System.out.println(all.get(2).getName());
            throw new RuntimeException("未知错误啊啊啊啊");

           // return objectObjectHashMap;


    }

    @RequestMapping("/hello3")
    public  Map he(HttpServletRequest request, HttpServletResponse response){

        String token="abcdefg";
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("token",token);
        //response.addHeader("token",token);
        Cookie cookie = new Cookie("cookie",token);
        request.getSession().setAttribute("session",token);
        String id = request.getSession().getId();
        //response.addCookie(cookie);
        objectObjectHashMap.put("sessionid",id);
        return  objectObjectHashMap;


    }


    @RequestMapping("/hello4")
    public Map sess(HttpServletRequest request, @CookieValue String cookie){
        String cookie2 = request.getParameter("Cookie");
        String cookie1 = request.getHeader("Cookie");
        String id = request.getSession().getId();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("cookie",cookie);
        objectObjectHashMap.put("Cookie1",cookie1);
        objectObjectHashMap.put("Cookie2",cookie2);
        objectObjectHashMap.put("sessionid",id);



        return objectObjectHashMap;

    }

}
