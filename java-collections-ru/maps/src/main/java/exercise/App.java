package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String text) {
        String[] words = text.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        if (text.equals("")) {
            return wordCount;
        }

        for (var word: words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        return wordCount;
    }

    public static String toString(Map map) {
        if (map.isEmpty()) {
            return "{}";
        }

        var result = "{";

        for (var key: map.keySet()) {
            result += "\n  " + key + ": " + map.get(key);
        }

        result += "\n}";

        return result;
    }
}
//END
