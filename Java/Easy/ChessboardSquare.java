package Easy;

public class ChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0);
        int row = coordinates.charAt(1);

        int colValue = col - 'a' + 1;
        int rowValue = row - '0';

        return (colValue + rowValue) % 2 != 0;
    }
}
