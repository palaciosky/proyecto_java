/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salario_empleado;

/**
 *
 * @author zc201
 */
public class ejercicio1 {
    //////////////
     long Nit;
     String Apellidos, Nombres, Direccion;
     double  Salario_Dev , SalarioDesc;
     
     
     public ejercicio1(long Nit, String Nombres,String Apellidos,  String Direccion, double Salario_dev,double SalarioDesc)
     {
      this.Nit = Nit;
      this.Apellidos = Apellidos;
      this.Nombres = Nombres;
      this.Direccion = Direccion;
      this.Salario_Dev = Salario_dev;
      this.SalarioDesc = SalarioDesc;
      
      /////////////////////////////////////////////////////
      
     }
    
     public ejercicio1(){

     }
     
   
    public long getNit(){
     
         return Nit;
     }
    
    public void setNit(long Nit) {
    this.Nit = Nit;
    }
    /////////////////////////////
     public String getNombres(){
     
         return Nombres;
     }
    
    public void setNombres(String Nombres) {
    this.Nombres = Nombres;
    }
    ////////////////////////////////////
     public String getApellidos(){
     
         return Apellidos;
     }
    
    public void setApellidos(String Apellidos) {
    this.Apellidos = Apellidos;
    }
    ////////////////////////////////////
     public String getDireccion(){
     
         return Direccion;
     }
    
    public void setDireccion(String Direccion) {
    this.Direccion = Direccion;
    }
    ////////////////////////////////////
     public double getSalario_Dev(){
     
         return Salario_Dev;
     }
    
    public void setSalario_Dev(double Salario_Dev) {
    this.Salario_Dev = Salario_Dev;
    }
    ////////////////////////////////////
     public double getSalarioDesc(){
     
         return SalarioDesc;
     }
    
    public void setSalarioDesc(double SalarioDesc) {
    this.SalarioDesc = SalarioDesc;
    }
    
   public String Nombrest() {
   
       String f = "";
       f += "Su nombres es "+this.Nombres+"\n";
       f += "Su apellido es "+this.Apellidos+"\n";
       f += "Su direccion es "+this.Direccion+"\n";
       return f;
   }
   
   public void salariot (double salariosal) {
   SalarioDesc = salariosal*0.10;
   Salario_Dev = salariosal - SalarioDesc;
   
   }
    
}
