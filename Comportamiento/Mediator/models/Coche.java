package models;

public class Coche {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.encenderRadio();
    }

    public void apaga() {
        mediator.apagarRadio();
    }
}