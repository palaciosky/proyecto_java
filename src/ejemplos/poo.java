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
public class poo {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiante(){
        System.out.println("Metodo para registro de estudiante");
        
    }
    public void consultarEstudiante() {
        System.out.println("Metodo para consultar estudiantes");
    }
    
    public void eliminarEstudiante(){
        System.out.println("Metodo para eliminar de estudiante");
        
    }
    
    public static void main(String[] args) {
        poo po = new poo();
        po.carnet = 1234;
        po.nombre = "Amelia";
        po.apellido = "Rosales";
        
        
        po.registroEstudiante();
        po.consultarEstudiante();
        po.eliminarEstudiante();
        
        
        System.out.println("Carnet:   "+po.carnet);
        System.out.println("Nombre    "+po.nombre);
        System.out.println("Apellido  "+po.apellido);
        
    }
}
