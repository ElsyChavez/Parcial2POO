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
public class CuartelDark implements Edificaciones{
    int vida = 1000;
    String name = "Cuartel Dark";
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
    
    public String toString() {
            return "Cuartel Dark-> Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo cuartel de la raza DarkSider");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
