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
public class CuartelMagos implements Edificaciones{
    int vida = 1000;
    String name = "Cuartel Magos";

    @Override
    public void construir(){
        System.out.println("Construyendo lugar de entrenamiento de tropas");
    }
    @Override
    public String getName(){
        return name;
    }
}
