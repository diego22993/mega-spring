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

    @GetMapping("/prueba")
    public String prueba(){
        return "hola mundo";
    }
    @GetMapping("/listado-string")
    public ArrayList<String> prueba2(){
        ArrayList<String> lis = new ArrayList<String>();
        lis.add("Hola");
        lis.add("como estás");
        lis.add("?");
        return lis;
    }

    @GetMapping("/map")
    public Map<String,String> prueba3(){
        Map<String,String> map = new HashMap();
        map.put("name","diogo");
        map.put("telphone","341992312");
        map.put("email","diego@gmail.com");
        map.put("address","Siempre viva 123");
        return map;
    }

    @GetMapping("/customer")
    public Object prueba4(){
        Customer c1 = new Customer();
        return c1;
    }
    @GetMapping("/customers")
    public List<Object> prueba5(){
        List<Object> customers = new ArrayList<>();
        Customer c1 = new Customer();
        c1.setName("Rogelio");
        c1.setAddress("El mundo");
        c1.setEmail("no_tiene@yahoo.com");
        Customer c2 = new Customer("diego","351237552","di@gmail.com","Avenida siempre viva 231");
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
