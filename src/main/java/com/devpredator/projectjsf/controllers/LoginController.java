package com.devpredator.projectjsf.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author sistema
 *
 */
@ManagedBean
public class LoginController {

    private String usuario;
    private String password;

    public void ingresar() {
        System.out.println("Usuario: " + usuario);
        if (usuario.equals("devpredator") && password.equals("12345")) {
            try {
                this.redireccionar("principal.xhtml");
            } catch (IOException ex) {
               FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Pagina no Existe", ""));
            }

        } else {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));
        }
    }

    private void redireccionar(String pagina) throws IOException{
    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
    ec.redirect(pagina);
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
