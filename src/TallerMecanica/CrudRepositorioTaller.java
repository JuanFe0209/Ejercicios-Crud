package TallerMecanica;

import Empleados.CrudRepositorioEmpleados;

import java.util.ArrayList;
import java.util.List;

public class CrudRepositorioTaller implements OperacionCrudTaller {
    private List<IngresoVehiculo> ingresoVehiculos;

    public CrudRepositorioTaller(){
        ingresoVehiculos = new ArrayList<>();
    }

    @Override
    public IngresoVehiculo findById(int idVehiculo) {
        return ingresoVehiculos.stream()
                .filter(ingresoVehiculo -> ingresoVehiculo.getIdVehiculo() == idVehiculo)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<IngresoVehiculo> findAll() {
        return ingresoVehiculos;
    }

    @Override
    public void save(IngresoVehiculo ingresoVehiculo) {
        ingresoVehiculos.add(ingresoVehiculo);

    }

    @Override
    public void update(IngresoVehiculo ingresoVehiculo) {
        IngresoVehiculo oldIngreso = findById(ingresoVehiculo.getIdVehiculo());
        if(oldIngreso != null){
            ingresoVehiculos.remove(oldIngreso);
            ingresoVehiculos.add(ingresoVehiculo);
        }

    }

    @Override
    public void delete(IngresoVehiculo ingresoVehiculo) {
        ingresoVehiculos.remove(ingresoVehiculo);

    }
}
