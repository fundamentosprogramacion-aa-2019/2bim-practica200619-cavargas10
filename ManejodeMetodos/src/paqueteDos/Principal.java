package paqueteDos;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Ingrese el valor de la tabla");
        int valorA = sc.nextInt();

        System.out.println(
                "Ingrese el limite de la tabla");
        int valorB = sc.nextInt();

        Operacion.presentarTabla(valorA, valorB);
    }
}