/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 *
 * @author mferrema35.alumnes
 */
public class Cliente {
    int numerotel;
    int DNI;
    String nombre;
    
    public Cliente (int num, String name, int dni) {
        numerotel = num;
        nombre = name;
        DNI = dni;
    }
    
    public void actualizarnombre(String name) {
        nombre = name;
    }
    
    public void actualizardni(int dni) {
        DNI = dni;
    }
    
    public void actualizartel(int num) {
        numerotel = num;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public int getNumero() {
        return numerotel;
    }
    
    @Override
    public String toString() {
        String salida =  "Nombre: " + nombre + "\n" +"Numero de telefono: " + numerotel + "\n" + "DNI: " + DNI + "\n";
        return salida;
    }
}
