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
        final var context = new AnnotationConfigApplicationContext("se.dykstrom.spring");
        final var application = context.getBean(Application.class);
        application.run();
    }
}
