/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import edificaciones.Edificaciones;
import factory.AbstractFactory;
import milicia.Milicia;
import razas.Razas;
import recursos.Recursos;

/**
 *
 * @author elsyc
 */
public class FactoryVehiculos implements AbstractFactory{
    @Override
    public Edificaciones getEdificacion(String type){
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
        switch (type){
            case "escoba":
                return new Escoba();
            case "autovolador":
                return new AutoVolador();
            case "nave":
                return new Nave();
            case "juggernaut":
                return new Juggernaut();
            case "avioneta":
                return new Avioneta();
            case "tanque":
                return new Tanque();
            
        }
        return null;
    }
}
