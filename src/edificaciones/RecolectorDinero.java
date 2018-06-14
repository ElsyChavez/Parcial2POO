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
public class RecolectorDinero implements Edificaciones{
    int vida = 1000;
    String name = "Recolector Dinero";
    int dinero = 0, credito, cupon;
   
    @Override
    public int getRecurso1(){
        return dinero;
    }
    
    @Override
    public int getRecurso2(){
        return credito;
    }
    
    @Override
    public int getRecurso3(){
        return cupon;
    }
    
    @Override
    public int getVida(){
        return vida;
    }
    
    public String toString() {
            return "Recolector Dinero-> Recursos: Dinero("+dinero+"). Vida = "+vida;
    }

    @Override
    public void construir(){
        System.out.println("Construyendo recolector de recurso 1 de la raza Muggle");
    }
    @Override
    public String getName(){
        return name;
    }    
}
