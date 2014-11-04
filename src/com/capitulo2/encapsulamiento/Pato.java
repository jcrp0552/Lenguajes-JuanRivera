
package com.capitulo2.encapsulamiento;


public class Pato {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerCuac(String cuac){
        System.out.println(cuac);
    }
}
