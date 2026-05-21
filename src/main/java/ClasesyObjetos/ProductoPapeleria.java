package ClasesyObjetos;

public class ProductoPapeleria {
   //Atributos

    String nombre;
    String marca;
    String categoria;
    double precio;
    int stock;



    //Contructor, retorna la misma clase y recibe parametros para inicializar los atributos
    public ProductoPapeleria(String nombre,String marca, String categoria, double precio, int stock){
        this.nombre= nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getDatos(){  //esto se llama metodo
        return "El producto es " + nombre +  " de la marca " + marca + " y de categoria " + categoria + " su precio es de " + precio + " y en existencia tenemos " + stock + " piezas";
    }










}
