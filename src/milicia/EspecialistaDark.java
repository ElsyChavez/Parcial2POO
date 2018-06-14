/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author Ivis Chavez
 */
public class EspecialistaDark implements Milicia{
    int vida = 1500, danio = 700;
    String name = "Especialista Dark";
    
    @Override
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "Especialista Dark-> Vida = " +vida+ ", Danio = " +danio;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    @Override
    public int getDanio(){
        return danio;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Entrenando especialista DarkSider");
    }
    
    @Override
    public void atacar(){
        System.out.println("Especialista Dark atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Especialista Dark defendiendo territorio");
    }
      
}
