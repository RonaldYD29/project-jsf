package com.devpredator.projectjsf.controllers;

import com.devpredator.projectjsf.controllers.dto.UsuarioDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
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
    
    @ManagedProperty("#{sessionController}")
    private SessionController sessionController;

    public void ingresar() {
        System.out.println("Usuario: " + usuario);
        if (usuario.equals("devpredator") && password.equals("12345")) {
            try {
                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setUsuario(this.usuario);
                usuarioDTO.setPassword(this.password);
                this.sessionController.setUsuarioDTO(usuarioDTO);
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

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }

    
}
