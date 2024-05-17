package models;

import mediatorInterfaces.Mediator;

public class Radio {
    private boolean encendida = false;
    private Mediator mediator;

    public Radio(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
        mediator.encenderRadio();
    }

    public void apaga() {
        encendida = false;
        mediator.apagarRadio();
    }

    public boolean encendida() {
        return encendida;
    }
}
