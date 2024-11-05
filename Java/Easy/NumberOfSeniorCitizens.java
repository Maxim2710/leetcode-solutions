package Easy;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int cntSeniors = 0;

        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));

            if (age > 60) {
                cntSeniors++;
            }
        }

        return cntSeniors;
    }
}
