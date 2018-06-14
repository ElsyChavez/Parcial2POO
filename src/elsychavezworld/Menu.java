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
import java.util.Random;
import java.util.Scanner;
import jugador.Jugador;
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

    public void escoger() {
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
        
        ListaMilicia listaMiliM = new ListaMilicia();
        ListaVehiculos listaVehiM = new ListaVehiculos();
        ListaEdificaciones listaEdiM = new ListaEdificaciones(); 
        
        listaEdiM.agregarCentroMandoMago();
        
        while (x != 8) {
            escoger();
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
                            System.out.println("Construyendo cuartel de magos");
                            listaEdiM.agregarCuartelMagos();
                        }
                        else if(y == 2){
                            System.out.println("Construyendo recolector de galeones");
                            listaEdiM.agregarRecolectorGaleon();
                        }
                        else if(y == 3){
                            System.out.println("Construyendo recolector de sickles");
                            listaEdiM.agregarRecolectorSickle();
                        }
                        else if(y == 4){
                            System.out.println("Construyendo recolector de knuts");
                            listaEdiM.agregarRecolectorKnuts();
                        }
                        else if(y == 5){
                            System.out.println("Construyendo fabrica de escobas");
                            listaEdiM.agregarFabricaEscoba();
                        }
                        else if(y == 6){
                            System.out.println("Construyendo fabrica de autos voladores");
                            listaEdiM.agregarFabricaAutoVolador();
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
                            listaVehiM.agregarEscoba();
                        }
                        else if(y == 2){
                            System.out.println("Armando auto volador");
                            listaVehiM.agregarAutoVolador();
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de magos");
                        System.out.println("2. Entrenar especialista mago");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Entrenando escuadron mago");
                            listaMiliM.agregarEscuadronMagos();
                        }
                        else if(y == 2){
                            System.out.println("Entrenando especialista mago");
                            listaMiliM.agregarEspecialistaMago();
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
    
    public void menud() {
            int x = 0;
            int y = 0;
            Scanner M = new Scanner(System.in);

            ListaMilicia listaMiliD = new ListaMilicia();
            ListaVehiculos listaVehiD = new ListaVehiculos();
            ListaEdificaciones listaEdiD = new ListaEdificaciones(); 

            listaEdiD.agregarCentroMandoDark();

            while (x != 8) {
                escoger();
                try {

                    x = M.nextInt();

                    switch (x) {
                        case 1:
                            System.out.println("1. Construir cuartel de darksiders");
                            System.out.println("2. Construir recolector de sangre");
                            System.out.println("3. Construir recolector de diente de dragon");
                            System.out.println("4. Construir recolector de veneno");
                            System.out.println("5. Construir fabrica de naves");
                            System.out.println("6. Construir fabrica de juggernauts");
                            System.out.println("Deseo construir: ");
                            y = M.nextInt();
                            if(y == 1){
                                System.out.println("Construyendo cuartel de darksiders");
                                listaEdiD.agregarCuartelDark();
                            }
                            else if(y == 2){
                                System.out.println("Construyendo recolector de sangre");
                                listaEdiD.agregarRecolectorSangre();
                            }
                            else if(y == 3){
                                System.out.println("Construyendo recolector de diente de dragon");
                                listaEdiD.agregarRecolectorDienteDragon();
                            }
                            else if(y == 4){
                                System.out.println("Construyendo recolector de veneno");
                                listaEdiD.agregarRecolectorVeneno();
                            }
                            else if(y == 5){
                                System.out.println("Construyendo fabrica de naves");
                                listaEdiD.agregarFabricaNave();
                            }
                            else if(y == 6){
                                System.out.println("Construyendo fabrica de juggernauts");
                                listaEdiD.agregarFabricaJuggernaut();
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
                                listaVehiD.agregarNave();
                            }
                            else if(y == 2){
                                System.out.println("Armando juggernaut");
                                listaVehiD.agregarJuggernaut();
                            }
                            break;
                        case 4:
                            System.out.println("1. Entrenar escuadrones de darksiders");
                            System.out.println("2. Entrenar especialista darksider");
                            System.out.println("Deseo entrenar: ");
                            y = M.nextInt();
                            if(y == 1){
                                System.out.println("Entrenando escuadron dark");
                                listaMiliD.agregarEscuadronDark();
                            }
                            else if(y == 2){
                                System.out.println("Entrenando especialista dark");
                                listaMiliD.agregarEspecialistaDark();
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
    
    public void menum() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);

        ListaMilicia listaMiliMu = new ListaMilicia();
        ListaVehiculos listaVehiMu = new ListaVehiculos();
        ListaEdificaciones listaEdiMu = new ListaEdificaciones(); 
        
        listaEdiMu.agregarCentroMandoMuggle();
        
        while (x != 8) {
            escoger();
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
                            System.out.println("Construyendo cuartel de muggles");
                            listaEdiMu.agregarCuartelMuggle();
                        }
                        else if(y == 2){
                            System.out.println("Construyendo recolector de dinero");
                            listaEdiMu.agregarRecolectorDinero();
                        }
                        else if(y == 3){
                            System.out.println("Construyendo recolector de credito");
                            listaEdiMu.agregarRecolectorCredito();
                        }
                        else if(y == 4){
                            System.out.println("Construyendo recolector de cupones");
                            listaEdiMu.agregarRecolectorCupon();
                        }
                        else if(y == 5){
                            System.out.println("Construyendo fabrica de avionetas");
                            listaEdiMu.agregarFabricaAvioneta();
                        }
                        else if(y == 6){
                            System.out.println("Construyendo fabrica de tanques");
                            listaEdiMu.agregarFabricaTanque();
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
                            listaVehiMu.agregarAvioneta();
                        }
                        else if(y == 2){
                            System.out.println("Armando tanque");
                            listaVehiMu.agregarTanque();
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de muggles");
                        System.out.println("2. Entrenar especialista muggle");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Entrenando escuadron muggle");
                            listaMiliMu.agregarEscuadronMuggle();
                        }
                        else if(y == 2){
                            System.out.println("Entrenando especialista muggle");
                            listaMiliMu.agregarEspecialistaMuggle();
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
