import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner tc= new Scanner(System.in);

        System.out.println("Hola, bienvenido");
        System.out.println("digita la cantidad de números a ingresar");
        int n = tc.nextInt();

        int numeros[] = new int[n];

        // Llenar el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = tc.nextInt();
        }

        // Suponemos que el primer elemento es el mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorrer el arreglo para comparar
        for (int i = 0; i < n; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }
}
