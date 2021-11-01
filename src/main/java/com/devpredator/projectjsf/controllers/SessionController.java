/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devpredator.projectjsf.controllers;

import com.devpredator.projectjsf.controllers.dto.UsuarioDTO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class SessionController {
    
    private UsuarioDTO usuarioDTO;
    
    public void init(){
        System.out.println("Cargando información del usuario en la sesión ...");
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }
    
    
}
