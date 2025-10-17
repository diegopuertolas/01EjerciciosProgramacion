package Secuenciales;

/*
 * 5) Algoritmo que pida un nombre y apellido y que muestre nombre y apellidos concatenados.
 */

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String strNombre = sc.next();

        System.out.print("Ingrese un apellido: ");
        String strApellido = sc.next();

        System.out.println(strNombre + strApellido);
    }
}
