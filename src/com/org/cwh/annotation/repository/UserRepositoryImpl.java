package com.org.cwh.annotation.repository;

import com.org.cwh.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Cwh
 * CreateTime 2019/7/12 18:36
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired(required = false)
    private TestObject testObject;

    @Override
    public void save() {
        System.out.println("UserRepository save...." );
        System.out.println(testObject);
    }
}
