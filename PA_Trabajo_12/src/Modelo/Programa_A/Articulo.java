
package Modelo.Programa_A;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String titulo;
    private String abstrac;
    private String paginaInicio;
    private String paginaFin;	
    private List<Autor>autores;

    public Articulo() {
        autores=new ArrayList<Autor>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAbstrac() {
        return abstrac;
    }

    public void setAbstrac(String abstrac) {
        this.abstrac = abstrac;
    }

    public String getPaginaInicio() {
        return paginaInicio;
    }

    public void setPaginaInicio(String paginaInicio) {
        this.paginaInicio = paginaInicio;
    }

    public String getPaginaFin() {
        return paginaFin;
    }

    public void setPaginaFin(String paginaFin) {
        this.paginaFin = paginaFin;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
}
