import java.util.Scanner;
import java.util.ArrayList;

class Veterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> animales = new ArrayList<>(); 

        while (true) {
            ArrayList<String> animal = new ArrayList<>(); 

            System.out.println("Ingrese el nombre del animal: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el id del animal: ");
            String id = sc.nextLine();
            System.out.println("Ingrese la enfermedad del animal: ");
            String enfermedad = sc.nextLine();

            animal.add(nombre);
            animal.add(id);
            animal.add(enfermedad);
            animales.add(animal); 

            System.out.println("¿Desea agregar otro animal? (si o no): ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                break; 
            }
        }
        System.out.println("\nLista de animales registrados:");
        for (ArrayList<String> animal : animales) {
            System.out.println("Nombre: " + animal.get(0) + ", ID: " + animal.get(1) + ", Enfermedad: " + animal.get(2));
        }
        sc.close();
    }
}
