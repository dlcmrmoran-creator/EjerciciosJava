import ClasesyObjetos.Automovil;
import ClasesyObjetos.Avion;
import ClasesyObjetos.Escuela;
import ClasesyObjetos.Libreria;
import ClasesyObjetos.Mascota;
import ClasesyObjetos.Motocicleta;
import ClasesyObjetos.Pacientes;
import ClasesyObjetos.Pelota;
import ClasesyObjetos.Persona;
import ClasesyObjetos.ProductoAbarrotes;
import ClasesyObjetos.ProductoPapeleria;

public class UsoPersona {



    public static  void main(String[] args) {


        //Persona programador = new Persona("Emanuel");

        //Automovil CarroDeProgramador = new Automovil("Ferrari", "Negro", 12);

        //Automovil carroCilindraje = new Automovil(4);

        //System.out.println(CarroDeProgramador.imprimeMarca());

        //System.out.println(carroCilindraje.getCilindraje() + " " +  "cilindros");

        //System.out.println(programador.imprimeNombre() + " dice " + programador.ofender());

        //System.out.println(CarroDeProgramador.imprimeDatosVehiculo());

       // Mascota Eivar  =   new Mascota("Perro",4,40);

        //System.out.println(Eivar.imprimeDatos());

/*
        Motocicleta moto = new Motocicleta("Harley Davidson","gris rata",2026);

        System.out.println(moto.imprimeDatosMotocicleta());


        Avion FichaDeVenta = new Avion("Avion de Pasajeros","Queroseno", 2026, "Blanco",500, 'A');

        System.out.println(FichaDeVenta.Informacion()); */

        /*Pacientes paciente = new Pacientes(1995,2026,"paracetamol");
        System.out.println(p;

        System.out.println(paciente.getArea());

        paciente.setArea("Recuperacion");

        System.out.println(paciente.getArea());

        paciente.setNombre("Dulce Maria");
        System.out.println(paciente.getNombre());*/


        //Pelota pelota = new Pelota();

        /*pelota.setColor("roja");
       pelota.setTamaño("grande");
        pelota.setDiametro(1200.34);


       // System.out.println(pelota.getDatos());

        System.out.println(pelota.retornaSaludo());*/


        /*Libreria libreria = new Libreria();
        libreria.setAutor("Maria Pepa");
        libreria.setPrecio(145.50);
        libreria.setTematica("Romance");

        System.out.println(libreria.getDatos());

      Escuela alumno = new Escuela("Emanuel", "Medrano Zoquitecalt",35, "Sexto", 'A');
        System.out.println(alumno.getDatosDeAlumnos());*/

        //ProductoPapeleria libreta = new ProductoPapeleria("Libreta", "Norma","cosida",35.50,100);
// aca cree un objeto de la clase  producto papeleria

        //System.out.println(libreta.getDatos()); //use el metodo get datos del objeto libreta

       // ProductoPapeleria lapiz = new ProductoPapeleria("Lapiz", "Mirado","grafito",12.00,1000 );

       // System.out.println(lapiz.getDatos());



        ProductoAbarrotes pasta = new ProductoAbarrotes();
        pasta.setProducto("Sopa Codo");
pasta.setCantidad(50);
pasta.setMarca("La moderna");
pasta.setPrecio(15.50);


        System.out.println(pasta.getDatos());

        ProductoAbarrotes arroz = new ProductoAbarrotes();
        arroz.setMarca("Schettino");
        arroz.setCantidad(2000);
        arroz.setPrecio(24.30);
        arroz.setProducto("Arroz");

        System.out.println(arroz.getDatos());


    }



}
