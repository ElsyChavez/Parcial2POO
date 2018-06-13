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
        System.out.println("***Menu jugador mago***");
        System.out.println("1. Construir cuartel de muggles");
        System.out.println("2. Construir recolector de dinero");
        System.out.println("3. Construir recolector de credito");
        System.out.println("4. Construir recolector de cupones");
        System.out.println("5. Construir fabrica de avionetas");
        System.out.println("6. Construir fabrica de tanques");
        System.out.println("7. Recolectar dinero");
        System.out.println("8. Recolectar credito");
        System.out.println("9. Recolectar cupones");
        System.out.println("10. Armar avioneta");
        System.out.println("11. Armar tanque");
        System.out.println("12. Entrenar escuadrones de muggles");
        System.out.println("13. Entrenar especialista muggle");
        System.out.println("14. Atacar enemigo");
        System.out.println("15. Defender territorio");
        System.out.println("16. Terminar Turno");
        System.out.println("Ingrese la opcion que desea ejecutar: ");
    }

    public void menud() {
        int x = 0;
        Scanner M = new Scanner(System.in);
        AbstractFactory factoryE, factoryM, factoryRe,factoryVe;
        
        factoryE =  FactoryProducer.getFactory("edificacion");
        factoryM =  FactoryProducer.getFactory("milicia");
        factoryRe =  FactoryProducer.getFactory("recursos");
        factoryVe =  FactoryProducer.getFactory("vehiculo");
        
        while (x != 16) {
            escogerMuggle();
            try {
                
                x = M.nextInt();

                switch (x) {
                    case 1:
                        Edificaciones cuartel = factoryE.getEdificacion("cuartelMU");
                        cuartel.construir();
                        break;
                    case 2:
                        Edificaciones recolector1 = factoryE.getEdificacion("recolector1MU");
                        recolector1.construir();
                        break;
                    case 3:
                        Edificaciones recolector2 = factoryE.getEdificacion("recolector2MU");
                        recolector2.construir();
                        break;
                    case 4:
                        Edificaciones recolector3 = factoryE.getEdificacion("recolector3MU");
                        recolector3.construir();
                        break;
                    case 5:
                        Edificaciones fabrica1 = factoryE.getEdificacion("fabrica1MU");
                        fabrica1.construir();
                        break;
                    case 6:
                        Edificaciones fabrica2 = factoryE.getEdificacion("fabrica2MU");
                        fabrica2.construir();
                        break;
                    case 7:
                        //recolectar1();
                        break;
                    case 8:
                        //recolectar2();
                        break;
                    case 9:
                        //recolectar3();
                        break;
                    case 10:
                        Vehiculos vehiculo1 = factoryVe.getVehiculo("avioneta");
                        vehiculo1.armar();
                        break;
                    case 11:
                        Vehiculos vehiculo2 = factoryVe.getVehiculo("tanque");
                        vehiculo2.armar();
                        break;
                    case 12:
                        Milicia escuadron = factoryM.getMilicia("escuadronmuggle");
                        escuadron.entrenar();
                        break;
                    case 13:
                        Milicia especialista = factoryM.getMilicia("especialistamuggle");
                        especialista.entrenar();
                        break;
                    case 14:
                        Milicia atacante1 = factoryM.getMilicia("escuadronmuggle");
                        atacante1.atacar();
                        Milicia atacante2 = factoryM.getMilicia("especialistamuggle");
                        atacante2.atacar();
                        break;
                    case 15:
                        Milicia defensor1 = factoryM.getMilicia("escuadronmuggle");
                        defensor1.defender();
                        Milicia defensor2 = factoryM.getMilicia("especialistamuggle");
                        defensor2.defender();
                        break;
                    case 16:
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
