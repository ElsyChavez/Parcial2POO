/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsychavezworld;

import java.util.Random;
import jugador.Jugador;

/**
 *
 * @author elsyc
 */
public class ElsyChavezWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        

        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        if(n == 1){
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            }
        else if(n == 2){
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            }
        
        if(n == 1){
            if(jugador1.getNombreRaza().equals("mago")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menu = Menu.getInstance();
                menu.menu();
            }
            else if(jugador1.getNombreRaza().equals("darksider")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menud = Menu.getInstance();
                menud.menud();
            }
            else if(jugador1.getNombreRaza().equals("muggle")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menum = Menu.getInstance();
                menum.menum();
            }
            if(jugador2.getNombreRaza().equals("mago")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menu = Menu.getInstance();
                menu.menu();
            }
            else if(jugador2.getNombreRaza().equals("darksider")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menud = Menu.getInstance();
                menud.menud();
            }
            else if(jugador2.getNombreRaza().equals("muggle")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menum = Menu.getInstance();
                menum.menum();
            }
        }
        else if(n == 2){
            if(jugador2.getNombreRaza().equals("mago")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menu = Menu.getInstance();
                menu.menu();
            }
            else if(jugador2.getNombreRaza().equals("darksider")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menud = Menu.getInstance();
                menud.menud();
            }
            else if(jugador2.getNombreRaza().equals("muggle")){
                System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                Menu menum = Menu.getInstance();
                menum.menum();
            }
            if(jugador1.getNombreRaza().equals("mago")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menu = Menu.getInstance();
                menu.menu();
            }
            else if(jugador1.getNombreRaza().equals("darksider")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menud = Menu.getInstance();
                menud.menud();
            }
            else if(jugador1.getNombreRaza().equals("muggle")){
                System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                Menu menum = Menu.getInstance();
                menum.menum();
            }
        }
        
//      if(jugador.getNombreRaza() == "mago"){
//          Menu menu = Menu.getInstance();
//          menu.menu();
//       }

//            MenuD menud = MenuD.getInstance();
//            menud.menud();
        

    }
}
    
