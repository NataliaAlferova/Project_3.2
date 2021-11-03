public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate (55, 1.68);
        System.out.println(bmi);}

}
