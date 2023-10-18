package org.example;

public class WordProcessorBean {

    int  no_of_lines ;
    int total_no_of_words;
    int total_no_of_characters;
    long file_size;

    public int getNo_of_lines() {
        return no_of_lines;
    }

    public void setNo_of_lines(int no_of_lines) {
        this.no_of_lines = no_of_lines;
    }

    public int getTotal_no_of_words() {
        return total_no_of_words;
    }

    public void setTotal_no_of_words(int total_no_of_words) {
        this.total_no_of_words = total_no_of_words;
    }

    public int getTotal_no_of_characters() {
        return total_no_of_characters;
    }

    public void setTotal_no_of_characters(int total_no_of_characters) {
        this.total_no_of_characters = total_no_of_characters;
    }

    public long getFile_size() {
        return file_size;
    }

    public void setFile_size(long file_size) {
        this.file_size = file_size;
    }


}
