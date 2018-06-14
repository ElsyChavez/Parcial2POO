/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author Ivis Chavez
 */
public class ListaMilicia {
    public ArrayList<Milicia> milicia;

    public ListaMilicia() {
        milicia = new ArrayList<>();
    }

    public void agregarEscuadronMagos() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadronmago = factoryM.getMilicia("escuadronmagos");
        milicia.add(escuadronmago);
    }
    
    public void agregarEspecialistaMago() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistamago = factoryM.getMilicia("especialistamago");
        milicia.add(especialistamago);
    }
   
    public void agregarEscuadronDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadrondark = factoryM.getMilicia("escuadrondark");
        milicia.add(escuadrondark);
    }
    
    public void agregarEspecialistaDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistadark = factoryM.getMilicia("especialistadark");
        milicia.add(especialistadark);
    }
    
    public void agregarEscuadronMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia escuadronmuggle = factoryM.getMilicia("escuadronmuggle");
        milicia.add(escuadronmuggle);
    }
    
    public void agregarEspecialistaMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia especialistamuggle = factoryM.getMilicia("especialistamuggle");
        milicia.add(especialistamuggle);
    }
    
    public void mostrarListaMilicia(){
        milicia.forEach((mca) -> {
            System.out.println(mca.toString());
        });
        System.out.println("\n");

    }
    
    public boolean verificarMiembros(String tropa){
        int cont = 0; int contM = milicia.size();
        boolean esta = false;
        while(cont<contM){
            if(milicia.get(cont).getName().equals(tropa)){
                esta = true;
            }
            cont++;
        }
        return esta;
    }
    
    public void mostrarMiliciaEnemigo(){
        int cont =0, contE = milicia.size();
        while(cont<contE){
            System.out.println((cont+1)+". "+milicia.get(cont).getName());
            cont++;
        }
    }
    
    public int contarTodaMilicia(){
        int contM = milicia.size();
        return contM;
    }
    
    public Milicia getMilicias(int puesto){      
        int cont =0, contM = milicia.size();
        while(cont<contM){
            if(milicia.get(cont).equals(milicia.get(puesto-1))){
                milicia.get(cont);
            }
            else{
                System.out.println("No existe en esta lista.");
            }
            cont++;
        } return milicia.get(puesto-1);
    }
}
