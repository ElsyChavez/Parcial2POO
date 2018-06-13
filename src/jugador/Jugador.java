/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ivis Chavez
 */
public class Jugador {
    private String nombre, nombreRaza;
    private int n;
    int raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    public void CreadorJugador(){
        AbstractFactory factoryR;
        factoryR =  FactoryProducer.getFactory("raza");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Elige tu raza: ");
        System.out.println("1. Mago");
        System.out.println("2. Dark Sider");
        System.out.println("3. Muggle");
        System.out.println("Raza: ");
        raza = leer.nextInt();
        
        
        if(raza == 1){
            nombreRaza = "mago";
        }
        else if(raza == 2){
            nombreRaza = "darksider";
                    }
        else if(raza == 3){
            nombreRaza = "muggle";
        }
        
    }
    
    
}
