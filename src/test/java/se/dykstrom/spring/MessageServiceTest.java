package se.dykstrom.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {

    private static final String MESSAGE = "message";

    @Mock
    private MessageProvider messageProvider;

    @InjectMocks
    private MessageService messageService;

    @Test
    public void shouldGetMessage() {
        // Given
        when(messageProvider.getMessage()).thenReturn(MESSAGE);

        // When
        String message = messageService.getMessage();

        // Then
        assertEquals(MESSAGE, message);
    }
}
