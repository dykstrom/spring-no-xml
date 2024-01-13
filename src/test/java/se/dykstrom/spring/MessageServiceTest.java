package se.dykstrom.spring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MessageServiceTest {

    private static final String MESSAGE = "message";

    private final MessageProvider messageProvider = mock(MessageProvider.class);

    private final MessageService messageService = new MessageService(messageProvider);

    @Test
    void shouldGetMessage() {
        // Given
        when(messageProvider.getMessage()).thenReturn(MESSAGE);

        // When
        String message = messageService.getMessage();

        // Then
        assertEquals(MESSAGE, message);
    }
}
