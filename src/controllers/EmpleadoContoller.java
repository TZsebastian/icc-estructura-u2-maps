package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;
    
    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /**
     * Empleado
     * @param Empleado a ingresar al mapa
     * @return Flase si no ingreso porque ya existe
     *         True si ingreso correctamente
     */ 
    public boolean addEmpleado(Empleado empleado){

        if(empleados.containsKey(empleado.getId())){
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /**
     * Buscar el empleado por su id
     * @param id id del empleado a buscar
     * @return empleado segun id
     */
    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres(){
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue().getName());
        }
    }

    //Sin usar entrySet
    public void displayLlaves(){
        for (Integer key : empleados.keySet()){
            System.out.println(key);
        }
    }

    public void displayEmpleados2(){
        for (Empleado valor: empleados.values()){
            System.out.println(valor);
        }
    }
}