public class BmiService {
    public int calculate(double weightKg, double heightMeter) {
        double index = weightKg / heightMeter / heightMeter;
        return (int) index;
    }
}
