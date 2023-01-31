import java.util.*;

public class Celular3 implements Observer {
    private java.lang.String ModeloCelular;
    private Xiaomi xiaomi;

    public Celular3(Xiaomi i) {
        this.xiaomi = i;
        xiaomi.registerObserver(this);
        ModeloCelular = "Redmi Note 9PRO";
    }

    public void update(java.lang.String m) {
        ModeloCelular = m;
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email a telefono 3: El celular " + ModeloCelular + " Ya está registrado");
    }
}