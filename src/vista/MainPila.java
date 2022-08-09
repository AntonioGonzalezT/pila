/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.OperacionesPila;
import modelo.Pila;

/**
 *
 * @author antonio.gonzalez
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Productos> pilaP=new Pila<>();
        pilaP.apilar(new Productos("avena", 3, 5000));
        pilaP.apilar(new Productos("arroz", 2, 4000));
        pilaP.apilar(new Productos("carne", 4, 10000));
        pilaP.apilar(new Productos("limon", 6, 2000));
        pilaP.apilar(new Productos("cocacola", 1, 4500));
        
        
        System.out.println("Pila \n"+pilaP.toString());
        
        pilaP.desapilar();
        System.out.println("Pila Original\n"+pilaP.toString());


           
        Pila<Productos> pd=OperacionesPila.pilaDuplicada(pilaP);
        System.out.println("Pila Duplicada\n"+ pd.toString());
    }
    
}
