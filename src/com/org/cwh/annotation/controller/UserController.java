package com.org.cwh.annotation.controller;

import com.org.cwh.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Cwh
 * CreateTime 2019/7/12 18:38
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    public void execute(){
        System.out.println("userController execute....");
        userService.add();

    }
}
