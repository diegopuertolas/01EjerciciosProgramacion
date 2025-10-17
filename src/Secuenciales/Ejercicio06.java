package Secuenciales;

// 6) Algoritmo que pida dos números y diga si son iguales.

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        double dNum1 = sc.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        double dNum2 = sc.nextDouble();

        if (dNum1 == dNum2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }

    }
}
