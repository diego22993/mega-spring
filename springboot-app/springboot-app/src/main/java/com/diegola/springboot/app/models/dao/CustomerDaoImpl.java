package com.diegola.springboot.app.models.dao;

import com.diegola.springboot.app.models.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }
}
