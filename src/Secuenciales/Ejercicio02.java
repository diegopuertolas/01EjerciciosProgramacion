package Secuenciales;

// 2) Algoritmo que pida un nombre y lo muestre por pantalla.

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String strName = sc.next();

        System.out.println("Te llamas " + strName);

    }
}

