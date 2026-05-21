package ClasesyObjetos;

public class Escuela {
    String nombre;
    String apellidos;
    int edad;
    String grado;
    char grupo;



    public Escuela(String nombre, String apellidos, int edad, String grado, char grupo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.grado = grado;
        this.grupo = grupo;
    }



    public String getDatosDeAlumnos(){
        return "El alumno se llama " + nombre + " " +  apellidos+ " tiene " + edad + " años " + "va en el grado" + " "+ grado + " "+ "grupo: " + grupo;
    }








}
