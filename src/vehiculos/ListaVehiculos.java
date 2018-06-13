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
        Vehiculos vehi = factoryV.getVehiculo("escoba");
        vehiculo.add(vehi);
    }
    
    public void agregarAutoVolador() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos vehi = factoryV.getVehiculo("autovolador");
        vehiculo.add(vehi);
    }
    
    public void agregarNave() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos vehi = factoryV.getVehiculo("nave");
        vehiculo.add(vehi);
    }
    
    public void agregarJuggernaut() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos vehi = factoryV.getVehiculo("juggernaut");
        vehiculo.add(vehi);
    }
    
    public void agregarAvioneta() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos vehi = factoryV.getVehiculo("avioneta");
        vehiculo.add(vehi);
    }
    
    public void agregarTanque() {
        AbstractFactory factoryV;
        factoryV =  FactoryProducer.getFactory("vehiculo");
        Vehiculos vehi = factoryV.getVehiculo("tanque");
        vehiculo.add(vehi);
    }
    
    public void mostrarListaEdificaciones(){
        vehiculo.forEach((vhc) -> {
            System.out.println(vhc.toString());
        });
        System.out.println("\n");

    }    
}
