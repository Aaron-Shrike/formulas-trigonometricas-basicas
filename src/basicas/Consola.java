/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.Scanner;

/**
 *
 * @author Sh
 */
public class Consola {
    private final Scanner leer = new Scanner(System.in);
    
    public int leer(String texto, int valorMin, int valorMax, String error){
        int dato;
        
        do{
            System.out.print(texto + " [" + valorMin + "-" + valorMax + "]: ");
            dato = leer.nextInt();
            
            if(dato < valorMin || dato > valorMax){
                System.out.println("\t*ERROR: " + error);
            }
        }while(dato < valorMin || dato > valorMax);
        
        return dato;
    }
    
    public float leer(String texto, float valorMin, float valorMax, String error){
        float dato;
        
        do{
            System.out.print(texto + " [" + valorMin + "-" + valorMax + "]: ");
            dato = leer.nextFloat();
            
            if(dato < valorMin || dato > valorMax){
                System.out.println("\t*ERROR: " + error);
            }
        }while(dato < valorMin || dato > valorMax);
        
        return dato;
    }
    
    public double leer(String texto, double valorMin, double valorMax, String error){
        double dato;
        
        do{
            System.out.print(texto + " [" + valorMin + "-" + valorMax + "]: ");
            dato = leer.nextDouble();
            
            if(dato < valorMin || dato > valorMax){
                System.out.println("\t*ERROR: " + error);
            }
        }while(dato < valorMin || dato > valorMax);
        
        return dato;
    }
    
    public String leer(String texto){
        String dato;
        
        System.out.print(texto);
        dato = leer.next();
        
        return dato;
    }
}
