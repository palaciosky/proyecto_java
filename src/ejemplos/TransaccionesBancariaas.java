package ejemplos;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zc201
 */
public class TransaccionesBancariaas {
    
    
    public static void main(String[] args) {
    Cliente propetario = new Cliente();
    cuentaBancaria Bank = new cuentaBancaria();
    Scanner lee = new Scanner(System.in);
    
    
    double abono, retiro;
    
        System.out.println("------------------------------------------");
        System.out.println("Nombre de propetario");
        propetario.nombrecliente = lee.nextLine();
        System.out.println("Numero de documento unico de identidad ");
        propetario.DUICliente = lee.nextLine();
        System.out.println("Ingrese telefono ");
        propetario.telefonoclient = lee.nextLong();
        
        Bank.propetarioCuenta = propetario;
        
        
        
        System.out.println("Igrese la cantidad a Abonar");
        Bank.abonar(abono = lee.nextDouble());
        System.out.println("Ingrese la cantidad a retirar");
        Bank.retirar(retiro = lee.nextDouble());
        
        System.out.println("Datos del propetario   :\n"+Bank.datospropiedadCliente());
        System.out.println("Su saldo principal es  "+Bank.saldoCuenta);
        //usa inf del propetario
        
        
    }
}
