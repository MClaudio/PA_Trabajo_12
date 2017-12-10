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
public class Empresa {
    
    private String nombreEmpresa;
    private String numeroRUC;
    private String numeroSocios;
    private Departamento departamento;

    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public String getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(String numeroSocios) {
        this.numeroSocios = numeroSocios;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
