package org.example;

import org.example.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载Spring配置
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取Bean并测试
        UserService service = context.getBean(UserService.class);
        service.addUser("张三");
    }
}