package com.example.spring.security.service;

import com.example.spring.security.entity.SysUser;

public interface UserService {
    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
