package se.dykstrom.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

    String getMessage() {
        return "Hello, world!";
    }
}
