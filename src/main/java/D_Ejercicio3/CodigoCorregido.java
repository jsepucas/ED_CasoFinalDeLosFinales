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
            return a * recursive(a, b - 2);
        }
    }
}
