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
public class FabricaJuggernaut implements Edificaciones{
    int vida = 1000;
    String name = "Fabrica Juggernaut";
    int sangre, dientedragon, veneno;
   
    @Override
    public int getRecurso1(){
        return sangre;
    }
    
    @Override
    public int getRecurso2(){
        return dientedragon;
    }
    
    @Override
    public int getRecurso3(){
        return veneno;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public void actualizarRecursos(int recu1, int recu2, int recu3, int vida){
        this.sangre = recu1;
        this.dientedragon = recu2;
        this.veneno = recu3;
        this.vida = vida;
    }
    
    public String toString() {
            return "Fabrica de juggernauts-> Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo fabrica de vehiculos 2 de la raza DarkSider");
    }
    @Override
    public String getName(){
        return name;
    }
}
