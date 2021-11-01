
package com.devpredator.projectjsf.controllers.services;

import com.devpredator.projectjsf.controllers.entity.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sistema
 */
public class EmpleadoService {
    
    public List<Empleado> consultarEmpleados(){
    List<Empleado> empleados = new ArrayList<Empleado>();
    
    Empleado empleadoIBM = new Empleado();
    Empleado empleadoMicrosoft = new Empleado();
    Empleado empleadoApple = new Empleado();
    
    Empleado empleadoNetflix = new Empleado();
    Empleado empleadoDisney = new Empleado();
    Empleado empleadoFox = new Empleado();
    Empleado empleadoHP = new Empleado();
    Empleado empleadoEpson = new Empleado();
    Empleado empleadoOracle = new Empleado();
    
    empleadoIBM.setNombre("Diego");
    empleadoIBM.setPrimerApellido("Diaz");
    empleadoIBM.setSegundoApellido("cruz");
    empleadoIBM.setPuesto("Senior Developer Java");
    empleadoIBM.setStatus(true);
    
    empleadoMicrosoft.setNombre("Ronald");
    empleadoMicrosoft.setPrimerApellido("arbol");
    empleadoMicrosoft.setSegundoApellido("dioni");
    empleadoMicrosoft.setPuesto("Analista");
    empleadoMicrosoft.setStatus(true);
    
    empleadoApple.setNombre("Sebas");
    empleadoApple.setPrimerApellido("Isidrio");
    empleadoApple.setSegundoApellido("Plin");
    empleadoApple.setPuesto("Jefe");
    empleadoApple.setStatus(true);
    
    empleadoNetflix.setNombre("Sebas");
    empleadoNetflix.setPrimerApellido("Isidrio");
    empleadoNetflix.setSegundoApellido("Plin");
    empleadoNetflix.setPuesto("Jefe");
    empleadoNetflix.setStatus(true);
    
    empleadoDisney.setNombre("Sebas");
    empleadoDisney.setPrimerApellido("Isidrio");
    empleadoDisney.setSegundoApellido("Plin");
    empleadoDisney.setPuesto("Jefe");
    empleadoDisney.setStatus(true);
    
    empleadoFox.setNombre("Sebas");
    empleadoFox.setPrimerApellido("Isidrio");
    empleadoFox.setSegundoApellido("Plin");
    empleadoFox.setPuesto("Jefe");
    empleadoFox.setStatus(true);
    
    empleadoEpson.setNombre("Sebas");
    empleadoEpson.setPrimerApellido("Isidrio");
    empleadoEpson.setSegundoApellido("Plin");
    empleadoEpson.setPuesto("Jefe");
    empleadoEpson.setStatus(true);
    
    empleadoOracle.setNombre("Sebas");
    empleadoOracle.setPrimerApellido("Isidrio");
    empleadoOracle.setSegundoApellido("Plin");
    empleadoOracle.setPuesto("Jefe");
    empleadoOracle.setStatus(true);
    
    empleados.add(empleadoIBM);
    empleados.add(empleadoMicrosoft);
    empleados.add(empleadoApple);
    empleados.add(empleadoIBM);
    empleados.add(empleadoNetflix);
    empleados.add(empleadoDisney);
    empleados.add(empleadoFox);
    empleados.add(empleadoEpson);
    empleados.add(empleadoOracle);
    
    return empleados;
    }
    
}
