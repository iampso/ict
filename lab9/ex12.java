package com.test;

public class lab9_12 {
    public static void main(String[] args) {
        String[] sentences = {"Одевать одежду - это важно.", "Симпотично выглядеть - это приятно.",
                "Извените, что не написал раньше.", "Я сдесь уже час.",
                "Девченка пробежала мимо меня.", "Чтоли, уже пора домой?",
                "Врядли он придет сегодня.", "Чутьли я тебя не узнал?"};

        String[] correctedSentences = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            correctedSentences[i] = sentences[i].replaceAll("\\bОдевать\\b", "Надевать")
                    .replaceAll("\\bСимпотично\\b", "Симпатично")
                    .replaceAll("\\bИзвените\\b", "Извините")
                    .replaceAll("\\bсдесь\\b", "здесь")
                    .replaceAll("\\bДевченка\\b", "Девочка")
                    .replaceAll("\\bЧтоли\\b", "Что ли")
                    .replaceAll("\\bВрядли\\b", "Вряд ли")
                    .replaceAll("\\bЧутьли\\b", "Чуть ли");

            System.out.println(sentences[i]);
            System.out.println(correctedSentences[i]);
        }
    }
}
