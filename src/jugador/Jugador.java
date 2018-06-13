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
    private String nombre2, nombreRaza2;
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

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombreRaza2() {
        return nombreRaza2;
    }

    public void setNombreRaza2(String nombreRaza2) {
        this.nombreRaza2 = nombreRaza2;
    }
    
    
    
    public void primerMenuJugador1(){
        AbstractFactory factoryR;
        factoryR =  FactoryProducer.getFactory("raza");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***Bienvenido jugador 1***");
        System.out.println("Escribe tu nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Elige tu raza: ");
        System.out.println("1. Mago");
        System.out.println("2. Dark Sider");
        System.out.println("3. Muggle");
        System.out.println("Raza: ");
        raza = leer.nextInt();
        System.out.println("\n");
        
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
    
    
    public void primerMenuJugador2(){
        AbstractFactory factoryR;
        factoryR =  FactoryProducer.getFactory("raza");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***Bienvenido jugador 2***");
        System.out.println("Escribe tu nombre: ");
        nombre2 = leer.nextLine();
        
        System.out.println("Elige tu raza: ");
        System.out.println("1. Mago");
        System.out.println("2. Dark Sider");
        System.out.println("3. Muggle");
        System.out.println("Raza: ");
        raza = leer.nextInt();
        System.out.println("\n");
        
        if(raza == 1){
            nombreRaza2 = "mago";
        }
        else if(raza == 2){
            nombreRaza2 = "darksider";
                    }
        else if(raza == 3){
            nombreRaza2 = "muggle";
        }
        
    }
    
    public void random(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        if(n == 1){
            primerMenuJugador1();
            primerMenuJugador2();
        }
        else if(n == 2){
            primerMenuJugador2();
            primerMenuJugador1();
        }
    }
    
    
//    AbstractFactory factoryR;
//    Razas raza1 = factoryR.getRaza("muggle");
//    raza1.mostrarRaza();
    
}
