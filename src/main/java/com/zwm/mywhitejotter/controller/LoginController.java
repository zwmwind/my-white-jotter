package com.zwm.mywhitejotter.controller;

import com.zwm.mywhitejotter.pojo.Result;
import com.zwm.mywhitejotter.pojo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

/**
 * @ClassName: LoginController
 * @Description: TODO
 * @Author: zhangweiming
 * @Date: 16:59 2021/12/25
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!StringUtils.equals(username, "admin") || !StringUtils.equals(requestUser.getPassword(), "123456")) {
            String message = "账号或密码错误";
            System.out.println("test");
            return new Result(400);
        }
        return new Result(200);
    }
}
