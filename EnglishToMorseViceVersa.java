package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EnglishToMorseViceVersa {

    private static final String[] english = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?", "!", ":", "@", "=", "-", "+", "\"", "/", "&",
            "'", "(", ")"
    };

    private static final String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", "-.-.--", "---...", ".--.-.",
            "-...-", "-....-", ".-.-.", ".-..-.", "-..-.", ".-...", ".----.",
            "-.--.", "-.--.-"
    };

    private static final Map<String, String> EN_TO_MORSE = new HashMap<>();
    private static final Map<String, String> MORSE_TO_EN = new HashMap<>();

    static {
        for (int i = 0; i < english.length; i++) {
            EN_TO_MORSE.put(english[i], morse[i]);
            MORSE_TO_EN.put(morse[i], english[i]);
        }
    }

    public static void main(String[] args) {

        String output;

        output = run(false, "Hello, World!");
        System.out.println(output); // .... . .-.. .-.. --- --..-- / .-- --- .-. .-.. -.. -.-.--

        output = run(true, ".... . .-.. .-.. --- --..-- / .-- --- .-. .-.. -.. -.-.--");
        System.out.println(output); // hello, world!
    }


    public static String run(boolean morseToEnglish, String textToTranslate) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        if (textToTranslate == null || textToTranslate.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        String wordSplitter, wordJoiner, charSplitter, charJoiner;
        Map<String, String> mapper;

        if (morseToEnglish) {
            wordSplitter = " / ";
            wordJoiner = " ";
            charJoiner = "";
            charSplitter = " ";
            mapper = MORSE_TO_EN;
        } else {
            wordSplitter = " ";
            wordJoiner = " / ";
            charJoiner = " ";
            charSplitter = "";
            mapper = EN_TO_MORSE;
        }

        return Arrays.stream(textToTranslate.trim().toLowerCase().split(wordSplitter))
                .map(word -> createWord(word, charJoiner, charSplitter, mapper))
                .collect(Collectors.joining(wordJoiner));

    }

    private static String createWord(String word, String joiner, String splitter, Map<String, String> mapper) {
        return Arrays.stream(word.split(splitter)).map(mapper::get).collect(Collectors.joining(joiner));
    }
}
