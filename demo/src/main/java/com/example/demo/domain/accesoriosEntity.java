package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class accesoriosEntity {

    public accesoriosEntity (){

    } 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tipo;
    private String material;
    private Integer precio;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public accesoriosEntity(String nombre, String tipo, String material, Integer precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
       this.precio = precio;
    }

    @Override
    public String toString() {
        return "accesoriosEntity [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", material=" + material
                + ", Precio=" + precio + "]";
    }


}
