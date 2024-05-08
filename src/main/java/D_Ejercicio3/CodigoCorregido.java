package D_Ejercicio3;

public class CodigoCorregido {
    public static void main(String[] args) {
        int a = recursive(1, -2);
        System.out.println(a);
    }

    public static int recursive(int a, int b) {
        if (b < 0) {
            return 0; // Manejo de casos donde b es negativo.
        } else if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * recursive(a, b - 1);
        }
    }
}

// El código está diseñado para calcular la potencia de un número a elevado a b, es
//decir, a^b. Utiliza un método recursivo simple, donde la función se llama a sí misma
//hasta alcanzar un caso base. El caso base ocurre cuando b es cero, donde por
//definición matemática, cualquier número elevado a cero es uno. Si a es cero y b
//es cero, el resultado es uno, según la convención matemática.