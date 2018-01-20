package com.boot.two.firstappdemo.repository;

import com.boot.two.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zjb
 * @date 2018/1/10.
 */
@Repository
public class UserRepository {

    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();
    /**
     *
     * @param user {@link User}
     * @return 返回<code>true</code>
     */
    public boolean save(User user){

        Integer id = idGenerator.incrementAndGet();
        user.setId(id);

        return repository.put(id, user) == null;

    }

    public Collection<User> finaAll(){
        return repository.values();
    }
}
