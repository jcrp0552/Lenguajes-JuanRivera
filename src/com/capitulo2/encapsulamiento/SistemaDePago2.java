/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo2.encapsulamiento;

import com.capitulo1.abstraccion.*;
import com.capitulo2.encapsulamiento.Usuario;
import com.capitulo2.encapsulamiento.Pago;

/**
 *
 * @author campitos
 */
public class SistemaDePago2 {


    public static void main(String args[]){
     Usuario u = new Usuario();
     u.setNombre("pedro");
    // u.setHorasTrabajadas(40);
   //  u.setSueloBase(3000); 
     Pago p=new Pago();
     p.hacerPago(u);
    }
    
    
}
