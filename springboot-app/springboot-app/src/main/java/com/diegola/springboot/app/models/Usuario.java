package com.diegola.springboot.app.models;

public class Usuario {
    private String nombre;
    private String mail;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String apellido) {
        this.mail = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                '}';
    }
}
