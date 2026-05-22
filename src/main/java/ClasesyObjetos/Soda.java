package ClasesyObjetos;

public class Soda {

    String nombre;
    String marca;
    String sabor;
    double precio;
    double mililitros;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }

    public String getDatos(){
        return "Este refresco se llama: " + nombre + " es de la marca de " + marca + " con sabor a " + sabor + " es de " + mililitros + " mililitros " + " y cuesta " + precio;
    }


}


