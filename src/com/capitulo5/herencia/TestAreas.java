
package com.capitulo5.herencia;

public class TestAreas {

 
    public static void main(String[] args) {
        // TODO code application logic here

        Area a=new Area(new Cuadrado(4));
        System.out.println(a.calcular());

    }
    
}
