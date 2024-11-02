package Easy;

public class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] tempArr = new double[2];

        tempArr[0] = celsius + 273.15;
        tempArr[1] = celsius * 1.80 + 32.00;

        return tempArr;
    }
}
