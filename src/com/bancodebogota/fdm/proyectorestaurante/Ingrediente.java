/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.proyectorestaurante;

/**
 *
 * @author admin
 */
public class Ingrediente {
    private String nombre;  

    public Ingrediente(String nombre) {
        this.nombre = nombre;        
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    @Override
    public String toString() {
        return "Ingrediente creado"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
