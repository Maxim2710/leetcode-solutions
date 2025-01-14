package Easy;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {
    public int minTimeToType(String word) {
        int totalTime = 0;
        int currentSymbol = 'a';

        for (char c : word.toCharArray()) {
            int distance = Math.abs(currentSymbol - c);

            int minStepsAroundTheCircle = Math.min(distance, 26 - distance);

            totalTime += minStepsAroundTheCircle + 1;

            currentSymbol = c;
        }

        return totalTime;
    }
}
