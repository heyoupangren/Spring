package com.org.cwh.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @author Cwh
 * CreateTime 2019/7/13 11:40
 */
@Repository
public class UserJdbcRepository implements  UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save....");
    }
}
