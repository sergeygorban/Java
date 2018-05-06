package mail;


import javax.activation.DataHandler;
import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

/**
 * Created by CC on 16.04.2018.
 */
// https://developers.google.com/gmail/api/guides/sending

public class SendEmail {

    /*
    private String host = "smtp.gmail.com";
    private String port = "587";
    private String username = "sergey.gorban.cc@gmail.com";
    private String password = "zxczxc19867150";
    private String to = "sergey.gorban@ukr.net";
    private String filePath = "C:\\Users\\CC\\Desktop\\ddt1.xlsx";


    public void sendEmail() {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Get the Session object.
        Session session = Session.getInstance(props,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test Cases");

            MimeBodyPart mimeBodyPart1 = new MimeBodyPart();
            mimeBodyPart1.setContent("Hello, this is a new Test Cases", "text/plain");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart1);

            MimeBodyPart mimeBodyPart2 = new MimeBodyPart();
            File file = new File(filePath);
            mimeBodyPart2.setDataHandler(new DataHandler(new FileDataSource(file)));
            mimeBodyPart2.setFileName(file.getName());
            multipart.addBodyPart(mimeBodyPart2);

            message.setContent(multipart);
            Transport.send(message);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws MessagingException {

        SendEmail sendEmail = new SendEmail();
        sendEmail.sendEmail();


    }
*/
}

