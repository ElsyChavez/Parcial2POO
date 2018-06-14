/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones;

/**
 *
 * @author Ivis Chavez
 */
public class CentroMandoDark implements Edificaciones{
    int vida = 10000;
    String name = "Centro Mando Dark";
    int sangre = 500, dientedragon = 1000, veneno = 600;
   
    @Override
    public int getRecurso1(){
        return sangre;
    }
    
    @Override
    public int getRecurso2(){
        return dientedragon;
    }
    
    @Override
    public int getRecurso3(){
        return veneno;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    public String toString() {
            return "Centro de Mando Dark-> Recursos: Sangre("+sangre+"), DienteDragon(" +dientedragon+ "), Veneno("+veneno+"). Vida = "+vida;
    }
    
    @Override
    public void construir(){
        System.out.println("Construyendo Edificio mas importante de la raza DarkSider");
    }
    @Override
    public String getName(){
        return name;
    }
    
}
