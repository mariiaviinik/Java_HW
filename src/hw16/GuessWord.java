package hw16;

import java.util.*;

public class GuessWord {
    static StringBuilder alreadyGuessed = new StringBuilder("###############");

    static String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
    };

    public static void main(String[] args) {

        String wordToGuess = words[new Random().nextInt(words.length)];
//        System.out.println(wordToGuess);

        while (true) {
            System.out.println("Guess a word:");
            Scanner scanner = new Scanner(System.in);
            String userWord = scanner.nextLine().toLowerCase();

            if (wordToGuess.equals(userWord)) {
                System.out.println(userWord + "!!! Congratulations!!! You guessed!!!");
                break;
            } else {
                StringBuilder result = showGuessedLetters(wordToGuess, userWord);
                System.out.println(result);
            }
        }
    }

    static public StringBuilder showGuessedLetters(String wordToGuess, String userWord) {
        int smallerLength = wordToGuess.length() > userWord.length() ? userWord.length() : wordToGuess.length();

        for (int i = 0; i < smallerLength; i++) {
            if (wordToGuess.charAt(i) == userWord.charAt(i)) {
                if (alreadyGuessed.charAt(i) == '#') {
                    alreadyGuessed.replace(i, i + 1, String.valueOf(userWord.charAt(i)));
                }
            }
        }

        return alreadyGuessed;
    }
}
