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
public class Plato {
   private String nombre;
   private String tipo;
   private double precio;
   private Receta receta;

    public Plato(String nombre, String tipo, double precio, Receta receta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.receta = receta;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   @Override
    public String toString() {
        String resultado="";
        
        resultado+= "Nombre: " + this.nombre+"\n";
        resultado+= "Tipo: " + this.tipo+"\n";
        resultado+= "Precio: " + this.precio+"\n";
        resultado+= "Receta\n" + this.receta+"\n";
        
        return resultado;
    }
    
    
}
