package Controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Programa_F.Consulta;
import Modelo.Programa_F.Doctor;
import Modelo.Programa_F.Paciente;

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
        
        String linea = "";
        String palabra = "";
        boolean datoNombre = true;
        boolean datoApellido = false;
        boolean datoCedula = false;
        boolean datoEspecialidad = false;

        if (archivo.exists() && archivo.isFile()) {

            FileReader file = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(file);

            while (linea != null) {

                linea = lectura.readLine();
                if (linea != null) {
                    Doctor doctor = new Doctor();
                    for (int i = 0; i < linea.length(); i++) {
                        char caracter = linea.charAt(i);
                        if (caracter != '|') {
                            palabra += caracter;
                        }
                        else {
                            if (datoNombre == true && !palabra.equals("")) {
                                doctor.setNombre(palabra);
                                palabra = "";
                                System.out.println("Nombre: " + palabra);
                                datoNombre = false;
                                datoApellido = true;
                            }
                            if (datoApellido == true && !palabra.equals("")) {
                                doctor.setApellido(palabra);
                                palabra = "";
                                System.out.println("Apelldo: " + palabra);
                                datoApellido = false;
                                datoCedula = true;
                            }
                            if (datoCedula == true && !palabra.equals("")) {
                                doctor.setCedula(palabra);
                                palabra = "";
                                datoCedula = false;
                                datoEspecialidad = true;
                            }
                            if (datoEspecialidad == true && !palabra.equals("")) {
                                doctor.setEspecialidad(palabra);
                                palabra = "";
                                datoEspecialidad = false;
                                datoNombre = true;
                            }

                            //System.out.print("[" + palabra + "]");
                        }
                    }
                    doctores.add(doctor);
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
