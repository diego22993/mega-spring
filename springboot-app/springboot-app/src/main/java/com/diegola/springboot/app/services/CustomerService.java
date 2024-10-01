package com.diegola.springboot.app.services;

import com.diegola.springboot.app.models.Customer;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public CustomerService(){
        Customer c1 = new Customer();
        c1.setId(1);
        c1.setName("Rogelio");
        c1.setAddress("El mundo");
        c1.setEmail("no_tiene@yahoo.com");

        Customer c2 = new Customer(12,"diego","351237552","di@gmail.com","Avenida siempre viva 231");

        Customer c3 = new Customer();
        c3.setId(3);
        c3.setName("Jorge");
        c3.setAddress("Sipe sipe");
        c3.setEmail("tercero@hotmail.com");

        Customer c4 = new Customer();
        c4.setId(4);
        c4.setName("Ana");
        c4.setAddress("Europa");
        c4.setEmail("cuarto_9999@hotmail.com");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
    }
    public Customer getCustomer(Integer id){
        for (Customer dto : customers) {
            if(dto.getId().equals(id)){
                return dto;
            }
        }
        return null;
    }

    public void insertCustomer(Customer dto){
        if(dto.getId()!=null && dto.getId().equals(100)){
            System.out.println("ERROR: Ya existe");
        }else{
            System.out.println("Implementar lógica de insercion...");
        }
    }

    public void deleteCustomer(Integer id){
        for (Customer dto : customers) {
            if(dto.getId()!=null && dto.getId().equals(id)){
                customers.remove(dto);
                break;
            }
        }
    }

    public void addCustomer(Customer dto){
        customers.add(dto);
    }

    public void updateCustomer(Integer id, Customer dto){
        for (Customer customer : customers) {
            if(customer.getId().equals(id)){
                customer.setName(dto.getName());
                customer.setTelphone(dto.getTelphone());
            }
        }
    }

    public List<Customer> searchCustomer(String email){
        List<Customer> searchResult = new ArrayList<>();
        for (Customer customer : customers) {
            if(customer.getEmail().contains(email)){
                searchResult.add(customer);;
            }
        }
        return searchResult;
    }

    public List<Customer> getAllCustomers(){
        return customers;
    }
}
