package testng.mkt;


import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class smtp {
	public static void main(String args[]) throws IOException {
        // Run your test script here
        // Assuming you have generated the report and stored it in a variable called 'report'

        // Your email credentials
        String fromEmail = "121910316026@gitam.in";
        String password = "sai0105$";

        // Recipient's email address
        String toEmail = "bhargavsai0105@gmail.com";

        // SMTP server details
        String host = "smtp.gmail.com";
        int port = 587; // Change the port according to your SMTP server configuration

        // Email content
        String subject = "Test Report";
        String body = "Please find attached the test report.";

        // Set properties for the SMTP server
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Create a Session object with the specified properties
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress(fromEmail));

            // Set To: header field
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));

            // Set Subject: header field
            message.setSubject(subject);

            // Create MimeBodyPart for the email body
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);

            // Create MimeBodyPart for the attachment
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile("C://Users//bharg//eclipse-workspace//TestCase_01//test-output//emailable-report.html"); // Replace with the path to your report file

            // Create Multipart object to combine message body and attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentPart);

            // Set the content of the message
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }
}
