package ClasesyObjetos;

public class Avion {

    String Clasificacion;
    String combustible;
    int modelo;
    String color;
    double peso;
    char linea;

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Avion(String Clasificacion, String combustible, int modelo, String color, double peso, char linea){
        this.Clasificacion = Clasificacion;
        this.combustible = combustible;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.linea = linea;
    }


    public String Informacion(){
        return "La ficha de este avion contiene estos datos : " + Clasificacion + " su combustible es: " +  combustible+  " es modelo: " + modelo + " es de color " + color + " pesa " + peso + "toneladas" +  " y es de la linea " + linea;
    }

}


