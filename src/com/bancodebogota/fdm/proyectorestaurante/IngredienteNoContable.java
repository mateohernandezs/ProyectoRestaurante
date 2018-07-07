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
public class IngredienteNoContable extends IngredienteSolido {
    private int peso;
    
    public IngredienteNoContable(String nombre, int peso) {
        super(nombre);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        String resultado="Nombre: " + super.getNombre() + ", Cantidad: " + this.peso;        
        return resultado;
    }
    
}
