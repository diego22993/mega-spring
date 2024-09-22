package com.diegola.springboot.app.controllers;

import com.diegola.springboot.app.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsuarioController {

    @RequestMapping("/usuario_id")
    public String getUsuario(){
        Usuario u1 = new Usuario();
        u1.setNombre("Random user-name xyz");
        u1.setApellido("Apellido Random por");
        return u1.toString();
    }

}
