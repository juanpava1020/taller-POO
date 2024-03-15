import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //instancia de scaner
        Scanner objScan = new Scanner(System.in);
        GestionCurso objGestion = new GestionCurso();

        int option = 0;
        do{
            System.out.println("""
                    MENU DE OPCIONES
                    1. administrar estudiantes
                    2. administrar cursos
                    3. salir
                    
                    INGRESE UNA OPCION
                    """);
            option = objScan.nextInt();

            switch (option){

                case 1:
                    int option3 = 0;
                    do {
                        System.out.println("""
                                MENU DE ESTUDIANTES
                                1. AGREGAR ESTUDIANTES A UN CURSO
                                2. LISTAR TODOS LOS ESTUDIANTES DE UN CURSO
                                3. ELIMINAR ESTUDIANTES DE UN CURSO
                                4. SALIR
                                
                                INGRESA UNA OPCION:
                                """);

                        option3 = objScan.nextInt();
                        switch (option3){
                            case 1:
                            objGestion.listarTodosLosCursos();
                                System.out.println("ingresa el codigo del curso donde ingresaras el nuevo estudiante😊");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("el curso ingresado no es valido");
                                }else {
                                    objCurso.agregarEstudiantes(objScan);
                                }
                                break;

                            case 2:
                                objGestion.listarTodosLosCursos();
                                System.out.println("ingresa el codigo del curso donde ingresaras el nuevo estudiante😊");
                                 codigo = objScan.next();

                                 objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("el curso ingresado no es valido");
                                }else {
                                    objCurso.listarEstudiantes();
                                }
                                break;

                            case 3://eliminar estudiante a un curso en especifico

                            //1:listar el cursos
                                objGestion.listarTodosLosCursos();

                            //2: preguntar el codigo del curso
                                System.out.println("ingresa el codigo del curso donde deseas eliminar el estudiante");
                                codigo = objScan.next();

                            //3: buscar el curso que tenga el codigo
                                Curso objcurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objcurso == null){
                                    System.out.println("el codigo ingresado no coincide con ningun curso");
                                }else  {
                                    //4: eliminar el estudiante de ese curso en especifico
                                    objcurso.eliminarEstudiante(objScan);

                                }

                                break;


                        }
                    }
                    while (option != 4);


//ACA VAMOS**************

                case 2:
                    int option2 = 0;
                    do{
                        System.out.println("""
                                MENU DE CURSOS
                                1. agregar curso
                                2. listar cursos
                                3. buscar por codigo
                                4. salir
                                
                                ingresa una option
                                """);
                        option2 = objScan.nextInt();
                        switch (option2){
                            case 1:
                                objGestion.agregarCurso(objScan);
                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("ingrese el codigo del curso a buscar");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("no existe ningun curso en este codigo");

                                }else {
                                    System.out.println(objCurso.toString());
                                }
                        }
                    }while (option != 3);
            }

        }while (option != 3);
    }
}