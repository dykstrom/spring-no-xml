package se.dykstrom.spring;

import javax.annotation.Resource;

@Resource
public class MessageProvider {

    String getMessage() {
        return "Hello, world!";
    }
}
