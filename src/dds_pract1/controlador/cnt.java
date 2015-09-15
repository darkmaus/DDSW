/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.controlador;

import dds_pract1.modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author asistare7.alumnes
 */
public class cnt
{
    ArrayList<Cliente> llistaClients;
    Cliente tmpClient;
    
    public cnt ()
    {
        llistaClients = new ArrayList<Cliente> ();
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
