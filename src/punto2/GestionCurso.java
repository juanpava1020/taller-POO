import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso>
            listaCurso;

    public GestionCurso(){
         this.listaCurso= new ArrayList<>();
    }
//esto es un metodo que es lo mismo que una "funcion en js"
    public void agregarCurso(Scanner objScan){
        System.out.println("Ingresa el nombre del nuevo curso");
        String nombre = objScan.next();

        System.out.println("Ingresa el codigo del nuevo curso");
        String codigo = objScan.next();

        //validamos que el codigo del curso sea unico
        if (this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("ys existe un curso con este codigo 😒");
        }else {
            Curso objCurso = new Curso(codigo,nombre);
            if (this.listaCurso.add(objCurso)){
                System.out.println("curso agregado correctamente");
            }else {
                System.out.println("no se pudo agregar el curso");
            }


        }

    }

    public void listarTodosLosCursos(){

            if(this.listaCurso.isEmpty()){
                System.out.println("no hay cursos registrados\n");
            }else {
                for (Curso iterador : this.listaCurso ){
                    System.out.println(iterador.toString());
                }
            }





    }

    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for (Curso temporal : this.listaCurso){
            if (temporal.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temporal;
            }
        }

        return null;
    }


}
