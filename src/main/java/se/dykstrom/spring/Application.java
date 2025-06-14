package se.dykstrom.spring;

import javax.inject.Inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Application {

    private final MessageService messageService;

    @Inject
    public Application(final MessageService messageService) {
        this.messageService = messageService;
    }

    @SuppressWarnings("java:S106")
    private void run() {
        System.out.println("Greeting: " + messageService.getMessage());
    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext("se.dykstrom.spring")) {
            context.getBean(Application.class).run();
        }
    }
}
