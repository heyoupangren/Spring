package com.org.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @author Cwh
 * CreateTime 2019/7/15 11:48
 */
@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Employee get(){
        String sql ="select * from employees";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
        Employee employee =jdbcTemplate.queryForObject(sql,rowMapper);
        return employee;
    }

}
