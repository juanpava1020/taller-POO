package punto3;

public class Empleado extends Persona{
private int idEmpleado;
private double salario;
private String tipoContrato;


// el generate me trae el constructor de la clase persona y empleado con el super
    public Empleado(String nombre, int edad, int idEmpleado, double salario, String tipoContrato) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.tipoContrato = tipoContrato;


    }



    //getter and setter


    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    //toString
    //el generate no me saca el super de la herencia
    //aca añado el super.toString() + y me concatena el toString de "Persona" que es a la de le heredamos los atributos

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                "tipoContrato=" + tipoContrato +

                '}';
    }
};
