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
public class IngredienteLiquido extends Ingrediente {
    private double litros;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    
    public IngredienteLiquido(String nombre, double litros) {
        super(nombre);
        this.litros = litros;
    }
    
    @Override
    public String toString() {
        String resultado="Nombre: " + super.getNombre() + ", Litros: " + this.litros;        
        return resultado;
    }
}
