/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

import edificaciones.CentroMandoMagos;
import edificaciones.CuartelMagos;
import edificaciones.Edificaciones;
import edificaciones.FabricaAutoVolador;
import edificaciones.FabricaEscoba;
import edificaciones.RecolectorGaleon;
import edificaciones.RecolectorKnut;
import edificaciones.RecolectorSickle;
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
            case "escuadron":
                return new EscuadronesMagos();
            case "especialista":
                return new EspecialistaMago();
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
