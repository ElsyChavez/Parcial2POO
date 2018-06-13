/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

import factory.AbstractFactory;
import milicia.Milicia;
import razas.Razas;
import recursos.Recursos;
import vehiculos.Vehiculos;

/**
 *
 * @author elsyc
 */
public class FactoryEdificacion implements AbstractFactory{
    @Override
    public Edificaciones getEdificacion(String type){
        switch (type){
            case "recolector1M":
                return new Recolector1();
            case "recolector2M":
                return new Recolector2();
            case "recolector3M":
                return new Recolector3();
            case "fabrica1M":
                return new FabricaVehiculo1();
            case "fabrica2M":
                return new FabricaVehiculo2();
            case "cuartelM":
                return new Cuartel();
            case "centroM":
                return new CentroMando();
            case "recolector1D":
                return new Recolector1();
            case "recolector2D":
                return new Recolector2();
            case "recolector3D":
                return new Recolector3();
            case "fabrica1D":
                return new FabricaVehiculo1();
            case "fabrica2D":
                return new FabricaVehiculo2();
            case "cuartelD":
                return new Cuartel();
            case "centroD":
                return new CentroMando();
            case "recolector1MU":
                return new Recolector1();
            case "recolector2MU":
                return new Recolector2();
            case "recolector3MU":
                return new Recolector3();
            case "fabrica1MU":
                return new FabricaVehiculo1();
            case "fabrica2MU":
                return new FabricaVehiculo2();
            case "cuartelMU":
                return new Cuartel();
            case "centroMU":
                return new CentroMando();
        }
        return null;
    }
    
    @Override 
    public Milicia getMilicia(String type){
        return null;
    }
    
    @Override
    public Razas getRaza(String type){
        return null;
    }
    
    @Override
    public Recursos getRecurso(String type){
        return null;
    }
    
    @Override 
    public Vehiculos getVehiculo(String type){
        return null;
    }
}
