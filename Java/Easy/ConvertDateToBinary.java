package Easy;

public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] dateParts = date.split("-");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        String binYear = Integer.toBinaryString(year);
        String binMonth = Integer.toBinaryString(month);
        String binDay = Integer.toBinaryString(day);

        return binYear + "-" + binMonth + "-" + binDay;
    }
}
