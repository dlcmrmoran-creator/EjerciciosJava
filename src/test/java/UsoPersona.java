import ClasesyObjetos.Automovil;
import ClasesyObjetos.Avion;
import ClasesyObjetos.Mascota;
import ClasesyObjetos.Motocicleta;
import ClasesyObjetos.Pacientes;
import ClasesyObjetos.Pelota;
import ClasesyObjetos.Persona;

public class UsoPersona {



    public static void main(String[] args) {


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


        Pelota pelota = new Pelota();

        pelota.setColor("roja");
       pelota.setTamaño("grande");
        pelota.setDiametro(1200.34);


       // System.out.println(pelota.getDatos());

        System.out.println(pelota.retornaSaludo());


    }



}
