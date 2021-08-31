
import java.util.Scanner;

public class GetData {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        String direccion;
        int edad;
        double sueldo;

        System.out.print("Ingrese su nombre y apellido: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su Direccion: ");
        direccion = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese el sueldo: ");
        sueldo = entrada.nextDouble();

        System.out.print("\n\n LOS RESULTADOS INGRESADOS SON:\n\n");

        System.out.println("NOMBRE: \t" + nombre);
        System.out.println("DIRECCION: \t" + direccion);
        System.out.println("EDAD: \t\t" + edad);
        System.out.println("SUELDO: \t" + "$ " + sueldo);

    }
}