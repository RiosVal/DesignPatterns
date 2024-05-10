public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del singleton
        Singleton singleton = Singleton.obtenerInstancia();

        // Llamar a métodos de la instancia única gracias a singleton
        singleton.mensaje();
    }
}
