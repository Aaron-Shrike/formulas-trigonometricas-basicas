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
public class Triangulo {
    private int catetoA;
    private int catetoB;

    public int getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(int catetoA) {
        this.catetoA = catetoA;
    }

    public int getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(int catetoB) {
        this.catetoB = catetoB;
    }

    public Triangulo() {
        this.catetoA = 0;
        this.catetoB = 0;
    }
 
    public Triangulo(int catetoA, int catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
    }

    public float calcularHipotenusa(){
        return (float)Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
    
    public float calcularPerimetro(){
        return catetoA + catetoB + calcularHipotenusa();
    }
}
