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
    int galeon, sickle, knut;
   
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
            return "Fabrica de Escoba-> Vida = "+vida;
    }

    @Override
    public void construir(){
        System.out.println("Construyendo fabrica de vehiculos 1, principal");
    }
    @Override
    public String getName(){
        return name;
    }
}
