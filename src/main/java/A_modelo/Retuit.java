package A_modelo;

public class Retuit extends Tuit {
    private Tuit tuitOriginal;

    public Retuit(Tuit tuitOriginal, CuentaUsuario emisor, long momento) {
        super(tuitOriginal.message, emisor);
        this.tuitOriginal = tuitOriginal;
    }
}