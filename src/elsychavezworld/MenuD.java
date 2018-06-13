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
public class MenuD {
    private static MenuD menud;

    private MenuD() {
    }

    public static MenuD getInstance() {
        if (menud == null) {
            menud = new MenuD();
        }
        
        return menud;
    }

    public void escogerMago() {
        System.out.println("***Menu jugador dark sider***");
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

    public void menud() {
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
        
        listaEdi.agregarCentroMandoDark();
        
        while (x != 8) {
            escogerMago();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de magos");
                        System.out.println("2. Construir recolector de sangre");
                        System.out.println("3. Construir recolector de diente de dragon");
                        System.out.println("4. Construir recolector de veneno");
                        System.out.println("5. Construir fabrica de naves");
                        System.out.println("6. Construir fabrica de juggernauts");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        if(y == 1){
                            listaEdi.agregarCuartelDark();
                        }
                        else if(y == 2){
                            listaEdi.agregarRecolectorSangre();
                        }
                        else if(y == 3){
                            listaEdi.agregarRecolectorDienteDragon();
                        }
                        else if(y == 4){
                            listaEdi.agregarRecolectorVeneno();
                        }
                        else if(y == 5){
                            listaEdi.agregarFabricaNave();
                        }
                        else if(y == 6){
                            listaEdi.agregarFabricaJuggernaut();
                        }
                        break;
                    case 2:
                        System.out.println("1. Recolectar sangre");
                        System.out.println("2. Recolectar diente de dragon");
                        System.out.println("3. Recolectar veneno");
                        System.out.println("Deseo recolectar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Recolectando sangre");;
                        }
                        else if(y == 2){
                            System.out.println("Recolectando diente de dragon");
                        }
                        else if(y == 3){
                            System.out.println("Recolectando veneno");;
                        }
                        break;
                    case 3:
                        System.out.println("1. Armar nave");
                        System.out.println("2. Armar juggernaut");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Armando nave");
                            listaVehi.agregarNave();
                        }
                        else if(y == 2){
                            System.out.println("Armando juggernaut");
                            listaVehi.agregarJuggernaut();
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de darksiders");
                        System.out.println("2. Entrenar especialista darksider");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Entrenando escuadron dark");
                            listaMili.agregarEscuadronDark();
                        }
                        else if(y == 2){
                            System.out.println("Entrenando especialista dark");
                            listaMili.agregarEspecialistaDark();
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
