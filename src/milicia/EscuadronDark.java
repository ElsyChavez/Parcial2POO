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
