package A_modelo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class Tuit {
    protected String message;
    protected CuentaUsuario sender;
    protected LocalDate time;

    public Tuit(String message, CuentaUsuario sender, long momento) {
        if (message.length() > 140)
            throw new IllegalArgumentException("Message exceeds 140 characters");
        this.message = message;
        this.sender = sender;
        this.time = Instant.ofEpochMilli(momento).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "message='" + message + '\'' +
                ", sender=" + sender.getAlias() +
                ", time=" + time +
                '}';
    }
}
