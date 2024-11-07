/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clasess;

import ec.edu.espoch.clasess.Clases.Persona;
import ec.edu.espoch.clasess.Enumeraciones.Dias;

/**
 *
 * @author PERSONAL
 */
public class Clasess {

    public static void main(String[] args) {
       Persona objPersona1 =  new Persona();
       objPersona1.nombre="Cristhian";
       objPersona1.apellidoPaterno="Valencia";
       objPersona1.apellidoMaterno="papa";
       
      //objPersona1.imprimir();
       
       Persona objPersona2 = new Persona();
       objPersona2.nombre="willian";
       objPersona2.apellidoPaterno="Caisaguano";
       objPersona2.apellidoMaterno="Guanoluisa";
       
      // objPersona2.imprimir();
       
       /* System.out.println("el nombre del obj 1 es: " +objPersona1.nombre);
        System.out.println("el nombre del obj 1 es: " +objPersona1.apellidoPaterno);
        System.out.println("el nombre del obj 1 es: " +objPersona1.apellidoMaterno);*/
       
        System.out.println("el dia es:"+ Dias.LUNES);
       
    }
}
