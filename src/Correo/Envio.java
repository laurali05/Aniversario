package Correo;

import Archivos.Lector;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Envio {
    public static void enviarCorreo(int diaActual) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        String miCorreo = "lopeizquierd@gmail.com";
        String Contraseña = "yoyw bjbi gxdg woza";

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(miCorreo, Contraseña);
            }
        });

        try {
            // 3. Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(miCorreo));
            // Cambia esto por el email de tu novio
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("lopeizquierd@gmail.com"));

            message.setSubject("💌 Día " + diaActual + ": Un nuevo detalle te espera");

            Archivos.Lector miLector = new Archivos.Lector();
            // 1. Obtenemos el texto personalizado del archivo .txt
            String mensajePersonalizado = miLector.leerCuerpoDelDia(diaActual);

            // 2. Montamos el cuerpo del email
            // Dentro de tu try en Envio.java
            String urlWeb = "https://laurali05.github.io/Diario-2026/index.html?dia=" + diaActual;
            String cuerpoFinal = mensajePersonalizado + "\n\n" +
                    "Puedes leer tu carta detallada aquí: " + urlWeb;

            // Importante: asegúrate de que el link sea lo último o esté bien separado
            message.setText(cuerpoFinal);

            // 4. Enviar
            Transport.send(message);
            System.out.println("¡Correo del día " + diaActual + " enviado con éxito!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
