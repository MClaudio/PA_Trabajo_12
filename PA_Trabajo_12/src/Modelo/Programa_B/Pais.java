
package Modelo.Programa_B;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    
    private String nombreContinente;
    private String nombrePais;
    private String idioma;
    private List<Provincia> provincias;
    
    public Pais(){
        provincias=new ArrayList<Provincia>();
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public List<Provincia> getProvincia() {
        return provincias;
    }

    public void setProvincia(List<Provincia> provincia) {
        this.provincias = provincia;
    }
    
    public void addProvincia(Provincia provincia){
        provincias.add(provincia);
    }
    
}
