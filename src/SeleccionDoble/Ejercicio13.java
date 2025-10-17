package SeleccionDoble;

//TODO
/*
 *  13) Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
 *  pide realizar un algoritmo que intercambie los valores de ambas variables y
 *  muestre por pantalla cuánto valen al final las dos variables.
 */

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        int iNum1 = sc.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int iNum2 = sc.nextInt();

        // Creamos una variable auxiliar.
        int iAux = iNum1;
        iNum1 = iNum2;
        iNum2 = iAux;



        System.out.println(iNum1);
        System.out.println(iNum2);



    }
}
