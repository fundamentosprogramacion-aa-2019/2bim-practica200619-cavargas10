package paqueteDos;

/**
 *
 * @author cavargas10
 */
public class Operacion {

    public static void presentarTabla(int a, int limite) {
        /*
        a =2
        limite = 10
        2 * 1 = 2
         */
        int op;

        String cadena = String.format("Tabla del %d\n", a);
        for (int i = 0; i <= limite; i++) {
            op = a * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, a, i, op);
        }
        System.out.printf("%s\n", cadena);
    }
}

