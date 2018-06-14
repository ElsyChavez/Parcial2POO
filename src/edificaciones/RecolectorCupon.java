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
public class RecolectorCupon implements Edificaciones{
    int vida = 1000;
    String name = "Recolector Cupon";

    @Override
    public void construir(){
        System.out.println("Construyendo recolector de recurso 3 de la raza Muggle");
    }
    @Override
    public String getName(){
        return name;
    }   
}
