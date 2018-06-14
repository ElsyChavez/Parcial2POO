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
    int galeon = 800, sickle = 1000, knut = 600;
   
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
    
    @Override
    public void actualizarVida(int vida){
        this.vida = vida;
    }
}
