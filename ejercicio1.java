import java.util.Scanner;

//Pide al usuario cuántos números va a ingresar (n).
// Luego pide esos n números y guárdalos en un array.
// Recorre el array con un ciclo y usa un condicional para clasificar cada número como par o impar.
// Al final, imprime cuántos números pares y cuántos impares se ingresaron.

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Hola, Bienvenido");
        System.out.println("---------------------");
        System.out.println("Digite la coantidad de números que va a ingresar");
        int cantidad = tc.nextInt();

        int[] numero = new int[cantidad];
        int par = 0;
        int impar = 0;

        for (int i = 0; i <numero.length; i++){
            System.out.println("Ingresa el "+ (i+1)+" numero");
            numero[i] =tc.nextInt();

            if ((numero[i]&2)==0){
                par++;
            }else{
                impar++;
            }

        }
        System.out.println("Números pares ingresados = "+par);
        System.out.println("Números impares ingresados = "+impar);
    }
}
