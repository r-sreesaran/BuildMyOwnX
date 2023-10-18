package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordProcessorTest {

    /**
     * Design document for the current challenge
     * -l returns the number of lines in the file
     * -w returns the number of words in the file
     * -c returns the number of bytes in the file
     * -m returns the number of characters in the file
     * if no option is specified return the values of -c -l -w
     */


    @Test
    void testTotalNoOfLines() throws IOException {
        WordProcessor processor = new WordProcessor();
        processor.operation("cwcc -l test.txt");
        String[] options =   processor.processCommand("cwcc -l test.txt");
        assertEquals(options[1],"-l");
        assertEquals(7093,processor.getWordprocessorbean().getNo_of_lines());
    }

    @Test
    void testTotalNoOfCharacters() throws IOException {
        WordProcessor processor = new WordProcessor();
        processor.operation("cwcc -m test.txt");
        assertEquals(331043,processor.getWordprocessorbean().getTotal_no_of_characters());
    }

    @Test
    void testTotalNoOfWords() throws IOException {
        WordProcessor processor = new WordProcessor();
        processor.operation("cwcc -w test.txt");
        assertEquals(57983,processor.getWordprocessorbean().getTotal_no_of_words());
    }

    @Test
    void testPipedOperation() throws IOException {
        WordProcessor processor = new WordProcessor();
        processor.operation("cat test.txt | ccwc -l");
        assertEquals(7093,processor.getWordprocessorbean().getNo_of_lines());

    }

    @Test
    void testDefaultOperations() throws IOException {
        WordProcessor processor = new WordProcessor();
        processor.operation("cat test.txt");
        assertEquals(333938,processor.getWordprocessorbean().getFile_size());
        assertEquals(7093,processor.getWordprocessorbean().getNo_of_lines());
        assertEquals(57983,processor.getWordprocessorbean().getTotal_no_of_words());


    }

}