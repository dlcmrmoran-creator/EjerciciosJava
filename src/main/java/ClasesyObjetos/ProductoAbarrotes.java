package ClasesyObjetos;

public class ProductoAbarrotes {


    String producto;
    String marca;
    double precio;
    int cantidad;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto (String producto){
        this.producto = producto;
    }

    public void setMarca (String marca){
        this.marca = marca;

    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDatos(){  //esto se llama metodo
        return "El producto es " + producto +  " de la marca " + marca + " cuesta " + precio + " y en existencia tenemos " + cantidad + " piezas";
    }

}
