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
    String[] opcionesPrincipales;
    String[] opcionesClientes;
    String[] OpcionesPisos;
    
    public Lista_Opciones ()
    {
        opcionesPrincipales = new String[5];
        opcionesPrincipales[0] = "Area Clientes";
        opcionesPrincipales[1] = "Area Pisos";
        opcionesPrincipales[2] = "Lista de pisos";
        opcionesPrincipales[3] = "Salir";
        opcionesClientes= new String[5];
        opcionesClientes[0] = "Registrar nuevo cliente";
        opcionesClientes[1] = "Editar información clientes";
        opcionesClientes[2] = "Salir";
        OpcionesPisos = new String [5];
        OpcionesPisos[0] = "Registrar nuevo piso";
        OpcionesPisos[1] = "Editar informacion piso";
        OpcionesPisos[2] = "Salir";
    }
    
    public String[] getOpcionesPrincipales() {
        return opcionesPrincipales;
    }

    public String[] getOpcionesClientes() {
        return opcionesClientes;
    }

    public String[] getOpcionesPisos() {
        return OpcionesPisos;
    }

    public void setOpcionesPrincipales(String[] OpcionesPrincipales) {
        this.opcionesPrincipales = OpcionesPrincipales;
    }

    public void setOpcionesClientes(String[] OpcionesClientes) {
        this.opcionesClientes = OpcionesClientes;
    }

    public void setOpcionesPisos(String[] OpcionesPisos) {
        this.OpcionesPisos = OpcionesPisos;
    }
    
    
}
