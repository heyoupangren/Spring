package com.org.cwh.annotation;

import com.org.cwh.annotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cwh
 * CreateTime 2019/7/12 18:42
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt= new ClassPathXmlApplicationContext("beans-annotation.xml");

       /* TestObject testObject =(TestObject) cxt.getBean("testObject");
        System.out.println(testObject);*/

        UserController userController =(UserController)cxt.getBean("userController");
        System.out.println(userController);
        userController.execute();

       /* UserService userService =(UserService)cxt.getBean("userService");
        System.out.println(userService);*/

       /* UserRepository userRepository=(UserRepository)cxt.getBean("userRepository");
        System.out.println(userRepository);*/


    }
}
