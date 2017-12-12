
package Controlador;

import Modelo.Programa_B.Canton;
import Modelo.Programa_B.Pais;
import Modelo.Programa_B.Provincia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GD_Programa_B {
    
    private List<Pais>paises;
    private List<Provincia>provincias;
    private List<Canton>cantones;
    private File archivo;
    
    public GD_Programa_B(String pathname){
        paises=new ArrayList<Pais>();
        provincias=new ArrayList<Provincia>();
        cantones=new ArrayList<Canton>();
        archivo=new File(pathname);
    }
    
    public void agregarPais(String nombreContinente, String nombrePais, String idioma) throws IOException{
        System.out.println(archivo.getAbsolutePath());
        if (archivo.exists()) {
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(nombreContinente +" | "+ nombrePais +" | "+ idioma +" |\n ");
            escritura.close();
        }
        
    }
    
    public void agregarProvincia(String nombreProvincia, String region, String gobernador) throws IOException{
        System.out.println(archivo.getAbsolutePath());
        if(archivo.exists()){
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(nombreProvincia +" | "+ region +" | "+ gobernador +" |\n ");
            escritura.close();
        }
    }   
    
    public void agregarCanton(String nombreCanton, String codigoPostal, String numeroHabitantes) throws IOException{
        System.out.println(archivo.getAbsolutePath());
        if(archivo.exists()){
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(nombreCanton +" | "+ codigoPostal +" | "+ numeroHabitantes +" |\n ");
            escritura.close();
        }
    }
    
    public List<Pais> listarPais(){
        return null;
        
    }
    
    public List<Provincia> listarProvincia(){
        return null;
        
    }
    
    
    public List<Canton> listarCanton(){
        return null;
        
    }
}
