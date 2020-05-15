package ejemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zc201
 */
public class cuentaBancaria {
    long numeroCuenta;
    Cliente propetarioCuenta;
    double saldoCuenta;
    
    public void abonar (double cantidad){
    saldoCuenta += cantidad;  //Lògica de negocio
    
    }
    public void retirar (double cantidad){
        if (cantidad > saldoCuenta) {
            System.out.println("Usted es pobre");
        }
        saldoCuenta -= cantidad;  
    
    }
    
    public String datospropiedadCliente () {
        String Inf = "";
        Inf += "DUI; "+propetarioCuenta.DUICliente+ "\n ";
        Inf += "Nombre; "+propetarioCuenta.nombrecliente+ "\n ";
        Inf += "Telefono; "+propetarioCuenta.telefonoclient+ "\n ";
        
        return Inf ;
    
    }
    
    
}
