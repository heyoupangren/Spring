package com.org.cwh.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Cwh
 * CreateTime 2019/7/13 11:51
 */
public class BaseService<T> {


    @Autowired
    protected BaseRepository<T> baseRepository;

    public  void add(){
        System.out.println("add.....");
        System.out.println(baseRepository);
    }
}
