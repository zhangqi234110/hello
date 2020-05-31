package com.example.hello;

import org.springframework.stereotype.Component;

@Component
public class Sou implements  Runnable {


    @Override
    public void run() {
        while (true){
            System.out.println("你好，我来了");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
