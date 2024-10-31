package Easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int leftEndPoint = 0;
        int rightEndPoint = s.length - 1;

        while (leftEndPoint < rightEndPoint) {
            char curEl = s[leftEndPoint];
            s[leftEndPoint] = s[rightEndPoint];
            s[rightEndPoint] = curEl;

            leftEndPoint++;
            rightEndPoint--;
        }
    }
}
