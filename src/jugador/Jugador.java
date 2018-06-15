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
    
    public void introduccion(){
        System.out.println("En un planeta donde se combinan dos grandes historias: "
                + "\nel maravilloso mundo de Harry Potter y una galaxia muy muy lejana de Star Wars"
                + "\nExisten tres razas, y cada uno debera seleccionar una sola"
                + "\nMago: Debil ataque, recoleccion promedio."
                + "\nDarkSider: Fuerte ataque, baja recoleccion."
                + "\nMuggle: Rapidos recolectando, promedio en todo lo demas\n"
                + "para recolectar debe tener creadas los tres tipos de recolector.");
    }

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
