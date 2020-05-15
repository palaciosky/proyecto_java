/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura_electrica;

import java.util.Scanner;

/**
 *
 * @author Palacios
 */
public class ejercicio2base extends ejercicio2 {
    public static void main(String[] args) {
        double mesact, mesant;
  
        Scanner Leer = new Scanner (System.in);
    ejercicio2base eje = new ejercicio2base();
    
    System.out.println("Ingrese su N° Cuenta");
        eje.Nombre = Leer.nextLine();
        System.out.println("Ingrese el consumo actual");
        eje.salariot(mesact = Leer.nextDouble());
        System.out.println("Ingrese el consumo anterior");
        eje.salariot2(mesant = Leer.nextDouble());
        System.out.println("////////////////////////////////////");
        System.out.println(eje.Nombrest());
        System.out.println("El consumo es "+eje.var3+" kWh");
        System.out.println("El consumo diario es "+Math.floor(eje.consumod)+"kWh/d");
        System.out.println("El precio a cancelar es $"+Math.round((eje.preciocon)*100)/100+"");
    }
  
}
