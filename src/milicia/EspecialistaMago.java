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
public class EspecialistaMago implements Milicia {
    int vida = 1500, danio = 500;
    @Override
    public void entrenar(){
        System.out.println("Entrenando especialista mago");
    }
    
    @Override
    public void atacar(){
        System.out.println("Especialista mago atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Especialista mago defendiendo territorio");
    }
}
