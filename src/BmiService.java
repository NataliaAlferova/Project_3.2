public class BmiService {
    public double calculate (double weight, double height){
        // вес в кг, рост в м
        int bmi = (int) (weight / height / height);
        return bmi;
    }
}
