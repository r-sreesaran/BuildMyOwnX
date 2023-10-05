package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class WordProcessorTest {

    @Test
    void processcommand() throws URISyntaxException, IOException {
        WordProcessor processor = new WordProcessor();
        String[] options =   processor.processCommand("cwcc -l test.txt");
        assertEquals(options[1],"-l");
        System.out.println(options[2]);
        System.out.println(processor.getTotalSpace(processor.readFile(options[2])));

    }
}