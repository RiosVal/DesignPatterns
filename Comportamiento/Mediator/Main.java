import models.Coche;
import models.CocheMediator;
import models.Radio;
import models.Telefono;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Telefono y Radio
        Telefono telefono = new Telefono();
        Radio radio = new Radio();

        // Crear instancia de Mediator y configurar los componentes
        CocheMediator mediator = new CocheMediator();
        mediator.setTelefono(telefono);
        mediator.setRadio(radio);

        // Configurar los mediators en los componentes
        telefono.setMediator(mediator);
        radio.setMediator(mediator);

        // Crear instancia de Coche y configurar el mediator
        Coche coche = new Coche();
        coche.setMediator(mediator);

        // Pruebas de funcionalidad
        System.out.println("Pruebas iniciales:");
        System.out.println("Radio encendida: " + radio.encendida()); // Debería ser false
        System.out.println("Música encendida: " + telefono.musicaEncendida()); // Debería ser false

        System.out.println("\nEncendiendo la música del teléfono...");
        telefono.enciendeMusica();
        System.out.println("Música encendida: " + telefono.musicaEncendida()); // Debería ser true

        System.out.println("\nEncendiendo el coche...");
        coche.enciende();
        System.out.println("Radio encendida: " + radio.encendida()); // Debería ser true
        System.out.println("Música encendida: " + telefono.musicaEncendida()); // Debería ser false

        System.out.println("\nApagando el coche...");
        coche.apaga();
        System.out.println("Radio encendida: " + radio.encendida()); // Debería ser false

        System.out.println("\nRecibiendo una llamada en el teléfono...");
        telefono.recibeLlamada();
        System.out.println("Radio encendida: " + radio.encendida()); // Debería ser false
        System.out.println("Música encendida: " + telefono.musicaEncendida()); // Debería ser false
    }
}
