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
public class FabricaAutoVolador implements Edificaciones{
    int vida = 1000;
    String name = "Fabrica Auto Volador";
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
    
    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida){
        this.galeon = recu1;
        this.sickle = recu2;
        this.knut = recu3;
        this.vida = vida;
    }
    
    public String toString() {
            return "Fabrica de Auto Volador-> Vida = "+vida;
    }

    @Override
    public void construir(){
        System.out.println("Construyendo fabrica de vehiculos 2, secundario");
    }
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void actualizarVida(int vida){
        this.vida = vida;
    }
    
}
