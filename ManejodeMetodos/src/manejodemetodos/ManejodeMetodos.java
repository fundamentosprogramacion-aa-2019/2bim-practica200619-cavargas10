package manejodemetodos;

/**
 *
 * @author cavargas10
 */
public class ManejodeMetodos {

    public static void main(String[] args) {

        int valor = 10;
        int valor2 = 2;

        double resultado = MisMetodos.obtenerPotencia(valor, valor2);
        System.out.printf("El resultado es : %.2f\n", resultado);

        MisMetodos.obtenerPotenciaDos(valor, valor2);

    }

}
