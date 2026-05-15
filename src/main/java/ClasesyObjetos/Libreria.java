package ClasesyObjetos;

public class Libreria {
   String Autor;
   String Tematica;
   double Precio;


   public void setAutor(String Autor) {
      this.Autor = Autor;
   }

   public void setTematica(String Tematica) {
      this.Tematica = Tematica;
   }

   public void setPrecio(double Precio) {
     this.Precio = Precio;
   }


   public String getDatos() {
      return "El Autor del libro se llama: " + Autor + " " +  "la tematica es: " + Tematica + " " + " y su precio es: "  +  Precio;
   }


}
