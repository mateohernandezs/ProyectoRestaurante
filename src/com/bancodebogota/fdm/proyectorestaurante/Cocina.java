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
public class Cocina {
    private String especialidad;
    private String direccion;
    private String telefono;
    private String jefeCocina;
    private Ingrediente[] inventario;
    private Plato[] menu;
    
    public Cocina(String especialidad, String direccion, String telefono, String jefeCocina, Ingrediente[] inventario, Plato[] menu) {
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jefeCocina = jefeCocina;
        this.inventario = inventario;
        this.menu = menu;
    }
    
    public Ingrediente[] getInventario() {
        return inventario;
    }

    public void setInventario(Ingrediente[] inventario) {
        this.inventario = inventario;
    }

    public Plato[] getMenu() {
        return menu;
    }

    public void setMenu(Plato[] menu) {
        this.menu = menu;
    }    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }  
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getJefeCocina() {
        return jefeCocina;
    }

    public void setJefeCocina(String jefeCocina) {
        this.jefeCocina = jefeCocina;
    }

    @Override
    public String toString() {
        String resultado = "******* Cocina creada *******\n\n";
        
        resultado+= "Especialidad: " + this.especialidad+"\n";
        resultado+= "Dirección: " + this.direccion+"\n";
        resultado+= "Telefono: " + this.telefono+"\n";
        resultado+= "Jefe Cocina: " + this.jefeCocina+"\n";
        
        resultado += "\n******* Inventario de ingredientes *******\n\n";
        
        for (Ingrediente ingrediente : this.inventario) {
            resultado += ingrediente+"\n";
        }
        
         resultado += "\n******* Platos del Menu *******\n\n";
        
        for (Plato plato : this.menu) {
            resultado += plato+"\n";
        }
        
        
        
        
        return resultado;
        





    }
    
    
}
