
package Modelo.Programa_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revista {
    
    private List<Articulo> articulos;
    private String isdn;
    private int numeroEdicion;
    private String nombre;
    private String idioma;
    
    
    public Revista(){
        articulos=new ArrayList<Articulo>();
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
 
    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
    }
}
