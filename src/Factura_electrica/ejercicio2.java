/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura_electrica;

/**
 * /////////////////////////////////////////////////////////////////
 * /////
 * ////        FACTURA ELECTRICA 
 * ////
 * /////////////////////////////////////////////////////////////////
 * @author Palacios
 */
public class ejercicio2 {
    String Nombre;
    double consumod, preciocon, val, var1, var2, var3;

  

public String getNombre(){
     
         return Nombre;
     }
    
    public void setNombre(String Nombre) {
    this.Nombre = Nombre;
    }
    /////////////////
    ///////////////
    public void setconsumod(double consumod) {
    this.consumod = consumod;
    }
    ////////////////////////////////////
     public double getconsumod(){
     
         return consumod;
     }
 /////////////////
    ///////////////
    public void setconsumom(double consumom) {
    this.preciocon = consumom;
    }
    ////////////////////////////////////
     public double getconsumom(){
     
         return preciocon;
     }
/////////////////
    ///////////////
    public void setval(double val) {
    this.val = val ;
    }
    ////////////////////////////////////
     public double getval(){
     
         return val;
     }
     /////////////////
    ///////////////
    public void setvar1(double var1) {
    this.var1 = var1;
    }
    ////////////////////////////////////
     public double getvar1(){
     
         return var1;
     }
     /////////////////
    ///////////////
    public void setvar2(double var2) {
    this.var2 = var2;
    }
    ////////////////////////////////////
     public double getvar2(){
     
         return var2;
     }
     /////////////////
    ///////////////
    public void setvar3(double var3) {
    this.var3 = var3;
    }
    ////////////////////////////////////
     public double getvar3(){
     
         return var3;
     }
public String Nombrest() {
   
       String f = "";
       f += "El N° de cuenta es "+this.Nombre+"\n";
       return f;
   }
public void salariot (double mesact) {
   
        var1 = mesact ;
        
        
   }
public void salariot2 (double mesant)
{
var2 = mesant;
        var3 = (var1 - var2)*10;
        consumod = var3 / 30;
        preciocon = var3 * 0.20;
}


}

