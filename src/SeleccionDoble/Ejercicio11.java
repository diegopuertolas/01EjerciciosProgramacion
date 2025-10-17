package SeleccionDoble;

/*
 *  11) Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo,
 *  debe imprimir el producto de los tres y si no lo es, imprimirá la suma.
 */

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        int dNum1 = sc.nextInt();

        // Comprobamos si el primer número es 0.
        if (dNum1 == 0) {
            System.out.println("Error: el número no puede ser cero.");
        }

        System.out.print("Ingrese un segundo número: ");
        int dNum2 = sc.nextInt();

        System.out.print("Ingrese un tercer número: ");
        int dNum3 = sc.nextInt();

        if (dNum1 < 0)
        {
            double dProducto = dNum1 * dNum2 * dNum3;
            System.out.println("El producto es: " + dProducto);

        } else if (dNum1 > 0)
        {
            double dSuma = dNum1 + dNum2 + dNum3;
            System.out.println("La suma es: " + dSuma);
        }
    }
}
