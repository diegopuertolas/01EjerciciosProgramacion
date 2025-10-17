package Secuenciales;

/*
 *  4) Algoritmo que pida dos números y muestre por pantalla su suma, resta, producto y división.
 */

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        double dNum1 = sc.nextDouble();

        System.out.print("Ingrese un segundo número: ");
        double dNum2 = sc.nextDouble();

        double dSuma = dNum1 + dNum2;
        double dResta = dNum1 - dNum2;
        double dProducto = dNum1 * dNum2;
        double dDivision = dNum1 / dNum2;

        System.out.println("La suma es " + dSuma);
        System.out.println("La resta es " + dResta);
        System.out.println("El producto es " + dProducto);
        System.out.println("La division es " + dDivision);

    }
}
