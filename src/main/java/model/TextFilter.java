package model;

public class TextFilter {
    public String removePunctuation(String text) {
        return text.replaceAll("[\\p{Punct}]", "");
    }
}