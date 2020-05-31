package com.example.hello.jedis;

import redis.clients.jedis.Jedis;

public class Jerdis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        String a="你好啊";
        jedis.set("ws",a);
        String ws = jedis.get("ws");
        System.out.println(ws);
        System.out.println(a);

    }
}
