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
public class Avioneta implements Vehiculos{
    int vida = 500;
    int danio = 400;
    String name = "Avioneta";
    
    @Override 
    public String getName(){
        return name;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override 
    public int getDanio(){
        return danio;
    }
    
    @Override 
    public void actualizarVida(int vida){
        this.vida = vida;
    }
    
    public String toString(){
        return "Avioneta-> Vida = "+vida+", Danio = "+danio;
    }
    
    @Override
    public void armar(){
        System.out.println("Haciendo avioneta");
    }
    
}
