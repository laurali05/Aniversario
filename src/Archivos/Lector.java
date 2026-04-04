package Archivos;

import java.nio.file.*;
import java.io.IOException;

public class Lector {
    
    public String leerCuerpoDelDia(int dia) {
        try {
            // Asegúrate de que esta carpeta existe en la raíz de tu proyecto
            Path ruta = Paths.get("mensajes_email/" + dia + ".txt");
            return Files.readString(ruta);
        } catch (IOException e) {
            return "¡Hola amor! Tienes una nueva carta esperándote en nuestra web. ❤️";
        }
    }
}