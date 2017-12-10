
package Modelo.Programa_A;

import java.util.Arrays;

public class Revista {
    
    private Articulo[] articulos;
    
    private String isdn;
    private int numeroEdicion;
    private String nombre;
    private String idioma;
    private int numeroArticulos;
    
    public Revista(){
        articulos=new Articulo[10];
        numeroArticulos=0;
    }

    public Revista(String isdn, int numeroEdicion, String nombre, String idioma, int numeroArticulos) {
        this.isdn = isdn;
        this.numeroEdicion = numeroEdicion;
        this.nombre = nombre;
        this.idioma = idioma;
        this.numeroArticulos = numeroArticulos;
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
  
    public Articulo[] getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo[] articulos) {
        this.articulos = articulos;
    }
    
    public void agrgarArticulo(int pos, Articulo articulo) {
		articulos[pos] = articulo;		
    }
    
    public void agrgarArticulo(Articulo articulo) {
            articulos[numeroArticulos] = articulo;
            numeroArticulos ++;
    }

    public int getNumeroArticulos() {
        return numeroArticulos;
    }

    public void setNumeroArticulos(int numeroArticulos) {
        this.numeroArticulos = numeroArticulos;
    }

    @Override
    public String toString() {
        return "Revista{" + "isdn=" + isdn + ", numeroEdicion=" + numeroEdicion + ", nombre=" + nombre 
                + ", idioma=" + idioma + ", numeroArticulos=" + Arrays.toString(articulos) + '}';
    }
    
    
    
}
