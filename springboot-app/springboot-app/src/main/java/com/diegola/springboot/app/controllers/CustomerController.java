package com.diegola.springboot.app.controllers;

import com.diegola.springboot.app.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CustomerController {

    @GetMapping("/customer/{id}")
    public Customer getCustomer(Integer id){
        return new Customer();
    }
    @GetMapping("/customer")
    public void insertCustomer(Customer dto){
        if(dto.getId()!=null && dto.getId().equals(100)){
            System.out.println("ERROR: Ya existe");
        }else{
            System.out.println("Implementar lógica de insercion...");
        }
    }
    @GetMapping("/customer/{id}")
    public void deleteCustomer(Customer dto){
        if(dto.getId()!=null && dto.getIsDeleted().equals(false)){
            dto.setIsDeleted(true);
            System.out.println("Implementamos lógica de BAJA --> actualizamos la bandera...");
        }else{
            System.out.println("ERROR: Ya se encuentra dado de baja");
        }
    }
    @GetMapping("/customer/{id}")
    public void updateCustomer(Customer dto){
        if(dto.getId()!=null && dto.getIsDeleted().equals(false)){
            dto.setName("Implementacion de UPDATE!");
        }else{
            System.out.println("ERROR: No existe");
        }
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer();
        c1.setName("Rogelio");
        c1.setAddress("El mundo");
        c1.setEmail("no_tiene@yahoo.com");
        Customer c2 = new Customer(12,"diego","351237552","di@gmail.com","Avenida siempre viva 231",false);
        Customer c3 = new Customer();
        c3.setName("Jorge");
        c3.setAddress("Sipe sipe");
        c3.setEmail("tercero@hotmail.com");
        
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        return customers;
    }
}
