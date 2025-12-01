public class GestorEnvios {
    private Envio[] envios;
    private int contador = 0;

    // Constructor
    public GestorEnvios(int capacidad) {
        envios = new Envio[capacidad];
    }

    // Método para agregar
    public void agregarEnvio(Envio e) {
        if (contador < envios.length) {
            envios[contador] = e;
            contador++;
        } else {
            System.out.println("Capacidad máxima alcanzada.");
        }
    }

    // Getter para el array para recorrer en el Main
    public Envio[] getEnvios() {
        return envios;
    }

    // Getter para contador
    public int getContador() {
        return contador;
    }
}