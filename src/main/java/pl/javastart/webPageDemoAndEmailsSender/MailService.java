package pl.javastart.webPageDemoAndEmailsSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    //private static final Logger logger = LoggerFactory.getLogger(MailService.class);
    private JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String sender, String recipient, String title, String content) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(sender);
        mail.setTo(recipient);
        mail.setSubject(title);
        mail.setText(content);
        mailSender.send(mail);
    }

    public void sendMailConfirmationToGuest(String sender, String recipient, String name) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(sender);
        mail.setTo(recipient);
        mail.setSubject("Twoja wiadomość wysłana z portalu została dostarczona");
        mail.setText("Szanowny Pani/Panie " + name + ",\n\n informujemy, że wiadomośc została dostarczona.\n Odezwiemy się wkrótce");
        mailSender.send(mail);
    }
}
