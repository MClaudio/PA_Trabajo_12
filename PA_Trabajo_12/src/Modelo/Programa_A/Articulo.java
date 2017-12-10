
package Modelo.Programa_A;

public class Articulo {
    private String titulo;
    private String abstrac;
    private int paginaInicio;
    private int paginaFin;	
    private Autor autor;

    public Articulo(String titulo, String abstrac, int paginaInicio, int paginaFin) {
        this.titulo = titulo;
        this.abstrac = abstrac;
        this.paginaInicio = paginaInicio;
        this.paginaFin = paginaFin;
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

    public int getPaginaInicio() {
        return paginaInicio;
    }

    public void setPaginaInicio(int paginaInicio) {
        this.paginaInicio = paginaInicio;
    }

    public int getPaginaFin() {
        return paginaFin;
    }

    public void setPaginaFin(int paginaFin) {
        this.paginaFin = paginaFin;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", abstrac=" + abstrac + ", paginaInicio=" + paginaInicio 
                + ", paginaFin=" + paginaFin + ", autor=" + autor + '}';
    }
    
    
}
