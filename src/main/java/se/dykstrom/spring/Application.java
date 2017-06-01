package se.dykstrom.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
class Application {

    private final MessageService messageService;

    @Inject
    public Application(MessageService messageService) {
        this.messageService = messageService;
    }

    private void run() {
        System.out.println("Greeting: " + messageService.getMessage());
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("se.dykstrom.spring");
        context.refresh();
        Application application = context.getBean(Application.class);
        application.run();
    }
}
