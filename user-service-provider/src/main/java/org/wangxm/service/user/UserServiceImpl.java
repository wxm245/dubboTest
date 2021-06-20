package org.wangxm.service.user;

import org.wangxm.common.User;
import org.wangxm.common.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.将服务提供者注册到注册中心
 *  1.导入dubbo依赖2.6.2
 *  2.配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
public class UserServiceImpl implements UserService {
    public List<User> getUsers(String userId) {
        List<User> users = new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        u1.setName("wangxm");
        users.add(u1);
        return users;
    }
}
