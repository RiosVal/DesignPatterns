package models;

import mediatorInterfaces.Mediator;

public class Telefono {
    private boolean musicaOn = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Telefono(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciendeMusica() {
        musicaOn = true;
    }

    public void apagaMusica() {
        musicaOn = false;
    }

    public boolean musicaEncendida() {
        return musicaOn;
    }

    // Este método se llama cuando el teléfono suena
    public void sonar() {
        mediator.sonarTelefono();
    }
}
