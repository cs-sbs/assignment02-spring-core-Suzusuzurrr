package org.example.service;

import org.springframework.stereotype.Service;

@Service // 使用注解方式注册Bean
public class UserService {

    // 模拟添加用户操作
    public void addUser(String username) {
        try {
            Thread.sleep(1000); // 模拟耗时操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("用户添加成功: " + username);
    }
}
