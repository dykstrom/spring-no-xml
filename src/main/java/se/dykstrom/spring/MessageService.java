package se.dykstrom.spring;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
class MessageService {

    private final MessageProvider messageProvider;

    @Inject
    public MessageService(final MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    String getMessage() {
        return messageProvider.getMessage();
    }
}
