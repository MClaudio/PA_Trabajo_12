
package Controlador;

import Modelo.Programa_A.Articulo;
import Modelo.Programa_A.Autor;
import Modelo.Programa_A.Revista;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GD_Programa_A {
    
    private List<Revista>revistas;
    private List<Articulo>articulos;
    private List<Autor>autores;
    private File archivo;
    
    public GD_Programa_A(String pathname){
        revistas=new ArrayList<Revista>();
        articulos=new ArrayList<Articulo>();
        autores=new ArrayList<Autor>();
        archivo=new File(pathname);
    }
    
    public void agragarRevista(String isdn, String numeroEdicion, String nombre, String idioma) throws IOException, Exception{
        System.out.println(archivo.getAbsolutePath());
        //El getAbsolutePath: este metodo de ruta devuelve la ruta absoluta del archivo
        if (archivo.exists()) {
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(isdn +" | "+ numeroEdicion +" | "+ nombre +" | "+ idioma +" |\n ");
            escritura.close();
            
            listarRevista();
        }else{
            throw new Exception("Error el archivo no existe");
        }
    }
    
    public void agregarArticulo(String titulo, String abstact, int paginaInicio, int paginaFin){
        
    }
    
    public void agregarAutor(int codigo, String nombre, int anioNacimiento, String nacionalidad){
        
    }
    
    public List<Revista> listarRevista() throws FileNotFoundException, IOException, Exception{
        String linea="";
        String palabra="";
        boolean datoisbn=true;
        boolean datonumeroEdicion=false;
        boolean datonombre=false;
        boolean datoidioma=false;
        
        if (archivo.exists() && archivo.isFile()) {
            
            FileReader file=new FileReader(archivo);
            BufferedReader lectura=new BufferedReader(file);
            
            while(linea!=null){
                linea=lectura.readLine();
                if (linea!=null) {
                    Revista revista=new Revista();
                    for(int i=0; i<linea.length();i++){
                        char caracter=linea.charAt(i);
                        if(caracter !='|'){
                            palabra+=caracter;
                        }else{
                            if(datoisbn==true && !palabra.equals("")){
                                revista.setIsdn(palabra);
                                palabra="";
                                System.out.println("Nomnre: "+palabra);
                                datoisbn=false;
                                datonumeroEdicion=true;
                            }
                            if(datonumeroEdicion==true &&!palabra.equals("")){
                                revista.setNumeroEdicion(palabra);
                                palabra="";
                                System.out.println("Numero de Edicion: "+palabra);
                                datonumeroEdicion=false;
                                datonombre=true;
                            }
                            if(datonombre==true &&!palabra.equals("")){
                                revista.setNombre(palabra);
                                palabra="";
                                System.out.println("Nombre Revista: "+palabra );
                                datonombre=false;
                                datoidioma=true;
                            }
                            if(datoidioma==true && !palabra.equals("")){
                                revista.setIdioma(palabra);
                                palabra="";
                                System.out.println("Idioma: "+palabra);
                                datoidioma=false;
                                datoisbn=true;
                            }
                        }
                    }
                    revistas.add(revista);
                }
            }
            file.close();
            return revistas;
        }else{
            throw new Exception("El archivo no existe");
        }
    }
    
    public void listarArticulo(){
        
    }
    
    public void listarAutor(){
        
    }
}
