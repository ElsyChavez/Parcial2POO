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
public class EscuadronMuggle implements Milicia{
    @Override
    public void entrenar(){
        System.out.println("Entrenando escuadron de muggles");
    }
    
    @Override
    public void atacar(){
        System.out.println("Escuadron de muggles atacando al enemigo");
    }
    
    @Override
    public void defender(){
        System.out.println("Escuadron de muggles defendiendo territorio");
    }
    
}
