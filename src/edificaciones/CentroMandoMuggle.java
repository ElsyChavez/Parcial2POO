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
public class CentroMandoMuggle implements Edificaciones{
    int vida = 10000;
    String name = "Centro Mando Muggle";
    @Override
    public void construir(){
        System.out.println("Construyendo edificio mas importante de la raza DarkSider");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
