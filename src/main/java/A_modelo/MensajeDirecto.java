package A_modelo;

public class MensajeDirecto extends Tuit {
    private CuentaUsuario receptor;

    public MensajeDirecto(String mensaje, CuentaUsuario emisor, CuentaUsuario receptor, long momento) {
        super(mensaje, emisor, momento);
        this.receptor = receptor;
    }
}


