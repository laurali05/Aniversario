package Main;

// import Fecha.Fecha;
import Correo.Envio;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Mensajero del Diario ---");

        try {
            // 1. Creamos el objeto fecha con el día que empezó todo
            // Fecha contador = new Fecha(3, 8, 2026); 
            
            // 2. Calculamos cuántos días han pasado
            //int diaHoy = contador.diasEntreFechas();
            int diaHoy =  8;

            if (diaHoy < 0) {
                System.out.println("Aún no ha llegado el gran día.");
                return;
            }

            System.out.println("Hoy es el día número: " + (diaHoy + 1));

            // 3. Enviamos el correo (Sumamos 1 porque el día 0 es el primero)
            Envio.enviarCorreo(diaHoy + 1);

            System.out.println("--- Proceso finalizado con éxito ---");
            
        } catch (Exception e) {
            System.out.println("Vaya, algo ha fallado:");
            e.printStackTrace();
        }
    }
}