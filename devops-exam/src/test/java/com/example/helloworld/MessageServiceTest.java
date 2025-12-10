package com.example.helloworld;

import com.example.helloworld.service.MessageService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageServiceTest {

    @Test
    void testDefaultMessage() {
        MessageService service = new MessageService();
        assertThat(service.getMessage()).isEqualTo("Hello World!");
    }
}
