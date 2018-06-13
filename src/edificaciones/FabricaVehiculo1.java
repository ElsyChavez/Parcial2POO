/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

/**
 *
 * @author Ivis Chavez
 */
public class FabricaVehiculo1 implements Edificaciones {
    int vida = 1000;
    @Override
    public void construir(){
        System.out.println("Construyendo edificio");
    }
    
}
