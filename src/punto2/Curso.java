import com.sun.source.tree.ArrayTypeTree;

import java.util.ArrayList;
import java.util.Scanner;

//MI CLASE CURSO
public class Curso {

    //********ATRIBUTOS DE LA CLASE CURSO*********

    private String codigo;
    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes;

    //un metodo estatico es el que se puede usar sin tener que intanciar la clase
    //basicamente termina siendo una variable global.
    public static int index = 1;

    //********CONSTRUCTOR********

    public Curso (String codigo, String nombre){
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEstudiantes = new ArrayList<>();

    }

    public void agregarEstudiantes(Scanner objScan){
        System.out.println("ingresa el nombre del estudiante");
        String nombre = objScan.nextLine();
        System.out.println("ingresa el email del estudiante");
        String email = objScan.nextLine();

        Estudiante objEstudiante = new Estudiante(index,nombre,email);
        index++;

        this.listaEstudiantes.add(objEstudiante);
        System.out.println("estudiante agregado correctamente! 😁");
    }

    public void listarEstudiantes(){
        if (this.listaEstudiantes.isEmpty()){
            System.out.println("no hay estudiantes en el curso".concat(this.nombre));
        }else{

            System.out.println("lista de estudiantes del curso". concat(this.nombre));
            for (Estudiante temporal : this.listaEstudiantes){
                System.out.println(temporal.toString());
            }
        }

    }
    public void eliminarEstudiante(Scanner objScan){
        this.listarEstudiantes();

        System.out.println("ingresar el id del estudiante a eliminar");
        int idEliminar = objScan.nextInt();
        //elimina el estudiante si el id coincide con el id que se desea eliminar
        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar);

        System.out.println(!eliminado
        ?"no se pudo eliminar el estudiante"
        : "estudiante eliminado correctamente");
    }

    //*******GET AND SET********.

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    // ********TOSTRING()********

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }





}
