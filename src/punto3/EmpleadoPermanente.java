public class EmpleadoPermanente extends Empleado{


    //contructor con atrubutos heredados de empleado

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario, String tipoContrato) {
        super(nombre, edad, idEmpleado, salario, tipoContrato);
    }


    //toString


    @Override
    public String toString() {
        return super.toString() + "EmpleadoPermanente{}";
    }
};
