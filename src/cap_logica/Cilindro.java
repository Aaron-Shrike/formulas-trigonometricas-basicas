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
public class Cilindro {
    private int altura;
    private int radio;

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
    
    public float calcularAreaLateral(){
        return (float)(2 * Math.PI * radio * altura);
    }
    
    public float calcularAreaTotal(){
        return (float)(2 * Math.PI * (radio + altura));
    }
    
    public float calcularVolumen(){
        return (float)(Math.PI * Math.pow(radio, 2));
    }
}
