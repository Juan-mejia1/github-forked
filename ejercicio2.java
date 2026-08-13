 import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Hola, bienvenido");
        System.out.println("-------------------");
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantidad = tc.nextInt();

        double[] nota = new double[cantidad];
        double suma = 0;
        double promedio = 0;

        for (int i = 0; i <nota.length; i++){

            System.out.println("Ingrese la nota del estudiante "+(i+1));
            nota[i] = tc.nextDouble();
            if (nota[i]<1 || nota[i]>5){

                do {
                    System.out.println("La nota ingresada no es valida");
                    System.out.println("Vuelve a ingresar la nota");
                    nota[i] = tc.nextDouble();
                }while (nota[i]<1 || nota[i]>5);

            }
            suma += nota[i];

        }
        promedio = suma / nota.length;
        System.out.println("El promedio de las nota del curso es " + promedio);
        if (promedio>=3.5) {
            System.out.println("El curso aprobó");
        }else {
            System.out.println("El curso reprobó");
        }

    }



}
