import models.Coche;
import models.Radio;
import models.Telefono;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();
        Radio radio = new Radio();
        Coche coche = new Coche();

        telefono.setRadio(radio);
        radio.setTelefono(telefono);
        coche.setTelefono(telefono);
        coche.setRadio(radio);

        System.out.println("Estado inicial de la música en el teléfono: " + telefono.musicaEncendida());
        System.out.println("Estado inicial de la radio: " + radio.encendida());

        telefono.enciendeMusica();
        System.out.println("Música encendida en el teléfono: " + telefono.musicaEncendida());

        coche.enciende();
        System.out.println("Radio encendida desde el coche: " + radio.encendida());
        System.out.println("Música encendida en el teléfono después de encender la radio: " + telefono.musicaEncendida());

        telefono.recibeLlamada();
        System.out.println("Radio encendida después de recibir una llamada: " + radio.encendida());

        coche.apaga();
        System.out.println("Radio encendida después de apagar el coche: " + radio.encendida());
    }
}
