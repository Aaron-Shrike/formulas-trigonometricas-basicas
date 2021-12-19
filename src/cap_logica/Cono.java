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
public class Cono {
    private int altura;
    private int radio;
    private int g;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
    
    public float calcularAreaLateral(){
        return (float)(Math.PI * radio * g);
    }
    
    public float calcularAreaTotal(){
        return (float)(Math.PI * radio * (radio + g));
    }
    
    public float calcularVolumen(){
        return (float)((Math.PI * Math.pow(radio, 2) * altura)/3);
    }
}
