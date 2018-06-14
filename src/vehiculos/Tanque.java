/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Ivis Chavez
 */
public class Tanque implements Vehiculos{
    int vida = 500;
    
    public String toString(){
        return "Tanque-> Vida = "+vida;
    }
    
    @Override
    public void armar(){
        System.out.println("Haciendo tanque");
    }
    
}
