package ClasesyObjetos;

public class Caballo {

     String nombre;
     String color;
     char genero;
     double peso;
     int edad;

//ESTE EJEMPLO ES CON METODO CONSTRUCTOR
     public Caballo (String nombre, String color,char genero, double peso, int edad) {
          this.nombre = nombre;
          this.color = color;
          this.genero = genero;
          this.peso = peso;
          this.edad = edad;


     }


          public String getInformacion() {
               return "Este caballo se llama: " + nombre  + " es de color " + color + " con genero " + genero + " pesa " + peso + " kilos " + " y tiene " + edad + " años ";


          }

     }
