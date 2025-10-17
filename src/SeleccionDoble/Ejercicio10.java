package SeleccionDoble;

// 10) Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor.

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        double dNum1 = sc.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        double dNum2 = sc.nextDouble();

        System.out.print("Ingrese un tercer número: ");
        double dNum3 = sc.nextDouble();

        if (dNum1 > dNum2 && dNum1 > dNum3) {
            System.out.println(dNum1 + " es  mayor a los demás.");
        } else if (dNum2 > dNum1 && dNum2 > dNum3) {
            System.out.println(dNum2 + " 1es mayor a los demás ");
        } else if (dNum3 > dNum1 && dNum3 > dNum2) {
            System.out.println(dNum3 + " es mayor a los demás.");
        }

    }
}
