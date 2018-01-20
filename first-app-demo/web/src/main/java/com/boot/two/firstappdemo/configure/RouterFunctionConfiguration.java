package com.boot.two.firstappdemo.configure;

import com.boot.two.firstappdemo.domain.User;
import com.boot.two.firstappdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;

import java.util.Collection;

/**
 * @author zjb
 * @date 2018/1/10.
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     *  Servlet
     *  ServletRequest  HttpServletRequest
     *
     *
     *  ServletRequest  ServletResponse 支持servlet规范 或者Netty规范
     */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFinaAll(UserRepository userRepository){

        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request -> {
                    Collection<User> users = userRepository.finaAll();
                    Flux<User> userFlux = Flux.fromIterable(users);
                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }
}
