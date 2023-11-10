package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class figurasEntity {

    public figurasEntity (){
        
    } 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tamanio;
    private String referencia;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public figurasEntity(String nombre, String tamanio, String referencia, Integer precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.referencia = referencia;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "figurasEntity [id=" + id + ", nombre=" + nombre + ", tamanio=" + tamanio + ", referencia=" + referencia
                + ", precio=" + precio + "]";
    }

}
