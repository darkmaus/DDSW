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
    int numerhotel;
    int DNI;
    String nombre;
    
    public Cliente (int num, String name, int dni) {
        numerhotel = num;
        nombre = name;
        DNI = dni;
    }
    
    /* Concidero que normalment s'inicialitza sense saber que posar
    - Sistach -
    */
    public Cliente ()
    {
        numerhotel = 0;
        DNI = 0;
        nombre = "";
    }
    
    public void setName (String name) {
        nombre = name;
    }
    
    public void setDNI(int dni) {
        DNI = dni;
    }
    
    public void setNumberHotel (int num) {
        numerhotel = num;
    }
    
    public String getName() {
        return nombre;
    }
    
    public int getDNI() {
        return DNI;
    }
    
    public int getNumero() {
        return numerhotel;
    }
    
    @Override
    public String toString() {
        String salida =  "Nombre: " + nombre + "\n" +"Numero de telefono: " + numerhotel + "\n" + "DNI: " + DNI + "\n";
        return salida;
    }
}
