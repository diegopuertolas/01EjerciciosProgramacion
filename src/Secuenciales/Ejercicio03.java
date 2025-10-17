package Secuenciales;

// 3) Algoritmo que pida un número y muestre su valor después de sumarle 10.

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double dNum = sc.nextDouble();

        dNum += 10;

        System.out.println("El número tras sumarle 10 es: " + dNum);

    }
}
