package Archivos;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Lector {
    
    public String leerCuerpoDelDia(int dia) {
        String nombreArchivo = dia + ".txt";
        String rutaProyecto = System.getProperty("user.dir");
        
        File archivo = new File(rutaProyecto + File.separator + "Correos" + File.separator + nombreArchivo);

        System.out.println("🔍 Buscando archivo en: " + archivo.getAbsolutePath());

        if (archivo.exists()) {
            try {
                return Files.readString(archivo.toPath(), StandardCharsets.UTF_8);
            } catch (Exception e) {
                System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("❌ El archivo NO existe en esa ruta exacta.");
        }

        return "¡Hola amor! Tienes una nueva carta esperándote en nuestra web. ❤️";
    }
}