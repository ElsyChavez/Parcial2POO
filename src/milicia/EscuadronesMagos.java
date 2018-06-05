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
    @Override
    public void atacar(){
        System.out.println("Atacando al enemigo...");
    }
    
    @Override
    public void defender(){
        System.out.println("Defendiendo territorio propio...");
    }
}
