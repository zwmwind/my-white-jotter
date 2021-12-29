package com.zwm.mywhitejotter.service;

import com.zwm.mywhitejotter.pojo.User;

/**
 * @InterfaceName: UserService
 * @Description: User接口
 * @Author: zhangweiming
 * @Date: 21:53 2021/12/29
 * @Version: 1.0
 */
public interface UserService {

    User getByUsername(String username);
}
