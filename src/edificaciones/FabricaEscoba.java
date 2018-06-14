/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

/**
 *
 * @author elsyc
 */
public class FabricaEscoba implements Edificaciones{
    int vida = 1000;
    String name = "Fabrica Escoba";
    @Override
    public void construir(){
        System.out.println("Construyendo fabrica de vehiculos 1, principal");
    }
    @Override
    public String getName(){
        return name;
    }
}
