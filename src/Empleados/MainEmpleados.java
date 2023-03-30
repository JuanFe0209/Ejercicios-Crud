package Empleados;

import java.util.List;
import java.util.Scanner;

public class MainEmpleados {
    public static void main(String[] args) {
        String opc = "1";
        OperacionCrudEmpleados repo = new CrudRepositorioEmpleados();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar  \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Contar  \n 6. Salir  \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Ingrese el id del empleado");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nom = s.next();
                    System.out.println("Ingrese el cargo del empleado");
                    String cargo = s.next();
                    System.out.println("Ingrese el salario del empleado");
                    double salario = s.nextDouble();
                    repo.crear(new Empleados(id,nom, cargo, salario));
                    break;
                }
                case "2": {
                    List<Empleados> empleados = repo.listar();
                    empleados.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("=== Editar ===");
                    System.out.println("Ingrese id del empleado");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese el nombre del empleado");
                    String nom = s.next();
                    System.out.println("Ingrese cargo del empleado");
                    String cargo = s.next();
                    System.out.println("Ingrese salario del empleado");
                    double salario = s.nextDouble();
                    Empleados beActualizar = new Empleados(id, nom, cargo, salario);
                    beActualizar.setIdEmpleado(id);
                    repo.editar(beActualizar);
                    break;
                }
                case "4": {
                    System.out.println("=== Eliminar ===");
                    System.out.println("Ingrese id del empleado que desea eliminar");
                    Integer id = s.nextInt();
                    repo.eliminar(id);
                    repo.listar().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("=== Total ===");
                    System.out.println("Total de registros: " + repo.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        }while (opc != "6");
    }
}