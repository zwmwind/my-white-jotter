package com.zwm.mywhitejotter;

import com.zwm.mywhitejotter.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyWhiteJotterApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testUserService() {
        try {
            System.out.println(userService.getByUsername("admin"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
