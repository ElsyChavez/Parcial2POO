/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author elsyc
 */
public class EscuadronesMagos implements Milicia{
    int vida = 1000, danio = 200;
    String name = "Escuadron Mago";
    
    @Override
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "Escuadron mago-> Vida = " +vida+ ", Danio = " +danio;
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
        System.out.println("Entrenando escuadron de magos");
    }
    
    @Override
    public void atacar(){
        System.out.println("Escuadron de magos atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Escuadron de magos defendiendo territorio");
    }
}
