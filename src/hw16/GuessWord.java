package hw16;

import java.util.*;

public class GuessWord {
    static List<Character> guessedLettersList = Arrays.asList(new Character[15]);

    static String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
    };

    public static void main(String[] args) {

        String wordToGuess = words[new Random().nextInt(words.length)];
        System.out.println(wordToGuess);

        while (true) {
            System.out.println("Guess a word:");
            Scanner scanner = new Scanner(System.in);
            String userWord = scanner.nextLine();

            if (wordToGuess.equals(userWord)) {
                System.out.println(userWord + "!!! Congratulations!!! You guessed!!!");
                break;
            } else {
                String guessedLetters = showGuessedLetters(wordToGuess, userWord);
                System.out.println(addingHashtags(guessedLetters));
            }
        }
    }

    static public String addingHashtags(String str) {
        int loopNumber = 15 - str.length();

        for (int i = 0; i < loopNumber; i++) {
            str = str + "#";
        }

        return str;
    }

    static public String showGuessedLetters(String wordToGuess, String userWord) {
        String result = "";

        int smallerLength = wordToGuess.length() > userWord.length() ? userWord.length() : wordToGuess.length();

        for (int i = 0; i < smallerLength; i++) {
            if (wordToGuess.charAt(i) == userWord.charAt(i)) {
                result = result + wordToGuess.charAt(i);
                guessedLettersList.set(i, userWord.charAt(i));
                continue;
            }
            if (guessedLettersList.get(i) != null && wordToGuess.charAt(i) == guessedLettersList.get(i)) {
                result = result + guessedLettersList.get(i);
                continue;
            }
            result = result + "#";
        }

        return result;
    }
}
