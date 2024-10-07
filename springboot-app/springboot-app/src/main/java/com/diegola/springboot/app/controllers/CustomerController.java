package com.diegola.springboot.app.controllers;

import com.diegola.springboot.app.models.Customer;
import com.diegola.springboot.app.models.dao.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    @Qualifier("clienteDaoJPA")
    // Implementamos inyection
    private ICustomerDao customerDao;

    @RequestMapping(value="listar", method=RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes",customerDao.findAll());
        return "listar";
    }


    private List<Customer> customers = new ArrayList<>();

    public CustomerController(){
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
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        for (Customer dto : customers) {
            if(dto.getId()!=null && dto.getId().equals(id)){
                customers.remove(dto);
                break;
            }
        }
    }
    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer dto){
        customers.add(dto);
    }


    @PutMapping("/customer/{id}")
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer dto){
        for (Customer customer : customers) {
            if(customer.getId().equals(id)){
                customer.setName(dto.getName());
                customer.setTelphone(dto.getTelphone());
            }
        }
    }

    @GetMapping("/customer/search")
    public List<Customer> searchCustomer(@RequestParam("email") String email){
        List<Customer> searchResult = new ArrayList<>();
        for (Customer customer : customers) {
            if(customer.getEmail().contains(email)){
                searchResult.add(customer);;
            }
        }
        return searchResult;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customers;
    }


}
