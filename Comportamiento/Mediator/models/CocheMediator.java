package models;

public class CocheMediator implements Mediator {
    private Telefono telefono;
    private Radio radio;

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
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

    @Override
    public void apagarMusica() {
        telefono.apagaMusica();
    }

    @Override
    public void recibeLlamada() {
        radio.apaga();
        telefono.apagaMusica();
    }
}
