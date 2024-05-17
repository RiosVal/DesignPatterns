package mediatorImplementation;

import mediatorInterfaces.Mediator;
import models.Radio;
import models.Telefono;

public class CocheMediator implements Mediator {
    private Telefono telefono;
    private Radio radio;

    public CocheMediator(Telefono telefono, Radio radio) {
        this.telefono = telefono;
        this.radio = radio;
    }

    @Override
    public void encenderCoche() {
        radio.enciende();
        telefono.apagaMusica();
    }

    @Override
    public void apagarCoche() {
        radio.apaga();
    }

    @Override
    public void sonarTelefono() {
        radio.apaga();
    }

    @Override
    public void encenderRadio() {
        radio.enciende();
        telefono.apagaMusica();
    }

    @Override
    public void apagarRadio() {
        radio.apaga();
    }
}
