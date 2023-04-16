package com.test;

public class lab9_9 {
    public static void main(String[] args) {
        String text = "Это текст с комментариями. Комментарий: это комментарий! Но это не комментарий. Это комментарий: второй комментарий! Все это комментарий: третий комментарий!";
        String regex = "(Комментарий|Это комментарий|Все это комментарий):.*?!";
        String result = text.replaceAll(regex, "");
        if (result.equals(text)) {
            System.out.println("Комментарии не найдены");
        } else {
            System.out.println(result);
        }
    }
}
