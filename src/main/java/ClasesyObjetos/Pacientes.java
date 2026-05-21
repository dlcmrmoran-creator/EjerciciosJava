package ClasesyObjetos;

public class Pacientes {
    String nombre ;
    String apellido;
    int edad ;
    String area ;
    String medicina ;
    String alimentos ;

    //Contructor, retorna la misma clase y recibe parametros para inicializar los atributos
    public Pacientes(int añoNac, int añoAct, String medicina){
       this.edad = añoAct - añoNac;
       this.medicina = medicina;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public String getArea(){
        return area;

    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedicina(){
        return medicina;
    }


}

