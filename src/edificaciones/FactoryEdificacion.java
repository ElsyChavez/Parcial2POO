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
                return new RecolectorGaleon();
            case "recolector2M":
                return new RecolectorSickle();
            case "recolector3M":
                return new RecolectorKnut();
            case "fabrica1M":
                return new FabricaEscoba();
            case "fabrica2M":
                return new FabricaAutoVolador();
            case "cuartelM":
                return new CuartelMagos();
            case "centroM":
                return new CentroMandoMagos();
            case "recolector1D":
                return new RecolectorSangre();
            case "recolector2D":
                return new RecolectorDienteDragon();
            case "recolector3D":
                return new RecolectorVeneno();
            case "fabrica1D":
                return new FabricaNave();
            case "fabrica2D":
                return new FabricaJuggernaut();
            case "cuartelD":
                return new CuartelDark();
            case "centroD":
                return new CentroMandoDark();
            case "recolector1MU":
                return new RecolectorDinero();
            case "recolector2MU":
                return new RecolectorCredito();
            case "recolector3MU":
                return new RecolectorCupon();
            case "fabrica1MU":
                return new FabricaAvioneta();
            case "fabrica2MU":
                return new FabricaTanque();
            case "cuartelMU":
                return new CuartelMuggle();
            case "centroMU":
                return new CentroMandoMuggle();
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
