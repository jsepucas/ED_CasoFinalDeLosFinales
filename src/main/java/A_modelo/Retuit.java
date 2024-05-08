package A_modelo;

public class Retuit extends Tuit {
    private Tuit tuitOriginal;

    public Retuit(Tuit tuitOriginal, CuentaUsuario emisor, long momento) {
        super(tuitOriginal.mensaje, emisor, momento);
        this.tuitOriginal = tuitOriginal;
    }
}
