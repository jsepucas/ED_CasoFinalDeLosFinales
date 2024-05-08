package A_modelo;

import B_utilidades.Utilidades;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CuentaUsuario {
    private String alias;
    private String correoElectronico;
    private List<Tuit> tuits;
    private List<Tuit> lineaDeTiempo;
    private Set<CuentaUsuario> seguidores;
    private Set<CuentaUsuario> siguiendo;

    public CuentaUsuario(String alias, String correoElectronico) {
        if (!Utilidades.esCorreoValido(correoElectronico)) {
            throw new IllegalArgumentException("Dirección de correo electrónico inválida.");
        }
        if (!Utilidades.esAliasValido(alias)) {
            throw new IllegalArgumentException("El alias debe contener solo letras y números.");
        }
        this.alias = alias;
        this.correoElectronico = correoElectronico;
        this.tuits = new LinkedList<>();
        this.lineaDeTiempo = new LinkedList<>();
        this.seguidores = new HashSet<>();
        this.siguiendo = new HashSet<>();
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return correoElectronico;
    }

    public boolean yaSigueA(CuentaUsuario usuarioAseguir) {
        return siguiendo.contains(usuarioAseguir);
    }

    public void seguir(CuentaUsuario usuarioAseguir) {
    }

    public void publicarTuit(Tuit nuevoTuit) {
    }

    // Otros métodos...
}
