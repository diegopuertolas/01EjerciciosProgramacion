package SeleccionDoble;

// 12) Algoritmo que pida un número y visualice por pantalla si es par o impar.

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int iNum = sc.nextInt();

        if (iNum % 2 == 0) {
            System.out.println(iNum + " es un número par.");
        } else {
            System.out.println(iNum + " no es un número par.");
        }

    }
}
