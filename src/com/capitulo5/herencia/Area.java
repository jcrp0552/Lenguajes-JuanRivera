/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo5.herencia;


public class Area {
    Superficie c;

    public Area(Superficie c) {
        this.c = c;
    }
    public float calcular(){
       float area=c.calcularArea();
       return area;
    }
    
}
