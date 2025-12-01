public class EnvioLocal extends Envio {
    private int distanciaKm;

    // Constructor con super()
    public EnvioLocal(String codigo, String destinatario, double costoBase, int distanciaKm) {
        super(codigo, destinatario, costoBase);
        this.distanciaKm = distanciaKm;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    // Sobrescritura (polimorfismo)
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Distancia: " + distanciaKm + " km";
    }
}