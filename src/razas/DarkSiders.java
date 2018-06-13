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
public class DarkSiders implements Razas{
    String raza = "Dark Sider";
    
    @Override
    public void seleccionar(){
        System.out.println("Somos malvados");
    }
    
    @Override
    public String mostrarRaza(String raza){
        return raza;
    }
}
