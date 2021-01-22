package pl.javastart.webPageDemoAndEmailsSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThymeleafdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafdemoApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(ThymeleafdemoApplication.class, args);
//        MailService mailService = context.getBean(MailService.class);
    }

}
