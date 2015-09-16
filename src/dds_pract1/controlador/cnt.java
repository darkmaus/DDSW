/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.controlador;

import dds_pract1.modelo.Cliente;
import dds_pract1.modelo.Piso;
import java.util.ArrayList;

/**
 *
 * @author asistare7.alumnes
 */
public class cnt
{
    ArrayList<Cliente> llistaClients;
    Cliente tmpClient;
    Piso tmpPiso;
    ArrayList<Piso> llistaPisos;
    
    public cnt ()
    {
        llistaClients = new ArrayList<Cliente> ();
        llistaPisos = new ArrayList<Piso>();
    }
    
    //PISOS//
    public void AddPiso() {
        tmpPiso = new Piso();
        llistaPisos.add(tmpPiso);
    }
    public String ShowListPisos () {
        String lista = "";
        for(int i = 0; i < llistaPisos.size(); ++i) {
            lista += i + " " + llistaPisos.get(i);
        }
        return lista;
    }
    public void SeleccionarPiso(int k) {
        tmpPiso = llistaPisos.get(k);
    }
    public void EdtiPrecio(double k) {
        tmpPiso.setPrecio(k);
    }
    public void EditNum(int k) {
        tmpPiso.setNum(k);
    }
    public void EditDireccion(String s) {
        tmpPiso.setDireccion(s);
    }
    public void EditSuperficie(double k) {
        tmpPiso.setSuperficie(k);
    }
    
    /*********** clients ***************/

    /*********** ADD client ***********/
    public void AddClientBegin ()
    {   tmpClient = new Cliente (); }
    public void AddClientEnd ()
    {   llistaClients.add ( tmpClient ); }

    /*********** Show client **********/
    public String ShowListClients ()
    {
        String o = "";
        int i;
        
        for (i = 0; i < llistaClients.size(); i++)
            o += i + " " + llistaClients.get(i);
        return o;
    }
    
    /*********** Edit client ***********/
    public void SelectionClient (int e)
    {   tmpClient = llistaClients.get(e); }
    public void EditClientName (String e)
    {   tmpClient.setName(e); }
    public void EditClientDNI (int e)
    {   tmpClient.setDNI(e); }
    public void EditClientNumberHotel (int e)
    {   tmpClient.setNumberHotel(e); }
    
}
