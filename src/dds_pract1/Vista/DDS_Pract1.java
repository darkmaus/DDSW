/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

import java.util.Scanner;

import dds_pract1.modelo.Lista_Opciones;
/**
 *
 * @author aleivaca9.alumnes
 */
public class DDS_Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean bigWhile = true;
        Lista_Opciones strings = new Lista_Opciones ();
        
        System.out.println("Buenos días señor, bienvenido a BBB escoja la opcion deseada:");
        
        while (bigWhile)
        {
            System.out.println (strings.getOpcionesPrincipales());
            //Aqui empezamos a escoger la opción que quiera el empresario
            switch(scanner.nextLine()){
                case("c"):
                //Llamamos a la opción area clientes
                    //switch Editar/Registrar cliente
                break;
                case("p"):
                //llamamos la opción de registrar pisos
                    //switch Editar/Registrar pisos
                break;
                case("l"):
                //visualizamos lista de pisos para escoger el piso a visitar
                     //switch lista de pisos
                break;
                case("q"):
                    bigWhile = false;
                break;
            }
        }
    }
    
}
