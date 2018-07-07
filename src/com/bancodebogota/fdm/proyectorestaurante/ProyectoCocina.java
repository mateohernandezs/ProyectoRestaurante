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

public class ProyectoCocina {

    Cliente cliente;
    Cocina cocina;
    Ingrediente ingrediente;
    IngredienteContable ingredienteContable;
    IngredienteNoContable ingredienteNoContable;
    IngredienteLiquido ingredienteLiquido;
    IngredienteSolido ingredienteSolido;
    Plato platoSancocho;
    Plato platoBandejaPaisa;
    Pedido pedido;
    Ingrediente[] inventario;
    Receta recetaSancocho;
    Receta recetaBandejaPaisa;

    public Ingrediente crearIngrediente(String nombre, boolean solido, boolean contable, int cantidadPeso) {
        if (solido && contable) {
            return this.ingredienteContable = new IngredienteContable(cantidadPeso, nombre);
        } else if (solido && !contable) {
            return this.ingredienteNoContable = new IngredienteNoContable(nombre, cantidadPeso);
        } else if (!solido) {
            return this.ingredienteLiquido = new IngredienteLiquido(nombre, cantidadPeso);
        }
        return null;
    }

    public void crearCocina() {
        Plato[] menu = new Plato[2];
        menu[0]= this.platoSancocho;
        menu[1]= this.platoBandejaPaisa;
        this.cocina = new Cocina("Colombiana", "Calle 10 El poblado", "3589678", "Mateo", this.inventario,menu);

    }

    public void crearInventario() {
        this.inventario = new Ingrediente[11];
        this.inventario[0] = crearIngrediente("Papa", true, true, 5);
        this.inventario[1] = crearIngrediente("Yuca", true, true, 4);
        this.inventario[2] = crearIngrediente("Solomo", true, false, 4);
        this.inventario[3] = crearIngrediente("Agua", false, false, 2);
        this.inventario[4] = crearIngrediente("Platano", true, true, 5);

        this.inventario[5] = crearIngrediente("Frijoles", true, false, 10);
        this.inventario[6] = crearIngrediente("Arroz", true, false, 5);
        this.inventario[7] = crearIngrediente("Chorizo", true, true, 4);
        this.inventario[8] = crearIngrediente("Chicharron", true, true, 0);
        this.inventario[9] = crearIngrediente("Jugo", false, false, 2);
        this.inventario[10] = crearIngrediente("Platano", true, true, 5);
    }

    public void crearRecetas() {

        Ingrediente[] ingredientesRecetaSancocho = new Ingrediente[5];
        ingredientesRecetaSancocho[0] = crearIngrediente("Papa", true, true, 3);
        ingredientesRecetaSancocho[1] = crearIngrediente("Yuca", true, true, 2);
        ingredientesRecetaSancocho[2] = crearIngrediente("Solomo", true, false, 3);
        ingredientesRecetaSancocho[3] = crearIngrediente("Agua", false, false, 1);
        ingredientesRecetaSancocho[4] = crearIngrediente("Platano", true, true, 2);
        this.recetaSancocho = new Receta("Sancocho", ingredientesRecetaSancocho);

        Ingrediente[] ingredientesRecetaFrijoles = new Ingrediente[6];
        ingredientesRecetaFrijoles[0] = crearIngrediente("Frijoles", true, false, 10);        
        ingredientesRecetaFrijoles[1] = crearIngrediente("Arroz", true, false, 1);
        ingredientesRecetaFrijoles[2] = crearIngrediente("Chorizo", true, true, 1);
        ingredientesRecetaFrijoles[3] = crearIngrediente("Chicharron", true, true, 1);
        ingredientesRecetaFrijoles[4] = crearIngrediente("Jugo", false, false, 1);
        ingredientesRecetaFrijoles[5] = crearIngrediente("Platano", true, true, 1);

        this.recetaBandejaPaisa = new Receta("Media Bandeja Paisa", ingredientesRecetaFrijoles);
    }

    public void crearPlato() {
        this.platoSancocho = new Plato("Sancocho de Res", "Completo", 12000, this.recetaSancocho);
        this.platoBandejaPaisa = new Plato("Media Bandeja Paisa", "Media", 15000, this.recetaBandejaPaisa);

    }

    public void crearPedidoSancocho() {
        Plato[] platosPedido = new Plato[1];
        int cantidadReceta, inventarioCantidad;
        double cantidadRecetaLitros, inventarioCantidadLitros;
        String nombreIngredienteReceta, nombreIngredienteInventario;
        for (Ingrediente ingrediente1 : this.platoSancocho.getReceta().getIngredientes()) {
            for (Ingrediente inventario1 : this.inventario) {
                if (ingrediente1 instanceof IngredienteContable && inventario1 instanceof IngredienteContable) {
                    cantidadReceta = ((IngredienteContable) ingrediente1).getCantidad();
                    inventarioCantidad = ((IngredienteContable) inventario1).getCantidad();
                    nombreIngredienteReceta = ((IngredienteContable) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteContable) inventario1).getNombre();
                    if (cantidadReceta > inventarioCantidad && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoSancocho.getNombre());
                        return;
                    } 
                } else if (ingrediente1 instanceof IngredienteNoContable && inventario1 instanceof IngredienteNoContable) {
                    cantidadReceta = ((IngredienteNoContable) ingrediente1).getPeso();
                    inventarioCantidad = ((IngredienteNoContable) inventario1).getPeso();
                    nombreIngredienteReceta = ((IngredienteNoContable) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteNoContable) inventario1).getNombre();
                    if (cantidadReceta > inventarioCantidad && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoSancocho.getNombre());
                        return;
                    } 
                } else if (ingrediente1 instanceof IngredienteLiquido && inventario1 instanceof IngredienteLiquido) {
                    cantidadRecetaLitros = ((IngredienteLiquido) ingrediente1).getLitros();
                    inventarioCantidadLitros = ((IngredienteLiquido) inventario1).getLitros();
                    nombreIngredienteReceta = ((IngredienteLiquido) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteLiquido) inventario1).getNombre();
                    if (cantidadRecetaLitros > inventarioCantidadLitros && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoSancocho.getNombre());
                        return;
                    } 
                }
            }
        }
        platosPedido[0] = this.platoSancocho;
        this.pedido = new Pedido(platosPedido,this.cliente);
    }

    
    public void crearPedidoBandejaPaisa() {
        Plato[] platosPedido = new Plato[1];
        int cantidadReceta, inventarioCantidad;
        double cantidadRecetaLitros, inventarioCantidadLitros;
        String nombreIngredienteReceta, nombreIngredienteInventario;
        for (Ingrediente ingrediente1 : this.platoBandejaPaisa.getReceta().getIngredientes()) {
            for (Ingrediente inventario1 : this.inventario) {
                if (ingrediente1 instanceof IngredienteContable && inventario1 instanceof IngredienteContable) {
                    cantidadReceta = ((IngredienteContable) ingrediente1).getCantidad();
                    inventarioCantidad = ((IngredienteContable) inventario1).getCantidad();
                    nombreIngredienteReceta = ((IngredienteContable) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteContable) inventario1).getNombre();
                    if (cantidadReceta > inventarioCantidad && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoBandejaPaisa.getNombre());
                        return;
                    } 
                } else if (ingrediente1 instanceof IngredienteNoContable && inventario1 instanceof IngredienteNoContable) {
                    cantidadReceta = ((IngredienteNoContable) ingrediente1).getPeso();
                    inventarioCantidad = ((IngredienteNoContable) inventario1).getPeso();
                    nombreIngredienteReceta = ((IngredienteNoContable) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteNoContable) inventario1).getNombre();
                    if (cantidadReceta > inventarioCantidad && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoBandejaPaisa.getNombre());
                        return;
                    } 
                } else if (ingrediente1 instanceof IngredienteLiquido && inventario1 instanceof IngredienteLiquido) {
                    cantidadRecetaLitros = ((IngredienteLiquido) ingrediente1).getLitros();
                    inventarioCantidadLitros = ((IngredienteLiquido) inventario1).getLitros();
                    nombreIngredienteReceta = ((IngredienteLiquido) ingrediente1).getNombre();
                    nombreIngredienteInventario = ((IngredienteLiquido) inventario1).getNombre();
                    if (cantidadRecetaLitros > inventarioCantidadLitros && nombreIngredienteReceta.equals(nombreIngredienteInventario)) {                       
                        System.out.println("No hay suficiente " + nombreIngredienteReceta + " para preparar " + this.platoBandejaPaisa.getNombre());
                        return;
                    } 
                }
            }
        }
        platosPedido[0] = this.platoBandejaPaisa;
        this.pedido = new Pedido(platosPedido,this.cliente);
    }

    
    public void crearCliente() {        
        this.cliente = new Cliente("Teo", "Hernandez");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProyectoCocina m = new ProyectoCocina();
        m.crearInventario();
        m.crearRecetas();
        m.crearPlato();        
        m.crearCocina();
        
        System.out.println(m.cocina);
        m.crearCliente();
        System.out.println(m.cliente);
        m.crearPedidoSancocho();
        System.out.println(m.pedido);
        m.crearPedidoBandejaPaisa();

    }

}
