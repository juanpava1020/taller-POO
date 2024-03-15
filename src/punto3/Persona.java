package punto3;

public class Persona {
    private String nombre;
    private int edad;


    //constructor:
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    //getter and setter:




    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //toString:


    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
};
