/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Clase que envia correo usando libreria JavaMail.
 * @author renecsc
 */
public class EnviaCorreo {
    //Atributos del usuario que envia el correo.
    private static final String usuario = "lacartadenanayrene";
    private static final String contrasena = "nanarene1234";
    private static final String correo = "lacartadenanayrene@gmail.com";
    
    /**
     * Metodo que envia el correo
     * @author renecsc
     * @param correoDestinatario
     * @param filename
     * @param asunto
     * @param contenidoMensaje 
     */
    public static void enviar(String correoDestinatario, String valorAPagar, String fechaRetiro) {
        //Se inicializan las propiedades 
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.socketFactory.port", "465");
        propiedades.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.port", "465");
        //Se inicia la sesion
        Session sesion;
        sesion = Session.getDefaultInstance(propiedades,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(usuario, contrasena);
                    }
                });
        //Se envia el correo
        try {
            //Se declara el mensaje y se asignan sus partes.
            Message mensaje = new MimeMessage(sesion);
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(correoDestinatario));
            mensaje.setSubject("Notificación de padido");
            
            String contenidoMensaje = "Estimado cliente: \n Su pedido se encuentra finalizado.\n "
                                        + "Total a pagar:" + valorAPagar +"\n"
                                        + "Horario de atencion: 10hrs. - 20hrs.\n"
                                        + "Fecha retiro: " + fechaRetiro + "\n"
                                        + "Dirección: calle todo el sazón esquina sabrozonga Numero 69 \n" 
                                        + "No responder este mensaje!";
            
            MimeBodyPart mensajeBodyPart = new MimeBodyPart();
            mensajeBodyPart.setContent(contenidoMensaje, "text/plain");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mensajeBodyPart);

            // Envia todas las partes del correo
            mensaje.setContent(multipart);

            Transport.send(mensaje);
            System.out.println("Mensaje para:  " + correoDestinatario + " enviado correctamente.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
