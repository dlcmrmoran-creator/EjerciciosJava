package ClasesyObjetos;

public class Pelota {
    String color ;
    String tamaño;
    double diametro;


    public void setColor(String color) {
        this.color = color;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String retornaSaludo(){

        return "Hola " + color;
    }

   //public  String getDatos(){
      //  return "El color de la pelota es " + color + " es de tamaño:" + tamaño + " y su diametro es de:" + diametro;
   //};








}








