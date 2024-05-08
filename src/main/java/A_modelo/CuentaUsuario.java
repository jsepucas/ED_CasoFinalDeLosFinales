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

    public void seguir(CuentaUsuario usuario) {
        if (usuario != null && !this.siguiendo.contains(usuario)) {
            this.siguiendo.add(usuario);
            usuario.seguidores.add(this);
        }
    }

    public void publicarTuit(Tuit tuit) {
        this.tuits.add(tuit);
        this.seguidores.forEach(seguidor -> seguidor.lineaDeTiempo.add(tuit));
    }

    @Override
    public String toString() {
        return "CuentaUsuario{" +
                "alias='" + alias + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
