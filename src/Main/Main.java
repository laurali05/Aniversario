package Main;

import java.io.File;
import java.io.IOException;

public class Main {
    // Todo programa Java empieza a ejecutar aquí
    public static void main(String[] args) {
        
        // 1. Asegúrate de que la carpeta existe antes de crear los archivos
        File directorio = new File("Archivos/Cartas");
        if (!directorio.exists()) {
            directorio.mkdirs(); // Esto crea la carpeta si no existe
        }

        // 2. Tu bucle para crear los 365 archivos
        for (int i = 1; i <= 365; i++) {
            File archivo = new File("Archivos/Cartas/" + i + ".txt");
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Creado con éxito: " + i + ".txt");
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo " + i);
                e.printStackTrace();
            }
        }
        
        System.out.println("¡Proceso finalizado!");
    }
}

