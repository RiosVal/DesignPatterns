import mediatorImplementation.CocheMediator;
import models.Coche;
import models.Radio;
import models.Telefono;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono(null);
        Radio radio = new Radio(null);
        CocheMediator mediator = new CocheMediator(telefono, radio);
        telefono.setMediator(mediator);
        radio.setMediator(mediator);
        Coche coche = new Coche(mediator);

        coche.enciende();
        telefono.sonar();
        coche.apaga();
    }
}
