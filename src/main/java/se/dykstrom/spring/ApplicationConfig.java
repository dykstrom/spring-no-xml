package se.dykstrom.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public MessageProvider messageProvider() {
        return new MessageProvider();
    }
}
