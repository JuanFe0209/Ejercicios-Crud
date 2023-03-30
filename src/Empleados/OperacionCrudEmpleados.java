package Empleados;
import java.util.List;

public interface OperacionCrudEmpleados {
    List<Empleados> listar();
    Empleados porId(Integer idEmpleado);
    void crear(Empleados empleados);
    void editar(Empleados empleados);
    void eliminar(Integer idEmpleado);
    public int total();
}
