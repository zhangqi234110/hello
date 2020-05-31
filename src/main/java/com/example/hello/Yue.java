package com.example.hello;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Yue {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        String substring = format.substring(5, 7);
        //System.out.println(format);
        //System.out.println(substring);

        Random random = new Random();
        int i = random.nextInt(5);
        System.out.println(i);
        String in=i+"";
        switch (in){
            case "0":
                System.out.println("森林公园优惠券");
                break;
            case "1":
                System.out.println("老虎滩");
                break;
            case "2":

            case "3":

            case "4":
                System.out.println("不好意思，您为中奖，期待下次吧！");
                break;

        }

    }

}
