package controlador;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import modelo.Programa_F.Doctor;
import modelo.Programa_F.Paciente;


/**
 *
 * @author ClauMldo
 */
public class GD_Programa_F {

    //private List<Consulta> consultas;
    private File archivo;

    public GD_Programa_F(String pathname) {
        archivo = new File(pathname);
    }
    
    public void creaMedico(String especialidad, String cedula, String nombre, String apellido) throws Exception{
        
        System.out.println(archivo.getAbsolutePath());
        
        if (archivo.exists()) {
            FileWriter file=new FileWriter(archivo);
            BufferedWriter escritura=new BufferedWriter(file);
            escritura.append(nombre+"|"+apellido+"|"+cedula+"|"+"|"+especialidad);
            escritura.close();
        }else{
            throw new Exception("Error el archivo no existe.");
        }
    }
    
    public void creaPaciente(int edad, String cedula, String nombre, String apellido){
        
    }
    
    public void creaConsulta(Doctor medico, Paciente paciente){
        
    }
    
    public void listaConsulta(){
        
    }

}
