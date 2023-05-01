package com.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lab9_8 {
    
    public static void main(String[] args) {
        String text = "Some text with different sentences. Some sentences are longer than others. Not all sentences have common words.";
        List<String> sentences = getSentences(text);
        List<String> result = removeSentences(sentences);
        System.out.println(result);
    }
    
    /*Метод разбивающий текст на предложения и возвращающий список предложений*/
    private static List<String> getSentences(String text) {
        List<String> sentences = new ArrayList<>();
        String[] words = text.split("(?<=[.!?])\\s*");
        for (String word : words) {
            sentences.add(word.trim());
        }
        return sentences;
    }
    
    /* Метод, вычеркивающий минимальное количество предложений
     так, чтобы у любых двух оставшихся предложений было хотя бы одно общее слово*/
    private static List<String> removeSentences(List<String> sentences) {
        List<String> result = new ArrayList<>();
        while (!sentences.isEmpty()) {
            result.add(sentences.remove(0));
            Set<String> uniqueWords = getUniqueWords(result);
            boolean found = false;
            for (String sentence : sentences) {
                Set<String> sentenceWords = getWords(sentence);
                if (!sentenceWords.isEmpty() && uniqueWords.stream().anyMatch(sentenceWords::contains)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.remove(result.size() - 1);
            }
        }
        return result;
    }

    /*Метод, возвращающий уникальные слова из списка предложений*/
    private static Set<String> getUniqueWords(List<String> sentences) {
        Set<String> words = new HashSet<>();
        for (String sentence : sentences) {
            words.addAll(getWords(sentence));
        }
        return words;
    }
    
    /* Метод, возвращающий список слов из предложения */
    private static Set<String> getWords(String sentence) {
        Set<String> words = new HashSet<>();
        String[] array = sentence.split("\\W+");
        for (String word : array) {
            words.add(word.toLowerCase());
        }
        return words;
    }
}
