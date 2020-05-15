/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formato_fecha;
import java.util.Scanner;

/**
 *
 * @author Palacios
 */
public class ejercicio3base extends ejercicio3a
{  
       

    public static void main(String[] args) {
         Scanner Leer = new Scanner (System.in);
      ejercicio3base aa = new ejercicio3base();
      
        System.out.println("///////////////////////////////////////");
        System.out.println("Ingrese El dia (DD) ");
         aa.dia = Leer.nextInt();
         System.out.println("Ingrese El mes (MM) ");
         aa.mes = Leer.nextInt();
         System.out.println("Ingrese El año (YYYY) ");
         aa.año = Leer.nextInt();
         System.out.println("////////////////////////////////////");
        System.out.println(aa.Fpleca());
        System.out.println("////////////////////////////////////");
        System.out.println(aa.Flineanosexd());
        
    }
}
