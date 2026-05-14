package ClasesyObjetos;

public class Pacientes {
    String nombre ;
    String apellido;
    int edad ;
    String area ;
String medicina ;
String alimentos ;

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Pacientes(String nombre, String apellido, int edad,  String area, String medicina, String alimentos){
        this.nombre = nombre;
        this.apellido = apellido;
                this.edad = edad;
                this.area = area;
                this.medicina = medicina;
                this.alimentos = alimentos;
    }

    public String Nombre(){
        return nombre;
    }

    public String Apellido(){
        return apellido;
    }

   public int Edad(){
        return edad;
   }

   public String imprimeArea(){
        return area;

   }

    public String medicacion(){
        return medicina;
    }

    public String alimentar(){
        return alimentos;
    }

    public String imprimeDatos(){
        return "La paciente se llama: " + nombre + " " + apellido + " y tiene " + edad + " " + "años" +  " se encuentra en el área de: " + area + "," + "su dieta es: " + alimentos + " y su medicacion es: " + medicina;
    }

}

