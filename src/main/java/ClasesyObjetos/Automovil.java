package ClasesyObjetos;

public class Automovil {
    String marca;
String color;
int cilindraje;


    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Automovil(String marca, String color, int cilindraje){
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    //Contructor, retirna la misma clase y recibe parametros para inicializar los atributos
    public Automovil(int cilindraje){
        this.cilindraje = cilindraje;
    }

    public String imprimeDatosVehiculo(){
        return "La marca de este automovil es: " + marca + " con color " +  color +  " y cilindraje: " + cilindraje;
    }



    public int getCilindraje(){
        return cilindraje;
    }


    public String imprimeMarca(){
        return marca;
    }


public String imprimeColor(){
        return color;
}

}

