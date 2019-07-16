package com.org.cwh.annotation.service;

import com.org.cwh.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Cwh
 * CreateTime 2019/7/12 18:37
 */
@Service
public class UserService {

    private UserRepository userRepository;
    @Autowired
    @Qualifier("userJdbcRepository")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){
        System.out.println("userService add....");
        userRepository.save();

    }
}
