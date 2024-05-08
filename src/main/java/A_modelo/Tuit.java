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

public class MensajeDirecto extends Tuit {
    private CuentaUsuario receptor;

    public MensajeDirecto(String mensaje, CuentaUsuario emisor, CuentaUsuario receptor, long momento) {
        super(mensaje, emisor, momento);
        this.receptor = receptor;
    }
}

public class Retuit extends Tuit {
    private Tuit tuitOriginal;

    public Retuit(Tuit tuitOriginal, CuentaUsuario emisor, long momento) {
        super(tuitOriginal.mensaje, emisor, momento);
        this.tuitOriginal = tuitOriginal;
    }
}