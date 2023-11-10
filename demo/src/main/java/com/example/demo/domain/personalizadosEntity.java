package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
public class personalizadosEntity {
    public personalizadosEntity (){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String nombre;
    private Integer precio;
    
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

    public personalizadosEntity(String tipo, String nombre, Integer precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "personalizadosEntity [id=" + id + ", tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

}
