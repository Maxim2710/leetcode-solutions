package Easy;

import java.util.List;

public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;

        for (String command : commands) {
            switch (command) {
                case "UP":
                    if (row > 0) row --;
                    break;

                case "DOWN":
                    if (row < n - 1) row++;
                    break;

                case "RIGHT":
                    if (col < n - 1) col++;
                    break;

                case "LEFT":
                    if (col > 0) col--;
                    break;

            }
        }

        return (row * n) + col;
    }
}
