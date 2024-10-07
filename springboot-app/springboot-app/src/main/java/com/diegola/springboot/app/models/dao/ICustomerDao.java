package com.diegola.springboot.app.models.dao;

import com.diegola.springboot.app.models.Customer;

import java.util.List;

public interface ICustomerDao {
    public List<Customer> findAll();
}
