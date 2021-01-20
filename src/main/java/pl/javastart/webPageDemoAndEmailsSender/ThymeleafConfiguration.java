package pl.javastart.webPageDemoAndEmailsSender;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.SpringTemplateEngine;

public class ThymeleafConfiguration {
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
