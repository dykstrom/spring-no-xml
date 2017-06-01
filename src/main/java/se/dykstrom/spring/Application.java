package se.dykstrom.spring;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext("se.dykstrom.spring");
        Application application = context.getBean(Application.class);
        application.run();
    }
}
