package Easy;

import java.util.HashSet;

public class MorseCodeTransformations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        HashSet<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                sb.append(morseCode[c - 'a']);
            }

            transformations.add(sb.toString());
        }

        return transformations.size();
    }
}
