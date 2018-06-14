/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author elsyc
 */
public class AutoVolador implements Vehiculos{
    int vida = 500;
    
    public String toString(){
        return "Auto volador-> Vida = "+vida;
    }
    
    @Override
    public void armar(){
        System.out.println("Haciendo auto volador");
    }
    
}
