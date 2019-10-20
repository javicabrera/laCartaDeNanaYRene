/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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
     * Metodo para enviar un correo
     * @param correoDestinatario
     * @param valorAPagar
     * @param fechaRetiro 
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
            mensaje.setSubject("Notificación de pedido");
            //Se declara el contenido html del mensaje

            String contenidoMensaje = "<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
"<title>Notificación de pedido</title>\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
"</head>\n" +
"<body style=\"margin: 0; padding: 0;\">\n" +
"	<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">	\n" +
"		<tr>\n" +
"			<td style=\"padding: 10px 0 30px 0;\">\n" +
"				<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" style=\"border: 1px solid #cccccc; border-collapse: collapse;\">\n" +
"					<tr>\n" +
"						<td align=\"center\" bgcolor=\"#99c5ab\" style=\"padding: 40px 0 30px 0; color: #eeeeee; font-size: 28px; font-weight: bold; font-family: Arial, sans-serif;\">\n" +
"                                                       <b>La carta de Naná y René</b>"+
"							<img src=\"cid:cidlogo\" width=\"90\" height=\"90\" style=\"display: block;\" />\n" +
"						</td>\n" +
"					</tr>\n" +
"					<tr>\n" +
"						<td bgcolor=\"#ffffff\" style=\"padding: 40px 30px 40px 30px;\">\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
"								<tr>\n" +
"									<td style=\"color: #153643; font-family: Arial, sans-serif; font-size: 24px;\">\n" +
"										<b>Su pedido está listo!</b>\n" +
"                                    </td>\n" +
"                                    \n" +
"								</tr>\n" +
"								<tr>\n" +
"									<td style=\"padding: 20px 0 20px 0; color: #153643; font-family: Arial, sans-serif; font-size: 12px; line-height: 10px;\">\n" +
"                                        <p>Total a pagar:"+ valorAPagar+ "</p>                                        \n" +
"                                        <p>Fecha retiro:" + fechaRetiro+ "</p>\n" +
"                                        <p>Horario de atencion: 10hrs. - 20hrs.</p>\n" +
"                                        <p>Dirección: Calle Todo El Sazon Esquina Sabrozonga #69</p>\n" +
"                                        <p>No responder este mensaje!</p>\n" +
"									</td>\n" +
"								</tr>\n" +
"								\n" +
"							</table>\n" +
"						</td>\n" +
"					</tr>\n" +
"					<tr>\n" +
"						<td bgcolor=\"#c599b3\" style=\"padding: 30px 30px 30px 30px;\">\n" +
"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
"								<tr>\n" +
"									<td style=\"color: #ffffff; font-family: Arial, sans-serif; font-size: 14px;\" width=\"75%\">\n" +
"										&reg; Les Bastardes, Universidad de Talca 2019<br/>\n" +
"										\n" +
"									</td>\n" +
"									\n" +
"								</tr>\n" +
"							</table>\n" +
"						</td>\n" +
"					</tr>\n" +
"				</table>\n" +
"			</td>\n" +
"		</tr>\n" +
"	</table>\n" +
"</body>\n" +
"</html>";
            //Se setea el contenido de mensaje 
            MimeBodyPart mensajeBodyPart = new MimeBodyPart();
            mensajeBodyPart.setContent(contenidoMensaje, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mensajeBodyPart);
            
            //Se carga la imagen de logo
            mensajeBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource("src/Recursos/logo.png");
            mensajeBodyPart.setDataHandler(new DataHandler(fds));
            mensajeBodyPart.setHeader("Content-ID", "<cidlogo>");
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
