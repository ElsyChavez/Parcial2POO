/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

import factory.AbstractFactory;

/**
 *
 * @author elsyc
 */
public class RecolectorGaleon implements Edificaciones{
    @Override
    public void construir(){
        System.out.println("Construyendo recolector 1, principal");
    }
}
