package com.devpredator.projectjsf.controllers;

import com.devpredator.projectjsf.controllers.entity.Empleado;
import com.devpredator.projectjsf.controllers.services.EmpleadoService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PrincipalController {

    private List<Empleado> empleados;

    private EmpleadoService empleadoService = new EmpleadoService();
    
    @PostConstruct
    public void init(){
        this.consultarEmpleados();
    }

    public void consultarEmpleados() {
        this.empleados = this.empleadoService.consultarEmpleados();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
