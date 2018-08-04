package com.dan.springJdbc.service;

import com.dan.springJdbc.entity.MemoGroup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * 业务逻辑层
 */
@Service
public class MemoGroupService  {
    public static void main(String[] args) {

        /**
         * 其他我们都不需要new，但是无论如何要new出来一个容器，因为容器才会帮我们new出来一个个Bean
         */
        ApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");

        MemoGroup memoGroup= (MemoGroup) context.getBean("memoGroup");
        memoGroup.setCreatedTime(new Date());
        memoGroup.setId(9);
        memoGroup.setName("王五");
       ServiceImpl service= (ServiceImpl) context.getBean("serviceImpl");
       int ret=service.addMemoGroup(memoGroup);
        System.out.println(ret);
    }
}
