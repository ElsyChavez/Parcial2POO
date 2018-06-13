/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author Ivis Chavez
 */
public class ListaEdificaciones {
public ArrayList<Edificaciones> edificio;

    public ListaEdificaciones() {
        edificio = new ArrayList<>();
    }

    public void agregarCentroMandoMago() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cm = factoryE.getEdificacion("centroM");
        edificio.add(cm);
    }
    
    public void agregarCentroMandoDark() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cd = factoryE.getEdificacion("centroD");
        edificio.add(cd);
    }
    
    public void agregarCentroMandoMuggle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cmu = factoryE.getEdificacion("centroMU");
        edificio.add(cmu);
    }
    
    public void agregarRecolectorGaleon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones reg = factoryE.getEdificacion("recolector1M");
        edificio.add(reg);
    }
    
    public void agregarRecolectorSickle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones res = factoryE.getEdificacion("recolector2M");
        edificio.add(res);
    }
    
    public void agregarRecolectorKnuts() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones rek = factoryE.getEdificacion("recolector3M");
        edificio.add(rek);
    }
    
    public void agregarCuartelMagos() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cum = factoryE.getEdificacion("cuartelM");
        edificio.add(cum);
    }
    
    public void agregarFabricaEscoba() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fae = factoryE.getEdificacion("fabrica1M");
        edificio.add(fae);
    }
    
    public void agregarFabricaAutoVolador() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fav = factoryE.getEdificacion("fabrica2M");
        edificio.add(fav);
    }
    
    public void agregarRecolectorSangre() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector1D");
        edificio.add(edif);
    }
    
    public void agregarRecolectorDienteDragon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector2D");
        edificio.add(edif);
    }
    
    public void agregarRecolectorVeneno() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector3D");
        edificio.add(edif);
    }
    
    public void agregarCuartelDark() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("cuartelD");
        edificio.add(edif);
    }
    
    public void agregarFabricaNave() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("fabrica1D");
        edificio.add(edif);
    }
    
    public void agregarFabricaJuggernaut() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("fabrica2D");
        edificio.add(edif);
    }
    
    public void agregarRecolectorDinero() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector1MU");
        edificio.add(edif);
    }
    
    public void agregarRecolectorCredito() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector2MU");
        edificio.add(edif);
    }
    
    public void agregarRecolectorCupon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("recolector3MU");
        edificio.add(edif);
    }
    
    public void agregarCuartelMuggle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("cuartelMU");
        edificio.add(edif);
    }
    
    public void agregarFabricaAvioneta() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("fabrica1MU");
        edificio.add(edif);
    }
    
    public void agregarFabricaTanque() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones edif = factoryE.getEdificacion("fabrica2MU");
        edificio.add(edif);
    }
    
    public void mostrarListaEdificaciones(){
        edificio.forEach((edf) -> {
            System.out.println(edf.toString());
        });
        System.out.println("\n");

    }
}
