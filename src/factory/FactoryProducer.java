/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import edificaciones.FactoryEdificacion;
import milicia.FactoryMilicia;
import razas.FactoryRaza;
import recursos.FactoryRecursos;
import vehiculos.FactoryVehiculos;

/**
 *
 * @author elsyc
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "edificacion":
                return new FactoryEdificacion();
            case "milicia":
                return new FactoryMilicia();
            case "raza":
                return new FactoryRaza();
            case "recurso":
                return new FactoryRecursos();
            case "vehiculo":
                return new FactoryVehiculos();
        }
        return null;
    }
}
