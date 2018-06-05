/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import edificaciones.Edificaciones;
import factory.AbstractFactory;
import milicia.Milicia;
import razas.Razas;
import vehiculos.Vehiculos;

/**
 *
 * @author elsyc
 */
public class FactoryRecursos implements AbstractFactory{
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
        switch (type){
            case "galeon":
                return new Galeon();
            case "sickle":
                return new Sickle();
            case "knut":
                return new Knut();
            case "sangre":
                return new Sangre();
            case "veneno":
                return new Veneno();
            case "diente":
                return new DienteDragon();
            case "dinero":
                return new Dinero();
            case "credito":
                return new Credito();
            case "cupon":
                return new Cupon();
            }
        return null;
    }
    
    @Override 
    public Vehiculos getVehiculo(String type){
        return null;
    }
}
