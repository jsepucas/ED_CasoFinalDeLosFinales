package E_Ejercicio4;
/**
 * Tipo de Recursividad: Recursividad Lineal
 * - Cada ejecución de la función genera una única llamada recursiva hasta alcanzar el caso base.
 *
 * Complejidad Computacional:
 * - Complejidad Temporal: O(n), donde n es el número de dígitos del número inicial.
 *   Cada dígito se procesa una vez por cada llamada recursiva.
 * - Complejidad Espacial: O(n), correspondiente a la profundidad de la pila de llamadas recursivas.
 *
 * Descripción:
 * Este método utiliza la recursividad para simplificar la suma de los dígitos de un número,
 * logrando un enfoque eficiente y claro para resolver el problema.
 */

//Codigo --->

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 102;
        int resultado = sumaDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }

    public static int sumaDigitos(int num) {
        // Caso base: si el número es menor que 10, devuelve el número (último dígito)
        if (num < 10) {
            return num;
        } else {
            // Llama recursivamente a la función con el número dividido por 10
            // y suma el dígito de las unidades al resultado de la llamada recursiva
            return num % 10 + sumaDigitos(num / 10);
        }
    }
}



