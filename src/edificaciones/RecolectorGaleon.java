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
    int vida = 1000;
    String name = "Recolector Galeon";
    int galeon = 0, sickle, knut;
   
    @Override
    public int getRecurso1(){
        return galeon;
    }
    
    @Override
    public int getRecurso2(){
        return sickle;
    }
    
    @Override
    public int getRecurso3(){
        return knut;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    public String toString() {
            return "Recolector Galeon-> Recursos: Galeon("+galeon+"). Vida = "+vida;
    }

    @Override
    public void construir(){
        System.out.println("Construyendo recolector 1, principal");
    }
    @Override
    public String getName(){
        return name;
    }
}
