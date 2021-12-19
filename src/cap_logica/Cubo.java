/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_logica;

/**
 *
 * @author Sh
 */
public class Cubo {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public float calcularAreaLateral(){
        return (float)(4 * Math.pow(lado, 2));
    }
    
    public float calcularAreaTotal(){
        return (float)(6 * Math.pow(lado, 2)); 
    }
    
    public float calcularVolumen(){
        return (float)Math.pow(lado, 3); 
    }
}
