package Empleados;

import java.util.ArrayList;
import java.util.List;

public class CrudRepositorioEmpleados implements OperacionCrudEmpleados {
    private List<Empleados> datasource;

    public CrudRepositorioEmpleados() {
        this.datasource = new ArrayList<>();
    }

    @Override
    public List<Empleados> listar() {
        return null;
    }

    @Override
    public Empleados porId(Integer idEmpleado) {
        Empleados resultado = null;
        for(Empleados mas : datasource){
            if (mas.getIdEmpleado() != null && mas.getIdEmpleado().equals(idEmpleado)){
                resultado = mas;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Empleados empleados){
        this.datasource.add(empleados);

    }
    @Override
    public void editar(Empleados empleados) {
        Empleados m = this.porId(empleados.getIdEmpleado());
        m.setNombreEmpleado(empleados.getNombreEmpleado());
        m.setCargoEmpleado(empleados.getCargoEmpleado());
        m.setSalarioEmpleado(empleados.getSalarioEmpleado());

    }

    @Override
    public void eliminar(Integer idEmpleado) {
        this.datasource.remove(this.porId(idEmpleado));

    }

    @Override
    public int total() {
        return this.datasource.size();
    }
}
