package models;

public class Radio {
    private Mediator mediator;
    private boolean encendida = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
    }

    public void apaga() {
        encendida = false;
    }

    public boolean encendida() {
        return encendida;
    }
}

