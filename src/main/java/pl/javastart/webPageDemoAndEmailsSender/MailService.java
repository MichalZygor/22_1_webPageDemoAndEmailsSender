package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private final JavaMailSender mailSender;
    private static final String MAIL_CONFIRMATION_SUBJECT = "Twoja wiadomość wysłana z portalu została dostarczona";
    private static final String MAIL_CONFIRMATION_BODY_TEXT = "Szanowny Pani/Panie %s,\n\n informujemy, "
            + "że wiadomośc została dostarczona.\n Prosimy o cierpliwość, odezwiemy się wkrótce. \n\n Zespół VAZZA!";
    private static final String MAIL_COMPANY = "test_javascript@ovo.slask.pl";
    private static final String MAIL_SUBJECT = "Wiadomość z formularza kontaktowego od %s.";


    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(ContactPerson contactPerson) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(contactPerson.getEmail());
        mail.setTo(MAIL_COMPANY);
        mail.setSubject(String.format(MAIL_SUBJECT, contactPerson.getName()));
        mail.setText(contactPerson.getMessage());
        mailSender.send(mail);
    }

    public void sendMailConfirmationToGuest(ContactPerson contactPerson) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(MAIL_COMPANY);
        mail.setTo(contactPerson.getEmail());
        mail.setSubject(MAIL_CONFIRMATION_SUBJECT);
        mail.setText(String.format(MAIL_CONFIRMATION_BODY_TEXT, contactPerson.getName()));
        mailSender.send(mail);
    }
}

