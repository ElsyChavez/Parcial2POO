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
public class CentroMandoDark implements Edificaciones{
    int vida = 10000;
    String name = "Centro Mando Dark";
    @Override
    public void construir(){
        System.out.println("Construyendo Edificio mas importante de la raza DarkSider");
    }
    @Override
    public String getName(){
        return name;
    }
}
