package com.test.bookshop.biz.impl;

import com.test.bookshop.biz.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public boolean isValidate(String usn, String pwd) {
        // 模拟实现
        boolean result = false;
        if (usn.equals(pwd))
            result = true;
        return result;
    }
}
