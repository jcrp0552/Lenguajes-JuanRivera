/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo5.herencia;

/**
 *
 * @author T107
 */
public class ProbarAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero perro=new Mamifero();
        perro.setNombre("Ludovico");
        System.out.println("Mi perro se llama:"+perro.getNombre());
    }
    
}
