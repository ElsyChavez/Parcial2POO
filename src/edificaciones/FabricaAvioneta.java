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
public class FabricaAvioneta implements Edificaciones{
    @Override
    public void construir(){
        System.out.println("Construyendo fabrica de vehiculo 1 de la raza DarkSider");
    }
    
}