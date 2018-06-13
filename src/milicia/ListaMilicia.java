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
        Milicia milic = factoryM.getMilicia("escuadronmagos");
        milicia.add(milic);
    }
    
    public void agregarEspecialistaMago() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia milic = factoryM.getMilicia("especialistamago");
        milicia.add(milic);
    }
   
    public void agregarEscuadronDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia milic = factoryM.getMilicia("escuadrondark");
        milicia.add(milic);
    }
    
    public void agregarEspecialistaDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia milic = factoryM.getMilicia("especialistadark");
        milicia.add(milic);
    }
    
    public void agregarEscuadronMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia milic = factoryM.getMilicia("escuadronmuggle");
        milicia.add(milic);
    }
    
    public void agregarEspecialistaMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia milic = factoryM.getMilicia("especialistamuggle");
        milicia.add(milic);
    }
    
    public void mostrarListaMilicia(){
        milicia.forEach((mlc) -> {
            System.out.println(mlc.toString());
        });
        System.out.println("\n");

    }
}
