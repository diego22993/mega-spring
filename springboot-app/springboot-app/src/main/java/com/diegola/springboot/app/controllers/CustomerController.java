package com.diegola.springboot.app.controllers;

import com.diegola.springboot.app.models.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    public CustomerController(){
        Customer c1 = new Customer();
        c1.setId(1);
        c1.setName("Rogelio");
        c1.setAddress("El mundo");
        c1.setEmail("no_tiene@yahoo.com");

        Customer c2 = new Customer(12,"diego","351237552","di@gmail.com","Avenida siempre viva 231",false);

        Customer c3 = new Customer();
        c3.setId(3);
        c3.setName("Jorge");
        c3.setAddress("Sipe sipe");
        c3.setEmail("tercero@hotmail.com");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        for (Customer dto : customers) {
            if(dto.getId().equals(id)){
                return dto;
            }
        }
        return null;
    }
    @GetMapping("/customer/0")
    public void insertCustomer(Customer dto){
        if(dto.getId()!=null && dto.getId().equals(100)){
            System.out.println("ERROR: Ya existe");
        }else{
            System.out.println("Implementar lógica de insercion...");
        }
    }
    @GetMapping("/customer/22")
    public void deleteCustomer(Customer dto){
        if(dto.getId()!=null && dto.getIsDeleted().equals(false) && dto.getId().equals(22)){
            dto.setIsDeleted(true);
            System.out.println("Implementamos lógica de BAJA --> actualizamos la bandera...");
        }else{
            System.out.println("ERROR: Ya se encuentra dado de baja");
        }
    }
    @GetMapping("/customer/333")
    public void updateCustomer(Customer dto){
        if(dto.getId()!=null && dto.getIsDeleted().equals(false) && dto.getId().equals(333)){
            dto.setName("Implementacion de UPDATE!");
        }else{
            System.out.println("ERROR: No existe");
        }
    }
    @GetMapping("/customer")
    public List<Customer> searchCustomer(Customer dto){
        if(dto.getId()!=null && dto.getIsDeleted().equals(false) && dto.getId().equals(12)){
            dto.setName("Implementacion de SEARCH!");
        }else{
            System.out.println("ERROR: No existe");
        }
        return new ArrayList<>();
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
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
