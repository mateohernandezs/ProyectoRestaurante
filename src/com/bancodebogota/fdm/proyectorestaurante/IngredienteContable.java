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
public class IngredienteContable extends IngredienteSolido{
    private int cantidad;

    public IngredienteContable(int cantidad, String nombre) {
        super(nombre);
        this.cantidad = cantidad;
    }   
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public String toString() {
        String resultado="Nombre: " + super.getNombre() + ", Cantidad: " + this.cantidad;        
        return resultado;
    }
    
    
}
