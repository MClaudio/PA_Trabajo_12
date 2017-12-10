/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Programa_C;

/**
 *
 * @author Cristian
 */
public class Departamento {
    
    private String nombreDep;
    private String nombreSupervisor;
    private int numeroDep;
    private Empleado empleado;

 
    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getNombreSupervisor() {
        return nombreSupervisor;
    }

    public void setNombreSupervisor(String nombreSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
    }

    public int getNumeroDep() {
        return numeroDep;
    }

    public void setNumeroDep(int numeroDep) {
        this.numeroDep = numeroDep;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
