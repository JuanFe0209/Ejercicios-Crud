import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opc = "1";
        OperacionCrud repo = new CrudRepositorio();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar  \n 3. Editar" +
                    "\n 4. Eliminar  \n 5. Contar  \n 6. Salir  \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Ingrese ID");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese Nombre");
                    String nom = s.next();
                    System.out.println("Ingrese Dirección");
                    String direccion = s.next();
                    repo.crear(new LocalesComerciales(id, nom, direccion));
                    break;
                }
                case "2": {
                    List<LocalesComerciales> localesComerciales = repo.listar();
                    localesComerciales.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("=== Editar ===");
                    System.out.println("Ingrese id del local");
                    Integer id = s.nextInt();
                    System.out.println("Ingrese el nombre del local");
                    String nom = s.next();
                    System.out.println("Ingrese direccion del local");
                    String direccion = s.next();
                    LocalesComerciales beActualizar = new LocalesComerciales(id,nom,direccion);
                    beActualizar.setIdLocal(id);
                    repo.editar(beActualizar);
                    break;
                }
                case "4": {
                    System.out.println("=== Eliminar ===");
                    System.out.println("Ingrese id del local que desea eliminar");
                    Integer id = s.nextInt();
                    repo.eliminar(id);
                    repo.listar().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("=== Total ===");
                    System.out.println("Total regitros: " + repo.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        } while (opc != "6");
    }
}