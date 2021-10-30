
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
    
    empleados.add(empleadoIBM);
    empleados.add(empleadoMicrosoft);
    empleados.add(empleadoApple);
    
    return empleados;
    }
    
}
