package Easy;

public class KeyGenerator {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int d1 = str1.charAt(i) - '0';
            int d2 = str2.charAt(i) - '0';
            int d3 = str3.charAt(i) - '0';

            sb.append(Math.min(d1,Math.min(d2,d3)));
        }

        return Integer.parseInt(sb.toString());
    }
}
