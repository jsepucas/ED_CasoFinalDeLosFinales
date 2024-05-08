package B_utilidades;

import A_modelo.CuentaUsuario;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utilidades {
    public static boolean esCorreoValido(String correo) {
        return correo != null && correo.contains("@");
    }

    public static boolean esAliasValido(String alias) {
        return alias != null && alias.matches("[a-zA-Z0-9]+");
    }

    public static void ordenarPorCorreo(List<CuentaUsuario> usuarios) {
        Collections.sort(usuarios, Comparator.comparing(CuentaUsuario::getEmail));
    }

    public static void ordenarPorAlias(List<CuentaUsuario> usuarios) {
        Collections.sort(usuarios, Comparator.comparing(CuentaUsuario::getAlias));
    }
}
