package com.example.hello;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorC {

   @ExceptionHandler(Exception.class)
    public Map show(){
       HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
       objectObjectHashMap.put("tip","未知错误");
       return  objectObjectHashMap;
   }
}
