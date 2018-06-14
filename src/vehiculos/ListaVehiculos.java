/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import factory.AbstractFactory;
import factory.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author Ivis Chavez
 */
public class ListaVehiculos {
    public ArrayList<Vehiculos> vehiculo;

    public ListaVehiculos() {
        vehiculo = new ArrayList<>();
    }

    public void agregarEscoba() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos escoba = factoryV.getVehiculo("escoba");
        vehiculo.add(escoba);
    }
    
    public void agregarAutoVolador() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos auto = factoryV.getVehiculo("autovolador");
        vehiculo.add(auto);
    }
    
    public void agregarNave() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos nave = factoryV.getVehiculo("nave");
        vehiculo.add(nave);
    }
    
    public void agregarJuggernaut() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos jugger = factoryV.getVehiculo("juggernaut");
        vehiculo.add(jugger);
    }
    
    public void agregarAvioneta() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos avioneta = factoryV.getVehiculo("avioneta");
        vehiculo.add(avioneta);
    }
    
    public void agregarTanque() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos tanque = factoryV.getVehiculo("tanque");
        vehiculo.add(tanque);
    }
    
    public void mostrarListaVehiculos(){
        vehiculo.forEach((vhc) -> {
            System.out.println(vhc.toString());
        });
        System.out.println("\n");

    }    
    
    public void mostrarVehiculosEnemigo(){
        int cont =0, contV = vehiculo.size();
        while(cont<contV){
            System.out.println((cont+1)+". "+vehiculo.get(cont).getName());
            cont++;
        }
    }
}
