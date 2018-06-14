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
public class CentroMandoMagos implements Edificaciones{
    int vida = 10000;
    String name = "Centro Mando Magos";
    int galeon = 500, sickle = 1000, knut = 600;
   
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
            return "Centro de Mando Magos-> Recursos: Galeon("+galeon+"), Sickle(" +sickle+ "), Knut("+knut+"). Vida = "+vida;
    }
    @Override
    public void construir(){
        System.out.println("Construyendo Edificio mas importante de la raza magos");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
