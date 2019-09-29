package task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Task01 {
    public static void main(String[] args) {

        Word word1 = new Word("Мама");
        Word word2 = new Word("мыла");
        Word word3 = new Word("раму");
        Word word4 = new Word("Рама");
        Word word5 = new Word("сопротивлялась");
        Word word6 = new Word("маме");
        Word word7 = new Word("А");
        Word word8 = new Word("что");
        Word word9 = new Word("делать-то");
        Word word10 = new Word("теперь");
        Word word11 = new Word("дочке");

        Sentence sentence1 = new Sentence(word1, word2, word3);
        Sentence sentence2 = new Sentence (word4, word5,  word6);
        Sentence sentence3 = new Sentence (word7, word8, word9, word10, word11);

        Text text = new Text("Про маму.", sentence1, sentence2, sentence3);

        System.out.println(text.getTitle());
        printText(text);

        Word word12 = new Word("Ронять");
        Word word13 = new Word("мишку");
        Word word14 = new Word("на");
        Word word15 = new Word("пол");

        Sentence sentence4 = new Sentence(word12, word13, word14, word15);
        text.add(sentence4);

        printText(text);
    }

    static void printText(Text text) {

        for (Sentence s : text.getValue()) {
                System.out.print(s);
            }

        System.out.println();
    }
}