public class Main {
    public static void main(String[] args) {

        // 1. Crear gestor con capacidad mínima 4
        GestorEnvios gestor = new GestorEnvios(4);

        // 2. Crear 2 envíos locales y 2 internacionales
        EnvioLocal envioLocal1 = new EnvioLocal("LOC001", "Juan Londoño Díaz - Bogotá", 45.500, 15);
        EnvioLocal envioLocal2 = new EnvioLocal("LOC002", "María López Correa - Cali", 38.800, 8);
        EnvioInternacional envioInternacional1 = new EnvioInternacional("INT001", "Pedro Gómez Gómez - USA", 125.000, 42.300);
        EnvioInternacional envioInternacional2 = new EnvioInternacional("INT002", "Ana Ruiz Hernandez - Europa", 198.900, 67.500);

        // 3. Agregar al gestor
        gestor.agregarEnvio(envioLocal1);
        gestor.agregarEnvio(envioLocal2);
        gestor.agregarEnvio(envioInternacional1);
        gestor.agregarEnvio(envioInternacional2);

        // 4. Recorrer y mostrar detalles + costo total
        System.out.println("=== GESTIÓN DE ENVÍOS ===\n");

        double totalGeneral = 0.0;

        for (int i = 0; i < gestor.getContador(); i++) {
            Envio envio = gestor.getEnvios()[i];
            System.out.println(envio.obtenerDetalles());

            // Calcular costo total según tipo
            double costoTotal;
            if (envio instanceof EnvioInternacional) {
                EnvioInternacional ei = (EnvioInternacional) envio;
                costoTotal = ei.getCostoBase() + ei.getImpuestoAduana();
            } else {
                costoTotal = envio.getCostoBase();
            }

            System.out.println("Costo total: $" + String.format("%.2f", costoTotal));
            totalGeneral += costoTotal;
            System.out.println("-------------------------------");
        }

        System.out.println("COSTO TOTAL GENERAL: $" + String.format("%.2f", totalGeneral));
    }
}