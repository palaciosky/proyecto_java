/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario_empleado;

import java.util.Scanner;

/**
 *
 * @author zc201
 */
public class ejercicio1base extends ejercicio1 {
    
    public static void main(String[] args) {
        
    double abono, retiro;
         
    Scanner Leer = new Scanner (System.in);
    ejercicio1base ej = new ejercicio1base();
    
        System.out.println("Ingrese su nombre ");
        ej.Nombres = Leer.nextLine();
        System.out.println("Ingrese su apellido");
        ej.Apellidos = Leer.nextLine();
        System.out.println("Ingrese su direccion");
        ej.Direccion = Leer.nextLine();
        System.out.println("Ingrese su salario");
        ej.salariot(retiro = Leer.nextDouble());
        
        
        System.out.println(ej.Nombrest());
        System.out.println("Su salario es "+ej.Salario_Dev);
    
    }
}
