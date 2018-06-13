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
        Milicia escm = factoryM.getMilicia("escuadronmagos");
        milicia.add(escm);
    }
    
    public void agregarEspecialistaMago() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia ema = factoryM.getMilicia("especialistamago");
        milicia.add(ema);
    }
   
    public void agregarEscuadronDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia esda = factoryM.getMilicia("escuadrondark");
        milicia.add(esda);
    }
    
    public void agregarEspecialistaDark() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia eda = factoryM.getMilicia("especialistadark");
        milicia.add(eda);
    }
    
    public void agregarEscuadronMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia esmu = factoryM.getMilicia("escuadronmuggle");
        milicia.add(esmu);
    }
    
    public void agregarEspecialistaMuggle() {
        AbstractFactory factoryM;
        factoryM =  FactoryProducer.getFactory("milicia");
        Milicia emu = factoryM.getMilicia("especialistamuggle");
        milicia.add(emu);
    }
    
    public void mostrarListaMilicia(){
        milicia.forEach((mlc) -> {
            System.out.println(mlc.toString());
        });
        System.out.println("\n");

    }
}
