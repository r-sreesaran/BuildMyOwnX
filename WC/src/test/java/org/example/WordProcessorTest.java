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

    @Test
    void testTotalNoOfLines() throws URISyntaxException,IOException {
        WordProcessor processor = new WordProcessor();
        String[] options =   processor.processCommand("cwcc -w test.txt");
        assertEquals(options[1],"-w");
        System.out.println(options[2]);
        System.out.println(processor.getNumberofWordsAndLines(processor.readFile(options[2]))[0]);
        System.out.println(processor.getNumberofWordsAndLines(processor.readFile(options[2]))[1]);
    }

    @Test
    void testTotalNoOfCharacters() throws URISyntaxException,IOException {
        WordProcessor processor = new WordProcessor();
        String[] options =   processor.processCommand("cwcc -w test1.txt");
        assertEquals(options[1],"-w");
        System.out.println(options[2]);
        System.out.println(processor.getNumberofWordsAndLines(processor.readFile(options[2]))[1]);
    }



}