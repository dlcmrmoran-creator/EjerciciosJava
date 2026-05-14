package ClasesyObjetos;

public class Persona {
    //ATRIBUTOS
    String nombre;
    String ofensa = "vt alv";
    String bendicion = "Dios te Bendiga";
    double estatura;
    int edad;
    int talla;

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String imprimeNombre(){
        return nombre;
    }

    public String ofender(){
        return ofensa;
    }


    public String bendecir(){
        return bendicion;
    }



}
