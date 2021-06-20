package org.wangxm.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangxm.common.OrderService;
import org.wangxm.common.User;
import org.wangxm.common.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        List<User> users = userService.getUsers(userId);
        System.out.println(users);
    }
}
