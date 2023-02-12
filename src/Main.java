public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 49;
        double heightMeter = 1.69;
        int index = service.calculate(weightKg, heightMeter);
        System.out.println("Ваш индекс массы тела " + index);
    }

}