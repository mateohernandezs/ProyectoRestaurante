/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectococina;

/**
 *
 * @author admin
 */
public class Receta {
    private String nombre;
    private Ingrediente[] ingredientes;    

    public Receta(String nombre, Ingrediente[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        
    }  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString() {
        String resultado="";
        
        resultado+= "Nombre: " + this.nombre+"\n";
        resultado += "Ingredientes de la receta:\n";
        for (Ingrediente ingrediente : this.ingredientes) {
            resultado += ingrediente+"\n";
        }
        
        return resultado;
    }
}
