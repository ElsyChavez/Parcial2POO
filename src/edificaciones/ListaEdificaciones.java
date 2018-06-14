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
        Edificaciones centromandomago = factoryE.getEdificacion("centroM");
        edificio.add(centromandomago);
    }
    
    public void agregarCentroMandoDark() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centromandodark = factoryE.getEdificacion("centroD");
        edificio.add(centromandodark);
    }
    
    public void agregarCentroMandoMuggle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones centromandomuggle = factoryE.getEdificacion("centroMU");
        edificio.add(centromandomuggle);
    }
    
    public void agregarRecolectorGaleon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorgaleon = factoryE.getEdificacion("recolector1M");
        edificio.add(recolectorgaleon);
    }
    
    public void agregarRecolectorSickle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorsickle = factoryE.getEdificacion("recolector2M");
        edificio.add(recolectorsickle);
    }
    
    public void agregarRecolectorKnuts() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorknut = factoryE.getEdificacion("recolector3M");
        edificio.add(recolectorknut);
    }
    
    public void agregarCuartelMagos() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelmago = factoryE.getEdificacion("cuartelM");
        edificio.add(cuartelmago);
    }
    
    public void agregarFabricaEscoba() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaescoba = factoryE.getEdificacion("fabrica1M");
        edificio.add(fabricaescoba);
    }
    
    public void agregarFabricaAutoVolador() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaauto = factoryE.getEdificacion("fabrica2M");
        edificio.add(fabricaauto);
    }
    
    public void agregarRecolectorSangre() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorsangre = factoryE.getEdificacion("recolector1D");
        edificio.add(recolectorsangre);
    }
    
    public void agregarRecolectorDienteDragon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones red = factoryE.getEdificacion("recolector2D");
        edificio.add(red);
    }
    
    public void agregarRecolectorVeneno() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorveneno = factoryE.getEdificacion("recolector3D");
        edificio.add(recolectorveneno);
    }
    
    public void agregarCuartelDark() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuarteldark = factoryE.getEdificacion("cuartelD");
        edificio.add(cuarteldark);
    }
    
    public void agregarFabricaNave() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricanave = factoryE.getEdificacion("fabrica1D");
        edificio.add(fabricanave);
    }
    
    public void agregarFabricaJuggernaut() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricajuggernaut = factoryE.getEdificacion("fabrica2D");
        edificio.add(fabricajuggernaut);
    }
    
    public void agregarRecolectorDinero() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectordinero = factoryE.getEdificacion("recolector1MU");
        edificio.add(recolectordinero);
    }
    
    public void agregarRecolectorCredito() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorcredito = factoryE.getEdificacion("recolector2MU");
        edificio.add(recolectorcredito);
    }
    
    public void agregarRecolectorCupon() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones recolectorcupon = factoryE.getEdificacion("recolector3MU");
        edificio.add(recolectorcupon);
    }
    
    public void agregarCuartelMuggle() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones cuartelmuggle = factoryE.getEdificacion("cuartelMU");
        edificio.add(cuartelmuggle);
    }
    
    public void agregarFabricaAvioneta() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricaavioneta = factoryE.getEdificacion("fabrica1MU");
        edificio.add(fabricaavioneta);
    }
    
    public void agregarFabricaTanque() {
        AbstractFactory factoryE;
        factoryE =  FactoryProducer.getFactory("edificacion");
        Edificaciones fabricatanque = factoryE.getEdificacion("fabrica2MU");
        edificio.add(fabricatanque);
    }
    
    public void mostrarListaEdificaciones(){
        edificio.forEach((edf) -> {
            System.out.println(edf.toString());
        });
        System.out.println("\n");

    }
    
    public Edificaciones getRecursos(){      
        return edificio.get(0);
    }
    
    public boolean verificarEdificacion(String edif){
        int cont = 0, contE = edificio.size();
        boolean esta = false;
        while(cont<contE){
            if(edificio.get(cont).getName().equals(edif)){
                esta = true;
            }
            cont++;
        }
        return esta;
    }
    
    public int contarEdificacion(String edif){
        int cont = 0, contE = edificio.size(), canti = 0;
        while(cont<contE){
            if(edificio.get(cont).equals(edif)){
                canti++;
            }
            cont++;
        }
        return canti;
    }
    
    public int contarTodasEdificaciones(){
        int contE = edificio.size();
        return contE;
    }
}
