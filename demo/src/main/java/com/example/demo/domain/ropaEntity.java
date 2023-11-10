package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity

public class ropaEntity {

    public ropaEntity (){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String nombre;
    private Integer precio;
    private String talla;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public ropaEntity(String tipo, String nombre, Integer precio, String talla) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "ropaEntity [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + ", talla="
                + talla + "]";
    }

    
}
