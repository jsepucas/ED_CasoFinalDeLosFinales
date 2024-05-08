package B_utilidades;


public class Utilidades {
    public static boolean esCorreoValido(String correo) {
        return correo != null && correo.contains("@");
    }

    public static boolean esAliasValido(String alias) {
        return alias != null && alias.matches("\\w+");
    }
}