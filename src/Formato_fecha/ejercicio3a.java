/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formato_fecha;

/**
 *
 *  * /////////////////////////////////////////////////////////////////
 * /////
 * ////        FORMATOS DE FECHA 
 * ////
 * ////////////////////////////////////////////////////////////////
 */
public  class ejercicio3a {
    
    int dia;
    int mes;
    int año;
    
  
     public void setdia(int dia) {
    this.dia = dia;
    }
    ////////////////////////////////////
     public double getdia(){
     
         return dia;
     }
 /////////////////
    ///////////////
     public void setmes(int mes) {
    this.mes = mes;
    }
    ////////////////////////////////////
     public double getmes(){
     
         return mes;
     }
 /////////////////
    ///////////////   
   public void setaño(int año) {
    this.año = año;
    }
    ////////////////////////////////////
     public double getaño(){
     
         return año;
     }
    /////////LOS METODOS PA IMPRIMIR LA FECHA EN DIFERENTES FORMATOS
     public String Fpleca() {
   
       String f = "";
       f += "La fecha es "+this.dia+"/"+this.mes+"/"+this.año+"\n";
       return f;
   }
    public String Flineanosexd() {
   
       String f = "";
       f += "La fecha es "+this.dia+"-"+this.mes+"-"+this.año+"\n";
       return f;
   }
    
    
    
    
    
    
    
}
