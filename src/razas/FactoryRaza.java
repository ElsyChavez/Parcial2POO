/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import edificaciones.Edificaciones;
import factory.AbstractFactory;
import milicia.Milicia;
import recursos.Recursos;
import vehiculos.Vehiculos;

/**
 *
 * @author elsyc
 */
public class FactoryRaza implements AbstractFactory {
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
        switch (type){
            case "mago":
                return new Magos();
            case "darksider":
                return new DarkSiders();
            case "muggle":
                return new Muggles();
        }
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
