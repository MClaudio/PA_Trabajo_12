
package Controlador;

import Modelo.Programa_A.Articulo;
import Modelo.Programa_A.Autor;
import Modelo.Programa_A.Revista;
import Modelo.Programa_F.Doctor;
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
    
    public void agregarArticulo(String titulo, String abstact, String paginaInicio, String paginaFin) throws IOException, Exception{
        System.out.println(archivo.getAbsolutePath());
        if(archivo.exists()){
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(titulo +" | "+ abstact +" | "+ paginaInicio +" | "+ paginaFin +" |\n ");
            escritura.close();
            
            listarArticulo();
        }
    }
    
    public void agregarAutor(String codigo, String nombre, String anioNacimiento, String nacionalidad) throws IOException, Exception{
        System.out.println(archivo.getAbsolutePath());
        if(archivo.exists()){
            FileWriter file=new FileWriter(archivo, true);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(codigo +" | "+ nombre +" | "+ anioNacimiento +" | "+ nacionalidad +" |\n ");
            escritura.close();
            
            listarAutor();
        }
    }
    
    public List<Revista> listarRevista() throws FileNotFoundException, IOException, Exception{
        String linea="";
        String palabra="";
        boolean datoisbn=true;
        boolean datonumeroEdicion=false;
        boolean datonombre=false;
        boolean datoidioma=false;
        boolean datoarticulo=false;
        
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
    
    public List<Articulo> listarArticulo() throws Exception{
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
                    Articulo articulo=new Articulo();
                    for(int i=0; i<linea.length();i++){
                        char caracter=linea.charAt(i);
                        if(caracter !='|'){
                            palabra+=caracter;
                        }else{
                            if(datoisbn==true && !palabra.equals("")){
                                articulo.setTitulo(linea);
                                palabra="";
                                System.out.println("Nomnre: "+palabra);
                                datoisbn=false;
                                datonumeroEdicion=true;
                            }
                            if(datonumeroEdicion==true &&!palabra.equals("")){
                                articulo.setAbstrac(palabra);
                                palabra="";
                                System.out.println("Numero de Edicion: "+palabra);
                                datonumeroEdicion=false;
                                datonombre=true;
                            }
                            if(datonombre==true &&!palabra.equals("")){
                                articulo.setPaginaInicio(palabra);
                                palabra="";
                                System.out.println("Nombre Revista: "+palabra );
                                datonombre=false;
                                datoidioma=true;
                            }
                            if(datoidioma==true && !palabra.equals("")){
                                articulo.setPaginaFin(palabra);
                                palabra="";
                                System.out.println("Idioma: "+palabra);
                                datoidioma=false;
                                datoisbn=true;
                            }
                        }
                    }
                    articulos.add(articulo);
                }
            }
            file.close();
            return articulos;
        }else{
            throw new Exception("El archivo no existe");
        }
    }
    
    public void listarAutor() throws Exception{
        String linea = "";
        String palabra = "";
        boolean datocodigo = true;
        boolean datonombre = false;
        boolean datoanioNacimiento = false;
        boolean datonacionalidad = false;
        
        if(archivo.exists() && archivo.isFile()){
         FileReader file = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(file);

            while (linea != null) {

                linea = lectura.readLine();
                if (linea != null) {
                    Autor autor=new Autor();
                    for (int i = 0; i < linea.length(); i++) {
                        char caracter = linea.charAt(i);
                        if (caracter != '|') {
                            palabra += caracter;
                        }
                        else {
                            if (datocodigo == true && !palabra.equals("")) {
                                autor.setCodigo(palabra);
                                palabra = "";
                                System.out.println("Nombre: " + palabra);
                                datocodigo = false;
                                datonombre = true;
                            }
                            if (datonombre == true && !palabra.equals("")) {
                                autor.setNombre(linea);
                                palabra = "";
                                System.out.println("Apelldo: " + palabra);
                                datonombre = false;
                                datoanioNacimiento = true;
                            }
                            if (datoanioNacimiento == true && !palabra.equals("")) {
                                autor.setAnioNacimiento(palabra);
                                palabra = "";
                                datoanioNacimiento = false;
                                datonacionalidad = true;
                            }
                            if (datonacionalidad == true && !palabra.equals("")) {
                                autor.setNacionalidad(palabra);
                                palabra = "";
                                datonacionalidad = false;
                                datocodigo = true;
                            }

                        }
                    }
                    autores.add(autor);
                }
            }
            file.close();
        }
        else {
            throw new Exception("El archivo no existe");
        }
    }
}
