package Easy;

public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}
