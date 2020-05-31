package com.example.hello;

import com.example.hello.mapper.UserMapper;
import com.example.hello.pojo.User;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

@Component
public class TestQuartz extends QuartzJobBean {
    @Autowired
    private UserMapper userMapper;



    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //System.out.println("现在时间是："+new Date());
        List<User> all = userMapper.findAll();
        for (int i=0;i<all.size();i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = all.get(i).getDate();
            String format1 = simpleDateFormat.format(date1);
            String substring = format1.substring(8);
           // System.out.println(substring);
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            String substring1 = format.substring(8);
            int i1 = Integer.parseInt(substring1);
            int i2 = Integer.parseInt(substring);
           // if (Math.abs(i2-i1)<=2){
                System.out.println("该交租了"+i2);
           // }

        }


    }
}
