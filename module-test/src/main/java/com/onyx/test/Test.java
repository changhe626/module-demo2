package com.onyx.test;

import com.onyx.api.UserServiceImpl;
import com.onyx.base.User;


/**
 * @author zk
 * @Description:测试
 * @date 2019-08-28 12:29
 */
public class Test {

    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.login();
        User user = new User(1, "zhangke");
        service.save(user);
    }

}
