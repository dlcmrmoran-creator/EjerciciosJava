package ClasesyObjetos;

public class Mascota {

    String Especie;
    int edad;
    double peso;

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Mascota(String Especie, int edad, double peso) {
        this.Especie = Especie;
        this.edad = edad;
        this.peso = peso;
    }


    public String imprimeDatos(){
        return "La especie de este animal  es: " + Especie +" su edad es: " + edad + " años"+ " y pesa: " + peso + " kilos";
    }

}
