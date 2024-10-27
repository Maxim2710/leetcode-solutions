package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        return s.length();
    }

    private static List<String> cleanArray(String[] arr) {
        List<String> resultArr = new ArrayList<>();
        for (String el : arr) {
            if (Objects.equals(el, "")) {
            } else {
                resultArr.add(el);
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] remakeLine = line.split(" ");

        List<String> arrayWithLines = cleanArray(remakeLine);

        String currentWord = arrayWithLines.get(arrayWithLines.size() - 1);

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        int resultSize = lengthOfLastWord.lengthOfLastWord(currentWord);

        System.out.println(resultSize);

        String par = "    fly me   to   the moon".trim();
        System.out.println(par);
    }
}
