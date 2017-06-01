package se.dykstrom.spring;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
class MessageService {

    private final MessageProvider messageProvider;

    @Inject
    public MessageService(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    String getMessage() {
        return messageProvider.getMessage();
    }
}
