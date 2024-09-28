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

    @RequestMapping("/usuarios")
    public ArrayList<Usuario> getUsuarios(){
        ArrayList<Usuario> listado = new ArrayList<>();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        u1.setId(100L);
        u1.setNombre("Rivaldo");
        u1.setApellido("Morales");
        u2.setId(200L);
        u2.setNombre("Cesar");
        u2.setApellido("Lovera");
        u3.setId(300L);
        u3.setNombre("Diogo");
        u3.setApellido("Heratia");

        listado.add(u1);
        listado.add(u2);
        listado.add(u3);

        return listado;
    }
}
