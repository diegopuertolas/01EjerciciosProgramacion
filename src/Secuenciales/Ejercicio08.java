package Secuenciales;

// 8) Algoritmo que pida dos números y diga cuál de ellos es mayor o bien si son iguales.

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        double dNum1 = sc.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        double dNum2 = sc.nextDouble();

        if (dNum1 > dNum2) {
            System.out.println(dNum1 + " es mayor que " + dNum2);
        } else if (dNum2 > dNum1) {
            System.out.println(dNum2 + " es mayor que " + dNum1);
        } else {
            System.out.println("Los números son iguales.");
        }

    }
}
