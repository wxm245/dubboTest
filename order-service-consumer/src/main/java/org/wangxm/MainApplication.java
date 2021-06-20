package org.wangxm;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wangxm.common.OrderService;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService =  context.getBean(OrderService.class);
        orderService.initOrder("123");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
