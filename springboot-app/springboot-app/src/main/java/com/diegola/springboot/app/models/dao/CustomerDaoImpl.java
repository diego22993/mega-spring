package com.diegola.springboot.app.models.dao;

import com.diegola.springboot.app.models.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository("clienteDaoJPA")
public class CustomerDaoImpl implements ICustomerDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }
}
