/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author elsyc
 */
public class Muggles implements Razas{
    String raza = "muggle";
    
    @Override
    public void seleccionar(){
        System.out.println("Conocemos la tecnologia actual.");
    }
    @Override
    public String mostrarRaza(String raza){
        return raza;
    }
    
    
}
