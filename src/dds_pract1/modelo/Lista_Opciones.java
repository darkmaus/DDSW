/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 *
 * @author aleivaca9.alumnes
 */
public class Lista_Opciones {
    String opcionesPrincipales;
    String opcionesClientes;
    String opcionesPisos;
    
    public Lista_Opciones ()
    {
        opcionesPrincipales = "c - Area Clientes"   + "\n" +
        "p - Area Pisos"        + "\n" +
        "l - Lista de pisos"    + "\n" +
        "q - Salir";
        opcionesClientes= "Registrar nuevo cliente" + "\n" +
        "Editar información clientes"   + "\n" +
        "Salir";
        opcionesPisos = "Registrar nuevo piso"  + "\n" +
        "Editar informacion piso"    + "\n" +
        "Salir";
    }
    
    public String getOpcionesPrincipales() {
        return opcionesPrincipales;
    }

    public String getOpcionesClientes() {
        return opcionesClientes;
    }

    public String getOpcionesPisos() {
        return opcionesPisos;
    }

    
    /*
    Volia preguntar perque necessitem aquests sets?
    - pregunta en Sistach -
    */
    public void setOpcionesPrincipales(String OpcionesPrincipales) {
        this.opcionesPrincipales = OpcionesPrincipales;
    }

    public void setOpcionesClientes(String OpcionesClientes) {
        this.opcionesClientes = OpcionesClientes;
    }

    public void setOpcionesPisos(String OpcionesPisos) {
        this.opcionesPisos = OpcionesPisos;
    }
    
    
}
