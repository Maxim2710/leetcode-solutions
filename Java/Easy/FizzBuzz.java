package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzArray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzArray.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzArray.add("Buzz");
            } else {
                fizzBuzzArray.add(String.valueOf(i));
            }
        }

        return fizzBuzzArray;
    }
}
