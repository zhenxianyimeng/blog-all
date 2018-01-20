package com.zjb.spring.boot.blog.initializrstart.repository;

import com.zjb.spring.boot.blog.initializrstart.domain.User;

import java.util.List;

/**
 * @author zjb
 * @date 2018/1/8.
 */
public interface UserRepository {

    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUsers();
}
