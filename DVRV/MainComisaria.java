import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MainComisaria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Policia> person = new ArrayList<>();
        
        while(true){
            
            person.add(new Policia());
            int id = person.size()+1;
            person.get(person.size()-1).setId(id);

            System.out.println("Ingresa tus nombres: ");
            person.get(person.size()-1).setNombre(sc.nextLine());

            System.out.println("Ingresa tus Apellidos: ");
            person.get(person.size()-1).setApellido(sc.nextLine());

            System.out.println("Ingresa tu correo electrónico: ");
            person.get(person.size()-1).setCorreo(sc.nextLine());
            
            System.out.println("Ingresa tu número de placa: ");
            person.get(person.size()-1).setCorreo(sc.nextLine());

            System.out.println("Ingresa tu número de celular: ");
            person.get(person.size()-1).setCel(sc.nextLong());
            sc.nextLine();

            System.out.println("Agregar otra person	? s/n");
            String opcion = sc.nextLine();

            if(opcion.equals("n")){
                break;
            }
            else if(id==6){
                System.out.println(person);
                break;
        }
    }
    }
    }
