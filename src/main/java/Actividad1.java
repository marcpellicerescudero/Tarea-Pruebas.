import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {
    static Scanner lector = new Scanner(System.in);

    public static void main(String [] args) {
        int precioBase = 0;
        int descuento = 0;
        boolean datosValidos = false;

        // El bucle seguirá pidiendo datos hasta que sean correctos
        while (!datosValidos) {
            try {
                System.out.print("Introduce el precio base: ");
                precioBase = lector.nextInt();

                System.out.print("Introduce el descuento (0 a 100): ");
                descuento = lector.nextInt();


                if (precioBase < 0 || descuento < 0 || descuento > 100) {
                    System.out.println("Error: El precio no puede ser negativo y el descuento debe estar entre 0 y 100.\n");
                } else {
                    datosValidos = true; //
                }

            } catch (InputMismatchException e) {

                System.out.println("Error: Debes introducir un número entero.\n");
                lector.nextLine();
            }
        }


        double res = calcularPrecioFinal(precioBase, descuento);
        System.out.println("El precio final es: " + res);
    }

    public static int calcularPrecioFinal(int precioBase, int descuento) {

        return precioBase - (precioBase * descuento / 100);
    }
}
