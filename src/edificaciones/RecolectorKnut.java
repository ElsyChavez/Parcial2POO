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
public class RecolectorKnut implements Edificaciones{
    int vida = 1000;
    String name = "Recolector Knut";
    int galeon, sickle, knut = 0;
   
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
            return "Recolector Knut-> Recursos: Knut("+knut+"). Vida = "+vida;
    }
    @Override
    public void construir(){
        System.out.println("Construyendo recolector 2, secundario");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
