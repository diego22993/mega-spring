package com.diegola.springboot.app.controllers;

import com.diegola.springboot.app.models.Usuario;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value="/inicio")
    public String index(){
        HashMap<String,String> json = new HashMap<>();
        json.put("message","Status ok");
        json.put("data","hola mundo");
        return json.toString();
    }

    @RequestMapping("/perfil")
    public String getUsuario(Model model){
        Usuario usr = new Usuario();
        usr.setNombre("Diegola");
        usr.setMail("Heratia");
        model.addAttribute("usuario",usr);
        model.addAttribute("nombre",usr.getNombre().concat(usr.getMail()));
        return "/perfil";
    }
}
