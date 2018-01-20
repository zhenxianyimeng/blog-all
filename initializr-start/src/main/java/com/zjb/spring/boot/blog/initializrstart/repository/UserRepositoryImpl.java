package com.zjb.spring.boot.blog.initializrstart.repository;

import com.zjb.spring.boot.blog.initializrstart.domain.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zjb
 * @date 2018/1/9.
 */
public class UserRepositoryImpl implements UserRepository {

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();

        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
