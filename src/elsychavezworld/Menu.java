/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsychavezworld;

import edificaciones.Edificaciones;
import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.InputMismatchException;
import java.util.Scanner;
import milicia.Milicia;
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
        System.out.println("***Menu jugador mago***");
        System.out.println("1. Construir cuartel");
        System.out.println("2. Construir recolector de galeones");
        System.out.println("3. Construir recolector de sickles");
        System.out.println("4. Construir recolector de knuts");
        System.out.println("5. Construir fabrica de escobas");
        System.out.println("6. Construir fabrica de auto volador");
        System.out.println("7. Armar escoba");
        System.out.println("8. Armar autovolador");
        System.out.println("9. Entrenar escuadrones");
        System.out.println("10. Entrenar especialista");
        System.out.println("11. Atacar enemigo");
        System.out.println("12. Defender territorio");
        System.out.println("13. Salir");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
    }

    public void menu() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        AbstractFactory factory, factory2, factory3, factory4, factory5;
        
        factory =  FactoryProducer.getFactory("edificacion");
        factory2 =  FactoryProducer.getFactory("milicia");
        factory3 =  FactoryProducer.getFactory("recursos");
        factory4 =  FactoryProducer.getFactory("vehiculo");
        
        while (x != 13) {
            escoger();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        Edificaciones cuartel = factory.getEdificacion("cuartel");
                        cuartel.construir();
                        break;
                    case 2:
                        Edificaciones recolector1 = factory.getEdificacion("recolector1");
                        recolector1.construir();
                        break;
                    case 3:
                        Edificaciones recolector2 = factory.getEdificacion("recolector2");
                        recolector2.construir();
                        break;
                    case 4:
                        Edificaciones recolector3 = factory.getEdificacion("recolector3");
                        recolector3.construir();
                        break;
                    case 5:
                        Edificaciones fabrica1 = factory.getEdificacion("fabrica1");
                        fabrica1.construir();
                        break;
                    case 6:
                        Edificaciones fabrica2 = factory.getEdificacion("fabrica2");
                        fabrica2.construir();
                        break;
                    case 7:
                        Vehiculos vehiculo1 = factory4.getVehiculo("escoba");
                        vehiculo1.armar();
                        break;
                    case 8:
                        Vehiculos vehiculo2 = factory4.getVehiculo("autovolador");
                        vehiculo2.armar();
                        break;
                    case 9:
                        Milicia escuadron = factory2.getMilicia("escuadron");
                        escuadron.entrenar();
                        break;
                    case 10:
                        Milicia especialista = factory2.getMilicia("especialista");
                        especialista.entrenar();
                        break;
                    case 11:
                        Milicia atacante1 = factory2.getMilicia("escuadron");
                        atacante1.atacar();
                        Milicia atacante2 = factory2.getMilicia("especialista");
                        atacante2.atacar();
                        break;
                    case 12:
                        Milicia defensor1 = factory2.getMilicia("escuadron");
                        defensor1.defender();
                        Milicia defensor2 = factory2.getMilicia("especialista");
                        defensor2.defender();
                        break;
                    case 13:
                        System.out.println("***Fin programa***");
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
