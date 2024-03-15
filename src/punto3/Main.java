import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner objScan= new Scanner(System.in);
       GestionEmpleados objGestionEmpleado = new GestionEmpleados();
        int opcion = 0;
        do {
            System.out.println("""
                    ***** MENU *****
                    1. Agregar empleado.
                    2. Listar empleados.
                    3. Eliminar empleado.
                    4. Salir.
                    """);
             opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                     ***** MENU *****
                     1. Agregar empleado.
                     2. Listar empleados.
                     3. Eliminar empleado.
                     4. Salir.
                     ingresa una opcion"""));
            switch (opcion) {
                case 1:
                    objGestionEmpleado.añadirEmpleado();
                    break;
                case 2:
                    objGestionEmpleado.listarEmpleados();
                    break;
                case 3:
                    objGestionEmpleado.eliminarEmpleados(objScan);
            }


        } while (opcion != 4);
    }
}