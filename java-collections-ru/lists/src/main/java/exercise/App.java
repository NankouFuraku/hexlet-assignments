package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String scrabbleLetters, String scrabbleWord) {
        var anyCaseWord = scrabbleWord.toLowerCase();
        char[] wordArray = anyCaseWord.toCharArray();
        char[] letters = scrabbleLetters.toCharArray();

        List<Character> lettersList = new ArrayList<>();
        for (var letter: letters) {
            lettersList.add(letter);
        }

        for (var word: wordArray) {
            if (lettersList.contains(word)) {
                lettersList.remove(Character.valueOf(word));
// lettersList.trimToSize();
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
