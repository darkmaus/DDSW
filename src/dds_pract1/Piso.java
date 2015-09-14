/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1;

/**
 *
 * @author mferrema35.alumnes
 */
public class Piso {
    double precio;
    int numpiso;
    double superficie;
    
    
    public Piso(double p, int n, double s) {
        precio = p;
        numpiso = n;
        superficie = s;
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
    
    public double getPrecio() {
        return precio;
    }
    
    public int getNumPiso() {
        return numpiso;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    @Override
    public String toString() {
        return "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n";
    }
    
}
