/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_presentacion;

import basicas.Consola;
import cap_logica.Cilindro;
import cap_logica.Cono;
import cap_logica.Cubo;
import cap_logica.Triangulo;

/**
 *
 * @author Sh
 */
public class Principal {

    public static Consola con = new Consola();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        do{
            opcion = menu();
            
            switch(opcion){
                case 1:
                    Triangulo tria = new Triangulo();
                    
                    System.out.println("");
                    tria.setCatetoA(con.leer("Ingrese catero A", 1, 100, "Rango incorrecto"));
                    tria.setCatetoB(con.leer("Ingrese catero B", 1, 100, "Rango incorrecto"));
                    
                    System.out.println("\n\n-- TRIANGULO --");
                    System.out.println("CATETO A: " + tria.getCatetoA());
                    System.out.println("CATETO B: " + tria.getCatetoB());
                    System.out.println("Hipotenusa: " + tria.calcularHipotenusa());
                    System.out.println("Perimetro: " + tria.calcularPerimetro());
                    break;
                case 2:
                    Cubo cubo = new Cubo();
                    
                    System.out.println("");
                    cubo.setLado(con.leer("Ingrese lado", 1, 100, "Rango incorrecto"));
                    
                    System.out.println("\n\n-- CUBO --");
                    System.out.println("LADO: " + cubo.getLado());
                    System.out.println("Area Lateral: " + cubo.calcularAreaLateral());
                    System.out.println("Area Total: " + cubo.calcularAreaTotal());
                    System.out.println("Volumen: " + cubo.calcularVolumen());
                    break;
                case 3:
                    Cilindro cili = new Cilindro();
                    
                    System.out.println("");
                    cili.setAltura(con.leer("Ingrese altura", 1, 100, "Rango incorrecto"));
                    cili.setRadio(con.leer("Ingrese radio", 1, 100, "Rango incorrecto"));
                    
                    System.out.println("\n\n-- CILINDRO --");
                    System.out.println("ALTURA: " + cili.getAltura());
                    System.out.println("RADIO: " + cili.getRadio());
                    System.out.println("Area Lateral: " + cili.calcularAreaLateral());
                    System.out.println("Area Total: " + cili.calcularAreaTotal());
                    System.out.println("Volumen: " + cili.calcularVolumen());
                    break;
                case 4:
                    Cono cono = new Cono();
                    
                    System.out.println("");
                    cono.setAltura(con.leer("Ingrese altura", 1, 100, "Rango incorrecto"));
                    cono.setRadio(con.leer("Ingrese radio", 1, 100, "Rango incorrecto"));
                    cono.setG(con.leer("Ingrese generatriz", 1, 100, "Rango incorrecto"));
                    
                    System.out.println("\n\n-- CONO --");
                    System.out.println("ALTURA: " + cono.getAltura());
                    System.out.println("RADIO: " + cono.getRadio());
                    System.out.println("G: " + cono.getG());
                    System.out.println("Area Lateral: " + cono.calcularAreaLateral());
                    System.out.println("Area Total: " + cono.calcularAreaTotal());
                    System.out.println("Volumen: " + cono.calcularVolumen());
                    break;
            }
        }while(opcion < 5);
    }
    
    public static int menu(){
        int op;
        
        System.out.println("\n\n\n");
        System.out.println("---- MENU ----");
        System.out.println("[1]Triangulo");
        System.out.println("[2]Cubo");
        System.out.println("[3]Cilindro");
        System.out.println("[4]Cono");
        System.out.println("[5]Salir");
        op = con.leer("Ingrese opcion", 1, 5, "Opcion incorrecta");
    
        return op;
    }
    
}
