import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean exeScanner=false;
        boolean exeArraylist=true;
        if(exeScanner){
            useScanner();
        } else if (exeArraylist) {
            useArrayLists();
        }else {
            useArrays();
        }
    }

    private static void useScanner(){
        // Instancia Scanner para su uso
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa tu nombre:");

            // Abrimos una línea en consola para ingresar el nombre
            String name = scanner.nextLine();

            System.out.println("Ingresa tu edad");

            // Abrimos una línea en consola para ingresar la edad como entero
            int age = scanner.nextInt();

            System.out.println("Bienvenido "+name+" de edad: "+age);
        }
    }

    private static void useArrays(){
        // Array de String
        String[] nombres={"Pepe","Pedro","Maria"};

        // For each
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }

    private static void useArrayLists(){
        // Instancia la clase ArrayList para strings
        ArrayList<String> personas=new ArrayList<String>();
        for (int i = 1; i <= 11; i++) {
            String persona = "Pedro "+i;
            // Agregamos la persona
            personas.add(persona);
        }
        // Agregar un eleemento en la poscicio indicada
        personas.add(7,"Pedro Def");
        // Eliminar un elemento por su contenido
        personas.remove("Pedro 2");
        // Eliminar un elemento por su índice
        personas.remove(1);
        // Reemplazar un elemento en un índice
        personas.set(7,"Pedro Def 2");
        // Obtener un elemento por su indice
        personas.get(3);

        for (String persona:personas){
            System.out.println(persona);
        }

        // Tamaño del arrayList
        System.out.println(personas.size());



    }
}