package Main;

import java.io.File;
import java.io.IOException;

public class Main {
    // Todo programa Java empieza a ejecutar aquí
    public static void main(String[] args) {

        // 1. Definimos la ruta exacta (con src/)
        String rutaCarpeta = "src/Archivos/Correos/";

        File directorio = new File(rutaCarpeta);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        for (int i = 1; i <= 365; i++) {
            // 2. Usamos la misma ruta para el archivo
            File archivo = new File(rutaCarpeta + i + ".txt");
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Creado en src: " + i + ".txt");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("¡Proceso finalizado!");
    }
}
