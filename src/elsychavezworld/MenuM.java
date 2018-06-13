/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsychavezworld;

import edificaciones.Edificaciones;
import edificaciones.ListaEdificaciones;
import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.InputMismatchException;
import java.util.Scanner;
import milicia.ListaMilicia;
import milicia.Milicia;
import vehiculos.ListaVehiculos;
import vehiculos.Vehiculos;

/**
 *
 * @author Ivis Chavez
 */
public class MenuM {
   private static MenuM menum;

    private MenuM() {
    }

    public static MenuM getInstance() {
        if (menum == null) {
            menum = new MenuM();
        }
        
        return menum;
    }

    public void escogerMuggle() {
        System.out.println("***Menu jugador muggle***");
        System.out.println("1. Construir");
        System.out.println("2. Recolectar");
        System.out.println("3. Armar vehiculo");
        System.out.println("4. Entrenar tropas");
        System.out.println("5. Atacar enemigo");
        System.out.println("6. Defender territorio");
        System.out.println("7. Mostrar");
        System.out.println("8. Terminar Turno");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
    }

    public void menum() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);
//        AbstractFactory factoryE, factoryM, factoryRe,factoryVe;
//        
//        factoryE =  FactoryProducer.getFactory("edificacion");
//        factoryM =  FactoryProducer.getFactory("milicia");
//        factoryRe =  FactoryProducer.getFactory("recursos");
//        factoryVe =  FactoryProducer.getFactory("vehiculo");

        ListaMilicia listaMili = new ListaMilicia();
        ListaVehiculos listaVehi = new ListaVehiculos();
        ListaEdificaciones listaEdi = new ListaEdificaciones(); 
        
        listaEdi.agregarCentroMandoMuggle();
        
        while (x != 8) {
            escogerMuggle();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de mauggles");
                        System.out.println("2. Construir recolector de dinero");
                        System.out.println("3. Construir recolector de credito");
                        System.out.println("4. Construir recolector de cupones");
                        System.out.println("5. Construir fabrica de avionetas");
                        System.out.println("6. Construir fabrica de tanques");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        if(y == 1){
                            listaEdi.agregarCuartelMuggle();
                        }
                        else if(y == 2){
                            listaEdi.agregarRecolectorDinero();
                        }
                        else if(y == 3){
                            listaEdi.agregarRecolectorCredito();
                        }
                        else if(y == 4){
                            listaEdi.agregarRecolectorCupon();
                        }
                        else if(y == 5){
                            listaEdi.agregarFabricaAvioneta();
                        }
                        else if(y == 6){
                            listaEdi.agregarFabricaTanque();
                        }
                        break;
                    case 2:
                        System.out.println("1. Recolectar dinero");
                        System.out.println("2. Recolectar credito");
                        System.out.println("3. Recolectar cupones");
                        System.out.println("Deseo recolectar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Recolectando dinero");;
                        }
                        else if(y == 2){
                            System.out.println("Recolectando credito");
                        }
                        else if(y == 3){
                            System.out.println("Recolectando cupones");
                        }
                        break;
                    case 3:
                        System.out.println("1. Armar avioneta");
                        System.out.println("2. Armar tanque");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Armando avioneta");
                            listaVehi.agregarAvioneta();
                        }
                        else if(y == 2){
                            System.out.println("Armando tanque");
                            listaVehi.agregarTanque();
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de muggles");
                        System.out.println("2. Entrenar especialista muggle");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Entrenando escuadron muggle");
                            listaMili.agregarEscuadronMuggle();
                        }
                        else if(y == 2){
                            System.out.println("Entrenando especialista muggle");
                            listaMili.agregarEspecialistaMuggle();
                        }
                        break;
                    case 5:
                        System.out.println("Atacando");
                        break;
                    case 6:
                        System.out.println("Defendiendo");
                        break;
                    case 7:
                        System.out.println("1. Ver edificaciones");
                        System.out.println("2. Ver recursos");
                        System.out.println("3. Mostrar tropas");
                        System.out.println("Deseo ver: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Mostrando edificios");
                        }
                        else if(y == 2){
                            System.out.println("Mostrando recursos");
                        }
                        else if(y == 3){
                            System.out.println("Mostrando tropas");
                        }
                        break;       
                    case 8:
                        System.out.println("***Termina turno***");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debes ingresar un # entero");
                M.nextLine();
            }
        }
    }
}
