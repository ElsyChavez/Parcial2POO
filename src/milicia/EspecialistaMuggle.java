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
