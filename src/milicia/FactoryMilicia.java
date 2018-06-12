/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

import edificaciones.Edificaciones;
import factory.AbstractFactory;
import razas.Razas;
import recursos.Recursos;
import vehiculos.Vehiculos;

/**
 *
 * @author elsyc
 */
public class FactoryMilicia implements AbstractFactory{
    @Override
    public Edificaciones getEdificacion(String type){
        return null;
    }
    
    @Override 
    public Milicia getMilicia(String type){
        switch (type){
            case "escuadronmagos":
                return new EscuadronesMagos();
            case "especialistamago":
                return new EspecialistaMago();
            case "escuadrondark":
                return new EscuadronDark();
            case "especialistadark":
                return new EspecialistaDark();
            case "escuadronmuggle":
                return new EscuadronMuggle();
            case "especialistamuggle":
                return new EspecialistaMuggle();
        }
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
