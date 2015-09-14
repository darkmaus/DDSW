/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1;

/**
 *
 * @author aleivaca9.alumnes
 */
public class Lista_Opciones {
    String[] opcionesPrincipales = new String[5];
    opcionesPrincipales[0] = "Area Clientes";
    opcionesPrincipales[0] = "Area Pisos";
    opcionesPrincipales[0] = "Lista de pisos";
    opcionesPrincipales[0] = "Salir"
    String[] opcionesClientes= new String[5];
    opcionesClientes[0] = "Registrar nuevo cliente";
    opcionesClientes[1] = "Editar información clientes";
    opcionesClientes[2] = "Salir"
    String[] OpcionesPisos = new String [5];
    OpcionesPisos[0] = "Registrar nuevo piso";
    OpcionesPisos[1] = "Editar informacion piso";
    OpcionesPiso[2] = "Salir";
    public String[] getOpcionesPrincipales() {
        return OpcionesPrincipales;
    }

    public String[] getOpcionesClientes() {
        return OpcionesClientes;
    }

    public String[] getOpcionesPisos() {
        return OpcionesPisos;
    }

    public void setOpcionesPrincipales(String[] OpcionesPrincipales) {
        this.OpcionesPrincipales = OpcionesPrincipales;
    }

    public void setOpcionesClientes(String[] OpcionesClientes) {
        this.OpcionesClientes = OpcionesClientes;
    }

    public void setOpcionesPisos(String[] OpcionesPisos) {
        this.OpcionesPisos = OpcionesPisos;
    }
    
    
}
