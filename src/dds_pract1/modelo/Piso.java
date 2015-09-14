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
public class Piso {
    double precio;
    int numpiso;
    double superficie;
    String direccion;
    
    
    public Piso(double p, int n, double s, String d) {
        precio = p;
        numpiso = n;
        superficie = s;
        direccion = d;
    }
    
    public void actualizarPrecio(double p) {
        precio = p;
    }
    
    public void actualizarNum(int n) {
        numpiso = n;
    }
    
    public void actualizarSuperficie(int s) {
        superficie = s;
    }
    
    public void actualizarDireccion(String d) {
        direccion = d;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getNumPiso() {
        return numpiso;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public String toString() {
        return "Piso: " + numpiso + "\n" + "Direccion: " + direccion +"\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n";
    }
    
}
