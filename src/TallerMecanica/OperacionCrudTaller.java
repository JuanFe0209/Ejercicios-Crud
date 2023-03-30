package TallerMecanica;

import java.util.List;

public interface OperacionCrudTaller {
    IngresoVehiculo findById(int idVehiculo);
    List<IngresoVehiculo> findAll();
    void save(IngresoVehiculo ingresoVehiculo);
    void update(IngresoVehiculo ingresoVehiculo);
    void delete(IngresoVehiculo ingresoVehiculo);
}
