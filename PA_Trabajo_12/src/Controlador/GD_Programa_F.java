package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Programa_F.Consulta;
import modelo.Programa_F.Doctor;
import modelo.Programa_F.Paciente;

public class GD_Programa_F {

    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;
    private File archivo;

    public GD_Programa_F(String pathname) {
        doctores = new ArrayList<Doctor>();
        pacientes = new ArrayList<Paciente>();
        consultas = new ArrayList<Consulta>(); 

        archivo = new File(pathname);
    }
 
    public void creaMedico(String especialidad, String cedula, String nombre, String apellido) throws Exception {
        System.out.println(archivo.getAbsolutePath());

        if (archivo.exists()) {
            FileWriter file = new FileWriter(archivo, true);
            BufferedWriter escritura = new BufferedWriter(file);
            escritura.append(nombre + "|" + apellido + "|" + cedula + "|" + especialidad + "|\n");
            escritura.close();

            leeDatosMedico();
        }

        else {
            throw new Exception("Error el archivo no existe.");
        }

    }


    public List<Doctor> leeDatosMedico() throws Exception {
        Doctor doctor = new Doctor();
        String linea = "";
        String palabra = "";
        
        if (archivo.exists() && archivo.isFile()) {
            boolean datoNombre = true;
            boolean datoApellido = false;
            boolean datoCedula = false;
            boolean datoEspecialidad = false;
            
            FileReader file = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(file);

            while (linea != null) {
                linea = lectura.readLine();
                if (linea != null) {

                    for (int i = 0; i < linea.length(); i++) {
                        char caracter = linea.charAt(i);
                        if (caracter != '|') {
                            palabra += caracter;
                        }
                        else {
                            if (datoNombre) {
                                doctor.setNombre(palabra);
                                datoNombre = false;
                                datoApellido = true;
                            }
                            if (datoApellido) {
                                doctor.setApellido(palabra);
                                datoApellido = false;
                                datoCedula = true;
                            }
                            if (datoCedula) {
                                doctor.setCedula(palabra);
                                datoCedula = false;
                                datoEspecialidad = true;
                            }
                            if (datoEspecialidad) {
                                doctor.setEspecialidad(palabra);
                                datoEspecialidad = false;
                                datoNombre = true;
                            }
                            
                            doctores.add(doctor);
                            //System.out.print("[" + palabra + "]");
                            palabra = "";
                        }
                    }
                }
            }
            file.close();
            return doctores; 
        }
        else {
            throw new Exception("El archivo no existe");
        }
    }

    public void creaPaciente(int edad, String cedula, String nombre, String apellido) {

    }

    public void creaConsulta(Doctor medico, Paciente paciente) {

    }

    public void listaConsulta() {

    }

}
