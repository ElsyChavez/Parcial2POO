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
            case "recolector1":
                return new RecolectorGaleon();
            case "recolector2":
                return new RecolectorSickle();
            case "recolector3":
                return new RecolectorKnut();
            case "fabrica1":
                return new FabricaEscoba();
            case "fabrica2":
                return new FabricaAutoVolador();
            case "cuartel":
                return new CuartelMagos();
            case "centro":
                return new CentroMandoMagos();
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
