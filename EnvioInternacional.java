public class EnvioInternacional extends Envio {
    private double impuestoAduana;

    // Constructor con super()
    public EnvioInternacional(String codigo, String destinatario, double costoBase, double impuestoAduana) {
        super(codigo, destinatario, costoBase);
        this.impuestoAduana = impuestoAduana;
    }

    public double getImpuestoAduana() {
        return impuestoAduana;
    }

    // Sobrescritura (polimorfismo)
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Impuesto Aduana: " + impuestoAduana;
    }
}