/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import edificaciones.Edificaciones;
import milicia.Milicia;
import razas.Razas;
import recursos.Recursos;
import vehiculos.Vehiculos;

/**
 *
 * @author elsyc
 */
public interface AbstractFactory {
    Edificaciones getEdificacion(String type);
    Razas getRaza(String type);
    Recursos getRecurso(String type);
    Vehiculos getVehiculo(String type);
    Milicia getMilicia(String type);
}
