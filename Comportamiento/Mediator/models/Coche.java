package models;

import mediatorInterfaces.Mediator;

public class Coche {
    private Mediator mediator;

    public Coche(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.encenderCoche();
    }

    public void apaga() {
        mediator.apagarCoche();
    }
}
