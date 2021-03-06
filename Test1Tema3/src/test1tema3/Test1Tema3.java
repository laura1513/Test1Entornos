package test1tema3;

/**
 * Esta clase calculará el factorial de un número o la multiplicación de dos
 * números.
 *
 * @author laura
 */
public class Test1Tema3 {

    /**
     * Método que multiplica dos números enteros
     *
     * @param a Primer número emtero
     * @param b Segundo número entero
     * @return Devuelve a*b
     */
    public static int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Método para calcular el factorial de un número
     *
     * @param num El número que se le introduce
     * @return Devuelve el factorial de num
     */
    public static int factorial(int num) {
        int factorial = num;
        if (num < 0) {
            throw new IllegalArgumentException("Factorial negativo!");
        }
        for (int i = (num - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        int y = 6;
        System.out.println(multiplica(x, y));

        int numero = 5;
        System.out.println(factorial(numero));
    }

}
