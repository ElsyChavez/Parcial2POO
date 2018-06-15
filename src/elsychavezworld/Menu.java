/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsychavezworld;

import edificaciones.Edificaciones;
import edificaciones.ListaEdificaciones;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import jugador.Jugador;
import milicia.ListaMilicia;
import milicia.Milicia;
import vehiculos.ListaVehiculos;

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
    
    //Lista para el jugador que elija la raza mago
    ListaMilicia listaMiliM = new ListaMilicia();
    ListaVehiculos listaVehiM = new ListaVehiculos();
    ListaEdificaciones listaEdiM = new ListaEdificaciones(); 
    
    //Lista para el jugador que elija la raza dark sider
    ListaMilicia listaMiliD = new ListaMilicia();
    ListaVehiculos listaVehiD = new ListaVehiculos();
    ListaEdificaciones listaEdiD = new ListaEdificaciones(); 
    
    //Lista para el jugador que elija la raza muggle (humana)
    ListaMilicia listaMiliMu = new ListaMilicia();
    ListaVehiculos listaVehiMu = new ListaVehiculos();
    ListaEdificaciones listaEdiMu = new ListaEdificaciones();
    
    boolean seguir = true;
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    
    int n;
    
    Scanner read = new Scanner(System.in);
    
    public void random(){
        Random rand = new Random();
        n = rand.nextInt(2) + 1;
        if(n == 1){
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            while(true){
                if(jugador1.getNombreRaza().equals(jugador2.getNombreRaza())){
                    System.out.println("Esta raza ya esta elegida. Escoja de nuevo");
                    jugador2.CreadorJugador();
                }
                else{
                    break;
                }
            }
            if(jugador1.getNombreRaza().equals("muggle") || jugador2.getNombreRaza().equals("muggle")){
                listaEdiMu.agregarCentroMandoMuggle();
            }
            if(jugador1.getNombreRaza().equals("mago") || jugador2.getNombreRaza().equals("mago")){
                listaEdiM.agregarCentroMandoMago();
            }
            if(jugador1.getNombreRaza().equals("darksider") || jugador2.getNombreRaza().equals("darksider")){
                listaEdiD.agregarCentroMandoDark();
            }
        }
        else if(n == 2){
            System.out.println("***Bienvenido jugador 2***");
            jugador2.CreadorJugador();
            System.out.println("***Bienvenido jugador 1***");
            jugador1.CreadorJugador();
            while(true){
                if(jugador2.getNombreRaza().equals(jugador1.getNombreRaza())){
                    System.out.println("Esta raza ya esta elegida. Escoja de nuevo");
                    jugador1.CreadorJugador();
                }
                else{
                    break;
                }
            }
            if(jugador1.getNombreRaza().equals("muggle") || jugador2.getNombreRaza().equals("muggle")){
                listaEdiMu.agregarCentroMandoMuggle();
            }
            if(jugador1.getNombreRaza().equals("mago") || jugador2.getNombreRaza().equals("mago")){
                listaEdiM.agregarCentroMandoMago();
            }
            if(jugador1.getNombreRaza().equals("darksider") || jugador2.getNombreRaza().equals("darksider")){
                listaEdiD.agregarCentroMandoDark();
            }
        }
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
        
        while (x != 8) {
            escoger();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de magos. Costo: Galeones(200), Knuts(300)");
                        System.out.println("2. Construir recolector de galeones. Costo: Sickles(600), Knuts(400)");
                        System.out.println("3. Construir recolector de sickles. Costo: Galeones(400), Knuts(200)");
                        System.out.println("4. Construir recolector de knuts. Costo: Galeones(300), Sickles(300)");
                        System.out.println("5. Construir fabrica de escobas. Costo: Sickles(400), Knuts(200)");
                        System.out.println("6. Construir fabrica de auto volador. Costo: Galeones(300), Sickles(100)");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        Edificaciones recurso = listaEdiM.getRecursos();
                        int recu1,recu2,recu3,vida;
                        if(y == 1){
                            if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                System.out.println("Construyendo cuartel de magos");
                                listaEdiM.agregarCuartelMagos();
                                recu1=recurso.getRecurso1()-200;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-300;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 2){
                            if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                System.out.println("Construyendo recolector de galeones");
                                listaEdiM.agregarRecolectorGaleon();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-600;
                                recu3=recurso.getRecurso3()-400;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 3){
                            if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo recolector de sickles");
                                listaEdiM.agregarRecolectorSickle();
                                recu1=recurso.getRecurso1()-400;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                        }
                        else if(y == 4){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                System.out.println("Construyendo recolector de knuts");
                                listaEdiM.agregarRecolectorKnuts();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-300;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 5){
                            if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo fabrica de escobas");
                                listaEdiM.agregarFabricaEscoba();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-400;
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 6){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                System.out.println("Construyendo fabrica de autos voladores");
                                listaEdiM.agregarFabricaAutoVolador();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-100;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");                                
                            }
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
                        System.out.println("1. Armar escoba. Costo: Galeones(200),Knuts(400)");
                        System.out.println("2. Armar autovolador. Costo: Galeones(400),Sickles(100)");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        Edificaciones recurso1 = listaEdiM.getRecursos();
                        int recu11, recu22,recu33,vidaa;
                        if(y == 1){
                            if(listaEdiM.verificarEdificacion("Fabrica Escoba")){
                                if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                    System.out.println("Armando escoba");
                                    listaVehiM.agregarEscoba();
                                    recu11 = recurso1.getRecurso1()-200;
                                    recu22 = recurso1.getRecurso2();
                                    recu33 = recurso1.getRecurso3()-400;
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else {
                                System.out.println("No existe todavia una fabrica de escobas.");
                            }
                            
                        }
                        else if(y == 2){
                            if(listaEdiM.verificarEdificacion("Fabrica Auto Volador")){
                                if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                    System.out.println("Armando auto volador");
                                    listaVehiM.agregarAutoVolador();
                                    recu11 = recurso1.getRecurso1()-400;
                                    recu22 = recurso1.getRecurso2()-100;
                                    recu33 = recurso1.getRecurso3();
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else{
                                System.out.println("No existe todavia una fabrica de autos voladores.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de magos. Costo: Sickles(200),Knuts(100)");
                        System.out.println("2. Entrenar especialista mago. Costo: Galeones(100),Knuts(400)");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        Edificaciones recurso2 = listaEdiM.getRecursos();
                        int recu111, recu222, recu333,vidaaa;
                        if(listaEdiM.verificarEdificacion("Cuartel Magos")){
                            if(y == 1){
                                if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                    System.out.println("Entrenando escuadron mago");
                                    listaMiliM.agregarEscuadronMagos();
                                    recu111 = recurso2.getRecurso1();
                                    recu222 = recurso2.getRecurso2()-200;
                                    recu333 = recurso2.getRecurso3()-100;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                            else if(y == 2){
                                if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                    System.out.println("Entrenando especialista mago");
                                    listaMiliM.agregarEspecialistaMago();
                                    recu111 = recurso2.getRecurso1()-100;
                                    recu222 = recurso2.getRecurso2();
                                    recu333 = recurso2.getRecurso3()-400;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                        }
                        else{
                            System.out.println("No existe todavia un cuartel de magos.");
                        }
                        break;
                    case 5:
                        ataque();
                        break;
                    case 6:
                        System.out.println("Defendiendo");
                        break;
                    case 7:
                        System.out.println("1. Ver edificaciones actuales");
                        System.out.println("2. Ver vehiculos actuales");
                        System.out.println("3. Ver tropas actuales");
                        System.out.println("Deseo ver: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Mostrando edificios");
                            listaEdiM.mostrarListaEdificaciones();
                        }
                        else if(y == 2){
                            System.out.println("Mostrando vehiculos");
                            listaVehiM.mostrarListaVehiculos();
                        }
                        else if(y == 3){
                            System.out.println("Mostrando tropas");
                            listaMiliM.mostrarListaMilicia();
                        }
                        break;
                    case 8:
                        System.out.println("***Termina turno***\n");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debe ingresar un numero entero");
                M.nextLine();
            }
        }
    }
    
    public void menud() {
            int x = 0;
            int y = 0;
            Scanner M = new Scanner(System.in);

            while (x != 8) {
                escoger();
                try {

                    x = M.nextInt();

                    switch (x) {
                        case 1:
                            System.out.println("1. Construir cuartel de darksiders. Costo: Sangre(200), Veneno(300)");
                            System.out.println("2. Construir recolector de sangre. Costo: DienteDragon(600), Veneno(400)");
                            System.out.println("3. Construir recolector de dientes de dragon. Costo: Sangre(400), Veneno(200)");
                            System.out.println("4. Construir recolector de veneno. Costo: Sangre(300), DienteDragon(300)");
                            System.out.println("5. Construir fabrica de naves. Costo: DienteDragon(400), Veneno(200)");
                            System.out.println("6. Construir fabrica de juggernauts. Costo: Sangre(300), DienteDragon(100)");
                            System.out.println("Deseo construir: ");
                            y = M.nextInt();
                            Edificaciones recurso = listaEdiD.getRecursos();
                            int recu1,recu2,recu3,vida;
                            if(y == 1){
                                if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                    System.out.println("Construyendo cuartel de dark siders");
                                    listaEdiD.agregarCuartelDark();
                                    recu1=recurso.getRecurso1()-200;
                                    recu2=recurso.getRecurso2();
                                    recu3=recurso.getRecurso3()-300;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 2){
                                if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                    System.out.println("Construyendo recolector de sangre");
                                    listaEdiD.agregarRecolectorSangre();
                                    recu1=recurso.getRecurso1();
                                    recu2=recurso.getRecurso2()-600;
                                    recu3=recurso.getRecurso3()-400;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 3){
                                if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                    System.out.println("Construyendo recolector de dientes de dragon");
                                    listaEdiD.agregarRecolectorDienteDragon();
                                    recu1=recurso.getRecurso1()-400;
                                    recu2=recurso.getRecurso2();
                                    recu3=recurso.getRecurso3()-200;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                            }
                            else if(y == 4){
                                if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                    System.out.println("Construyendo recolector de veneno");
                                    listaEdiD.agregarRecolectorVeneno();
                                    recu1=recurso.getRecurso1()-300;
                                    recu2=recurso.getRecurso2()-300;
                                    recu3=recurso.getRecurso3();
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 5){
                                if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                    System.out.println("Construyendo fabrica de naves");
                                    listaEdiD.agregarFabricaNave();
                                    recu1=recurso.getRecurso1();
                                    recu2=recurso.getRecurso2()-400;
                                    recu3=recurso.getRecurso3()-200;
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");
                                }
                            }
                            else if(y == 6){
                                if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                    System.out.println("Construyendo fabrica de juggernauts");
                                    listaEdiD.agregarFabricaJuggernaut();
                                    recu1=recurso.getRecurso1()-300;
                                    recu2=recurso.getRecurso2()-100;
                                    recu3=recurso.getRecurso3();
                                    vida=recurso.getVida();
                                    recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                                }
                                else{
                                    System.out.println("No tienes suficientes recursos para construir esto.");                                
                                }
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
                            System.out.println("1. Armar nave. Costo: Sangre(200), Veneno(400)");
                            System.out.println("2. Armar juggernaut. Costo: Sangre(400),DienteDragon(100)");
                            System.out.println("Deseo armar vehiculo: ");
                            y = M.nextInt();
                            Edificaciones recurso1 = listaEdiD.getRecursos();
                            int recu11, recu22,recu33,vidaa;
                            if(y == 1){
                                if(listaEdiD.verificarEdificacion("Fabrica Nave")){
                                    if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                        System.out.println("Armando nave");
                                        listaVehiD.agregarNave();
                                        recu11 = recurso1.getRecurso1()-200;
                                        recu22 = recurso1.getRecurso2();
                                        recu33 = recurso1.getRecurso3()-400;
                                        vidaa = recurso1.getVida();
                                        recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                    }
                                }
                                else {
                                    System.out.println("No existe todavia una fabrica de naves.");
                                }

                            }
                            else if(y == 2){
                                if(listaEdiD.verificarEdificacion("Fabrica Juggernaut")){
                                    if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                        System.out.println("Armando juggernaut");
                                        listaVehiD.agregarJuggernaut();
                                        recu11 = recurso1.getRecurso1()-400;
                                        recu22 = recurso1.getRecurso2()-100;
                                        recu33 = recurso1.getRecurso3();
                                        vidaa = recurso1.getVida();
                                        recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                    }
                                }
                                else{
                                    System.out.println("No existe todavia una fabrica de juggernauts.");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("1. Entrenar escuadrones de darksiders. Costo: DienteDragon(200),Veneno(100)");
                            System.out.println("2. Entrenar especialista darksider. Costo: Sangre(100),Veneno(400)");
                            System.out.println("Deseo entrenar: ");
                            y = M.nextInt();
                            Edificaciones recurso2 = listaEdiD.getRecursos();
                            int recu111, recu222, recu333,vidaaa;
                            if(listaEdiD.verificarEdificacion("Cuartel Dark")){
                                if(y == 1){
                                    if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                        System.out.println("Entrenando escuadron dark");
                                        listaMiliD.agregarEscuadronDark();
                                        recu111 = recurso2.getRecurso1();
                                        recu222 = recurso2.getRecurso2()-200;
                                        recu333 = recurso2.getRecurso3()-100;
                                        vidaaa = recurso2.getVida();
                                        recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                    }
                                }
                                else if(y == 2){
                                    if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                        System.out.println("Entrenando especialista dark");
                                        listaMiliD.agregarEspecialistaDark();
                                        recu111 = recurso2.getRecurso1()-100;
                                        recu222 = recurso2.getRecurso2();
                                        recu333 = recurso2.getRecurso3()-400;
                                        vidaaa = recurso2.getVida();
                                        recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                    }
                                    else{
                                        System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                    }
                                }
                            }
                            else{
                                System.out.println("No existe todavia un cuartel de dark siders.");
                            }
                            break;
                        case 5:
                            ataque();
                            break;
                        case 6:
                            System.out.println("Defendiendo");
                            break;
                        case 7:
                            System.out.println("1. Ver edificaciones actuales");
                            System.out.println("2. Ver vehiculos actuales");
                            System.out.println("3. Ver tropas actuales");
                            System.out.println("Deseo ver: ");
                            y = M.nextInt();
                            if(y == 1){
                                System.out.println("Mostrando edificios");
                                listaEdiD.mostrarListaEdificaciones();
                            }
                            else if(y == 2){
                                System.out.println("Mostrando vehiculos");
                                listaVehiD.mostrarListaVehiculos();
                            }
                            else if(y == 3){
                                System.out.println("Mostrando tropas");
                                listaMiliD.mostrarListaMilicia();
                            }
                            break;
                        case 8:
                            System.out.println("***Termina turno***\n");
                            break;
                        default:
                            System.out.println("Por favor ingresa un valor valido");      
                    }
                } catch (InputMismatchException E){
                    System.err.println("Debe ingresar un numero entero");
                    M.nextLine();
                }
            }
        }
    
    public void menum() {
        int x = 0;
        int y = 0;
        Scanner M = new Scanner(System.in);
        
        while (x != 8) {
            escoger();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("1. Construir cuartel de muggles. Costo: Dinero(200), Cupones(300)");
                        System.out.println("2. Construir recolector de dinero. Costo: Credito(600), Cupones(400)");
                        System.out.println("3. Construir recolector de credito. Costo: Dinero(400), Cupones(200)");
                        System.out.println("4. Construir recolector de cupones. Costo: Dinero(300), Credito(300)");
                        System.out.println("5. Construir fabrica de avionetas. Costo: Credito(400), Cupones(200)");
                        System.out.println("6. Construir fabrica de tanques. Costo: Dinero(300), Credito(100)");
                        System.out.println("Deseo construir: ");
                        y = M.nextInt();
                        Edificaciones recurso = listaEdiMu.getRecursos();
                        int recu1,recu2,recu3,vida;
                        if(y == 1){
                            if(recurso.getRecurso1()>=200 && recurso.getRecurso3()>=300){
                                System.out.println("Construyendo cuartel de muggles");
                                listaEdiMu.agregarCuartelMuggle();
                                recu1=recurso.getRecurso1()-200;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-300;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 2){
                            if(recurso.getRecurso2()>=600 && recurso.getRecurso3()>=400){
                                System.out.println("Construyendo recolector de dinero");
                                listaEdiMu.agregarRecolectorDinero();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-600;
                                recu3=recurso.getRecurso3()-400;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 3){
                            if(recurso.getRecurso1()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo recolector de credito");
                                listaEdiMu.agregarRecolectorCredito();
                                recu1=recurso.getRecurso1()-400;
                                recu2=recurso.getRecurso2();
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                        }
                        else if(y == 4){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=300){
                                System.out.println("Construyendo recolector de cupones");
                                listaEdiMu.agregarRecolectorCupon();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-300;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 5){
                            if(recurso.getRecurso2()>=400 && recurso.getRecurso3()>=200){
                                System.out.println("Construyendo fabrica de avionetas");
                                listaEdiMu.agregarFabricaAvioneta();
                                recu1=recurso.getRecurso1();
                                recu2=recurso.getRecurso2()-400;
                                recu3=recurso.getRecurso3()-200;
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");
                            }
                        }
                        else if(y == 6){
                            if(recurso.getRecurso1()>=300 && recurso.getRecurso2()>=100){
                                System.out.println("Construyendo fabrica de tanques");
                                listaEdiMu.agregarFabricaTanque();
                                recu1=recurso.getRecurso1()-300;
                                recu2=recurso.getRecurso2()-100;
                                recu3=recurso.getRecurso3();
                                vida=recurso.getVida();
                                recurso.actualizarRecursos(recu1, recu2, recu3, vida);
                            }
                            else{
                                System.out.println("No tienes suficientes recursos para construir esto.");                                
                            }
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
                        System.out.println("1. Armar avioneta. Costo: Dinero(200), Cupones(400)");
                        System.out.println("2. Armar tanque. Costo: Dinero(400), Credito(100)");
                        System.out.println("Deseo armar vehiculo: ");
                        y = M.nextInt();
                        Edificaciones recurso1 = listaEdiMu.getRecursos();
                        int recu11, recu22,recu33,vidaa;
                        if(y == 1){
                            if(listaEdiMu.verificarEdificacion("Fabrica Avioneta")){
                                if(recurso1.getRecurso1()>=200 && recurso1.getRecurso3()>=400){
                                    System.out.println("Armando avioneta");
                                    listaVehiMu.agregarAvioneta();
                                    recu11 = recurso1.getRecurso1()-200;
                                    recu22 = recurso1.getRecurso2();
                                    recu33 = recurso1.getRecurso3()-400;
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else {
                                System.out.println("No existe todavia una fabrica de  avionetas.");
                            }
                            
                        }
                        else if(y == 2){
                            if(listaEdiMu.verificarEdificacion("Fabrica Tanque")){
                                if(recurso1.getRecurso1()>=400 && recurso1.getRecurso2()>=100){
                                    System.out.println("Armando tanque");
                                    listaVehiMu.agregarTanque();
                                    recu11 = recurso1.getRecurso1()-400;
                                    recu22 = recurso1.getRecurso2()-100;
                                    recu33 = recurso1.getRecurso3();
                                    vidaa = recurso1.getVida();
                                    recurso1.actualizarRecursos(recu11, recu22, recu33, vidaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para construir esta vehiculo.");
                                }
                            }
                            else{
                                System.out.println("No existe todavia una fabrica de tanques.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("1. Entrenar escuadrones de muggles. Costo: Credito(200), Cupones(100)");
                        System.out.println("2. Entrenar especialista muggle. Costo: Dinero(100), Cupones(400)");
                        System.out.println("Deseo entrenar: ");
                        y = M.nextInt();
                        Edificaciones recurso2 = listaEdiMu.getRecursos();
                        int recu111, recu222, recu333,vidaaa;
                        if(listaEdiMu.verificarEdificacion("Cuartel Muggle")){
                            if(y == 1){
                                if(recurso2.getRecurso2()>=200 && recurso2.getRecurso3()>=100){
                                    System.out.println("Entrenando escuadron muggle");
                                    listaMiliMu.agregarEscuadronMuggle();
                                    recu111 = recurso2.getRecurso1();
                                    recu222 = recurso2.getRecurso2()-200;
                                    recu333 = recurso2.getRecurso3()-100;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                            else if(y == 2){
                                if(recurso2.getRecurso1()>=100 && recurso2.getRecurso3()>=400){
                                    System.out.println("Entrenando especialista muggle");
                                    listaMiliMu.agregarEspecialistaMuggle();
                                    recu111 = recurso2.getRecurso1()-100;
                                    recu222 = recurso2.getRecurso2();
                                    recu333 = recurso2.getRecurso3()-400;
                                    vidaaa = recurso2.getVida();
                                    recurso2.actualizarRecursos(recu111, recu222, recu333, vidaaa);
                                }
                                else{
                                    System.out.println("No tienes los suficientes recursos para entrenar esta tropa.");
                                }
                            }
                        }
                        else{
                            System.out.println("No existe todavia un cuartel de muggles.");
                        }
                        break;
                    case 5:
                        ataque();
                        break;
                    case 6:
                        System.out.println("Defendiendo");
                        break;
                    case 7:
                        System.out.println("1. Ver edificaciones actuales");
                        System.out.println("2. Ver vehiculos actuales");
                        System.out.println("3. Ver tropas actuales");
                        System.out.println("Deseo ver: ");
                        y = M.nextInt();
                        if(y == 1){
                            System.out.println("Mostrando edificios");
                            listaEdiMu.mostrarListaEdificaciones();
                        }
                        else if(y == 2){
                            System.out.println("Mostrando vehiculos");
                            listaVehiMu.mostrarListaVehiculos();
                        }
                        else if(y == 3){
                            System.out.println("Mostrando tropas");
                            listaMiliMu.mostrarListaMilicia();
                        }
                        break;       
                    case 8:
                        System.out.println("***Termina turno***\n");
                        break;
                    default:
                        System.out.println("Por favor ingresa un valor valido");      
                }
            } catch (InputMismatchException E){
                System.err.println("Debe ingresar un numero entero");
                M.nextLine();
            }
        }
    }
    
    int cont = 1;
    int t;
    
    public void menuPrincipal(){
        random();
        
        while(seguir){
            if(n == 1){

                System.out.println("**********Fase "+cont+"**********");
                if(jugador1.getNombreRaza().equals("mago")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t = 1;
                    menu();
                }
                else if(jugador1.getNombreRaza().equals("darksider")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t=1;
                    menud();
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t=1;
                    menum();
                }
                if(jugador2.getNombreRaza().equals("mago")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=2;
                    menu();
                }
                else if(jugador2.getNombreRaza().equals("darksider")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=2;
                    menud();
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=2;
                    menum();
                }
            } 
            else if(n == 2){
                System.out.println("**********Fase "+cont+"**********");
                if(jugador2.getNombreRaza().equals("mago")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=1;
                    menu();
                }
                else if(jugador2.getNombreRaza().equals("darksider")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=1;
                    menud();
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    System.out.println("***Menu del jugador " + jugador2.getNombre() + "***");
                    t=1;
                    menum();
                }
                if(jugador1.getNombreRaza().equals("mago")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t=2;
                    menu();
                }
                else if(jugador1.getNombreRaza().equals("darksider")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t=2;
                    menud();
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    System.out.println("***Menu del jugador " + jugador1.getNombre() + "***");
                    t=2;
                    menum();
                }
            }
            cont++;
        }
        
      }
        
    public void ataque(){
            
            if(jugador1.getNombreRaza().equals("mago") && n==1 && t==1){
                int edificiosTotal = listaEdiD.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliM.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("darksider")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("darksider") && n==1 && t==2){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliD.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("mago")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun.");}
                }
               
            }
            
            else if(jugador1.getNombreRaza().equals("darksider") && n==1 && t==1){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliD.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("mago")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("mago") && n==1 && t==2){
                int edificiosTotal = listaEdiD.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliM.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("darksider")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun.");}
                }
               
            }
            
            else if(jugador1.getNombreRaza().equals("muggle") && n==1 && t==1){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiD.contarTodasEdificaciones();
                int miliciaTotal = listaMiliMu.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("mago")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("darksider")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("muggle") && n==1 && t==2){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiD.contarTodasEdificaciones();
                int miliciaTotal = listaMiliMu.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("mago")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("darksider")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun.");}
                }
               
            }   

            else if(jugador1.getNombreRaza().equals("mago") && n==2 && t==2){
                int edificiosTotal = listaEdiD.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliM.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("darksider")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("darksider") && n==2 && t==1){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliD.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("mago")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun.");}
                }
               
            }
            
            else if(jugador1.getNombreRaza().equals("darksider") && n==2 && t==2){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliD.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("mago")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("muggle")){
                    if(listaMiliD.verificarMiembros("Escuadron Dark") || listaMiliD.verificarMiembros("Especialista Dark")){
                        listaMiliD.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliD.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas dark entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("mago") && n==2 && t==1){
                int edificiosTotal = listaEdiD.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiMu.contarTodasEdificaciones();
                int miliciaTotal = listaMiliM.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("darksider")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("muggle")){
                    if(listaMiliM.verificarMiembros("Escuadron Mago") || listaMiliM.verificarMiembros("Especialista Mago")){
                        listaMiliM.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliM.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiMu.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiMu.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de mago entrenadas aun.");}
                }
               
            }
            
            else if(jugador1.getNombreRaza().equals("muggle") && n==2 && t==2){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiD.contarTodasEdificaciones();
                int miliciaTotal = listaMiliMu.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador2.getNombreRaza().equals("mago")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun");}
                }
                else if(jugador2.getNombreRaza().equals("darksider")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun.");}
                }
               
            }
            
            else if(jugador2.getNombreRaza().equals("muggle") && n==2 && t==1){
                int edificiosTotal = listaEdiM.contarTodasEdificaciones();
                int edificiosTotal1 = listaEdiD.contarTodasEdificaciones();
                int miliciaTotal = listaMiliMu.contarTodaMilicia();
                int k,r;
                int vida, danio;
                
                if(jugador1.getNombreRaza().equals("mago")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiM.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiM.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun");}
                }
                else if(jugador1.getNombreRaza().equals("darksider")){
                    if(listaMiliMu.verificarMiembros("Escuadron Muggle") || listaMiliMu.verificarMiembros("Especialista Muggle")){
                        listaMiliMu.mostrarMiliciaEnemigo();
                        System.out.println("Escriba con que tropa desea atacar al enemigo: ");
                        k = read.nextInt();
                        Milicia miliM = listaMiliMu.getMilicias(k);

                        if(k>0 && k<=miliciaTotal){
                            listaEdiD.mostrarEdificioEnemigo();
                            System.out.println("Escriba el numero del edificio que desea atacar: ");
                            r=read.nextInt();
                            Edificaciones edifD2 = listaEdiD.getEdificaciones(r);
                            if(r>0 && r<=edificiosTotal1){
                                vida =  edifD2.getVida() - miliM.getDanio();
                                edifD2.actualizarVida(vida);
                            }
                            else{
                                System.out.println("Ingrese un valor valido la proxima vez.");
                            }
                        }
                    }
                    else{System.out.println("No hay tropas de muggle entrenadas aun.");}
                }
               
            }   
        }
}
    


