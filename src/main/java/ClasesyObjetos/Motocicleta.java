package ClasesyObjetos;

public class Motocicleta {

    String marca;
    String color;
    int modelo;

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Motocicleta(String marca, String color, int modelo){
        this.marca = marca;
        this.color = color;
        this.modelo= modelo;
    }


    public String imprimeDatosMotocicleta(){
        return "La marca de esta motocicleta es: " + marca + " con color " +  color +  " y es modelo: " + modelo;
    }

}

