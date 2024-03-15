public class EmpleadoTemporal extends Empleado{



    //constructor heredado de empleado

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario, String tipoContrato) {
        super(nombre, edad, idEmpleado, salario, tipoContrato);
    }

    //como esta clase no tiene atributos propios si no heredados, no se crea el getter and setter


    //toSTRING() HEREDADO de empleado y concatenado com empleadoTemporal

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTemporal{}";
    }
};
