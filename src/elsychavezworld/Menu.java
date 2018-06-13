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
 * @author elsyc
 */
public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        
        return menu;
    }

    public void escogerMago() {
        System.out.println("***Menu jugador mago***");
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

    public void menu() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);
//        AbstractFactory factoryE, factoryM, factoryRe,factoryVe;
        
//        factoryE =  FactoryProducer.getFactory("edificacion");
//        factoryM =  FactoryProducer.getFactory("milicia");
//        factoryRe =  FactoryProducer.getFactory("recursos");
//        factoryVe =  FactoryProducer.getFactory("vehiculo");
        ListaMilicia listaMili = new ListaMilicia();
        ListaVehiculos listaVehi = new ListaVehiculos();
        ListaEdificaciones listaEdi = new ListaEdificaciones(); 
        
        listaEdi.agregarCentroMandoMago();
        

        while (x != 8) {
            escogerMago();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de magos");
                        System.out.println("2. Construir recolector de galeones");
                        System.out.println("3. Construir recolector de sickles");
                        System.out.println("4. Construir recolector de knuts");
                        System.out.println("5. Construir fabrica de escobas");
                        System.out.println("6. Construir fabrica de auto volador");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        if(y == 1){
                            listaEdi.agregarCuartelMagos();
                        }
                        else if(y == 2){
                            listaEdi.agregarRecolectorGaleon();
                        }
                        else if(y == 3){
                            listaEdi.agregarRecolectorSickle();
                        }
                        else if(y == 4){
                            listaEdi.agregarRecolectorKnuts();
                        }
                        else if(y == 5){
                            listaEdi.agregarFabricaEscoba();
                        }
                        else if(y == 6){
                            listaEdi.agregarFabricaAutoVolador();
                        }
                        break;
                    case 2:
                        System.out.println("1. Recolectar galeones");
                        System.out.println("2. Recolectar sickles");
                        System.out.println("3. Recolectar knuts");
                        System.out.println("Deseo recolectar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Recolectando Galeones");;
                        }
                        else if(y == 2){
                            System.out.println("Recolectando Sickles");
                        }
                        else if(y == 3){
                            System.out.println("Recolectando Knuts");;
                        }
                        break;
                    case 3:
                        System.out.println("1. Armar escoba");
                        System.out.println("2. Armar autovolador");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Armando escoba");
                            listaVehi.agregarEscoba();
                        }
                        else if(y == 2){
                            System.out.println("Armando auto volador");
                            listaVehi.agregarAutoVolador();
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de magos");
                        System.out.println("2. Entrenar especialista mago");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Entrenando escuadron mago");
                            listaMili.agregarEscuadronMagos();
                        }
                        else if(y == 2){
                            System.out.println("Entrenando especialista mago");
                            listaMili.agregarEspecialistaMago();
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
