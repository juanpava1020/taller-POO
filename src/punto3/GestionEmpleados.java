import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    ArrayList<Empleado> objEmpleado = new ArrayList<>();
    private static int id = 0;

    public GestionEmpleados() {

    }

    //implementar metodo para añadir empleados
    public void añadirEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("salario"));
        String tipoContrato = JOptionPane.showInputDialog("tipo de contrato: temporal o permanente");
        Empleado objNewEmpleado = new Empleado(nombre, edad, id, salario, tipoContrato);
        ++id;
        objEmpleado.add(objNewEmpleado);
        System.out.println("el empleado se agrego correctamente");
    }

    ;

    //metodo para eliminar empleados
    public void eliminarEmpleados(Scanner objscan) {
        this.listarEmpleados();
        System.out.println("ingresa el id del empleado que deseas eliminar: ");
        int idEliminar = objscan.nextInt();
        if(this.objEmpleado.removeIf(iterador -> iterador.getIdEmpleado() == idEliminar)){
            System.out.println("se elimino el empleado");
        }else{
            System.out.println("no se pudo eliminar el empleado");
        };

    }

    public void listarEmpleados() {
        for (Empleado iterador : this.objEmpleado) {
            System.out.println(iterador.toString());

        }


    }


};
