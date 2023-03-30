package Empleados;

public class Empleados {
    private Integer idEmpleado;
    private String nombreEmpleado;
    private String cargoEmpleado;
    private double salarioEmpleado;

    public Empleados(Integer idEmpleado, String nombreEmpleado, String cargoEmpleado, double salarioEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.salarioEmpleado = salarioEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public double getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", cargoEmpleado='" + cargoEmpleado + '\'' +
                ", salarioEmpleado=" + salarioEmpleado +
                '}';
    }
}
