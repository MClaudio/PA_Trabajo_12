
package Modelo.Programa_A;

public class Autor {

    private int codigo;
    private String nombre;
    private int anioNacimiento;
    private String nacionalidad;    

    public Autor(int codigo, String nombre, int anioNacimiento, String nacionalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "codigo=" + codigo + ", nombre=" + nombre + ", anioNacimiento=" 
                + anioNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}
