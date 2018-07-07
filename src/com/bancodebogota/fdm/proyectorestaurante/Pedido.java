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
public class Pedido {
    private Plato[] platos;
    private Cliente cliente;

    
    public Pedido(Plato[] platos, Cliente cliente) {
        this.platos = platos;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    @Override
    public String toString() {
        String resultado="*****Pedido*****\n\n";
        for (Plato plato : this.platos) {
            resultado += plato+"\n";
        }
        
        return resultado;
    }

   

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }
}
