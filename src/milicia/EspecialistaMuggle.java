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
public class EspecialistaMuggle implements Milicia{
    int vida = 1500, danio = 600;
    String name = "Especialista Muggle";
    
    @Override
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "Especialista Muggle-> Vida = " +vida+ ", Danio = " +danio;
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
        System.out.println("Entrenando especialista muggle");
    }
    
    @Override
    public void atacar(){
        System.out.println("Especialista muggle atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Especialista muggle defendiendo territorio");
    }
    
}
