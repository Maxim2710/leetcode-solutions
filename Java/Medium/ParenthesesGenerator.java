package Medium;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    private void generate(List<String> result, String current, int open, int close) {

        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        if (open > 0) {
            generate(result, current + "(", open - 1, close);
        }


        if (close > open) {
            generate(result, current + ")", open, close - 1);
        }
    }
}
