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
public class EscuadronDark implements Milicia{
    int vida = 1000, danio = 500;
    String name = "Escuadron Dark";
    
    public String getName(){
        return name;
    }
    
    public String toSring(){
        return "Escuadron Dark-> Vida = " +vida+ ", Danio = " +danio;
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
        System.out.println("Entrenando escuadron de DarkSiders");
    }
    
    @Override
    public void atacar(){
        System.out.println("Escuadron Dark atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Escuadron Dark defendiendo territorio");
    }
    
}
