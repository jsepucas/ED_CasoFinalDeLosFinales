package A_modelo;

public class Tuit {
    protected String mensaje;
    protected CuentaUsuario emisor;
    protected long momento;

    public Tuit(String mensaje, CuentaUsuario emisor, long momento) {
        this.mensaje = mensaje;
        this.emisor = emisor;
        this.momento = momento;
    }
}