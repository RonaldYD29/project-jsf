/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devpredator.projectjsf.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class SessionClosedController {
    
    @PostConstruct
    public void init(){
        System.out.println("Cerrar sesión...");
    }
    
    public void cerrarSession(){
    ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
    externalContext.invalidateSession();
    
        try {
            this.redireccionar("login.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    private void redireccionar(String pagina) throws IOException{
    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    ec.redirect(pagina);
    }
}
