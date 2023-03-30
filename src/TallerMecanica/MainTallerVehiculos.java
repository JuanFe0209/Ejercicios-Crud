package TallerMecanica;

import java.util.List;
import java.util.Scanner;

public class MainTallerVehiculos {
    public static void main(String[] args) {
        String opc ="1";
        OperacionCrudTaller repo = new CrudRepositorioTaller();
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar  \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir  \n =>");
            opc = s.next();
            switch (opc){
                case "1": {
                    System.out.println("Ingrese el id del vehiculo");
                    Integer idVehiculo = s.nextInt();
                    System.out.println("Ingrese el nombre del dueño del vehiculo");
                    String nomDueño = s.next();
                    System.out.println("Ingrese el tipo de vehiculo");
                    String tipo = s.next();
                    System.out.println("Ingrese la marca del vehiculo");
                    String marca = s.next();
                    System.out.println("Ingrese el daño o problema del vehiculo");
                    String problem = s.next();
                    repo.save(new IngresoVehiculo(idVehiculo, nomDueño, tipo, marca, problem));
                    break;
                }
                case "2": {
                    List<IngresoVehiculo> ingresoVehiculos = repo.findAll();
                    ingresoVehiculos.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("=== Editar ===");
                    System.out.println("Ingrese el id del vehiculo");
                    Integer idVehiculo = s.nextInt();
                    System.out.println("Ingrese el nombre del dueño del vehiculo");
                    String nomDueño = s.next();
                    System.out.println("Ingrese el tipo de vehiculo");
                    String tipo = s.next();
                    System.out.println("Ingrese la marca del vehiculo");
                    String marca = s.next();
                    System.out.println("Ingrese el daño o problema del vehiculo");
                    String problem = s.next();
                    IngresoVehiculo beActualizar = new IngresoVehiculo(idVehiculo, nomDueño, tipo, marca, problem);
                    repo.update(beActualizar);
                    break;
                }
                case "4": {
                    System.out.println("=== Eliminar ===");
                    System.out.println("Ingrese el id del vehiculo que desea eliminar");
                    Integer idVehiculo = s.nextInt();
                    repo.delete(repo.findById(idVehiculo));
                    repo.findAll(). forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        }while (opc != "5");
    }
}
