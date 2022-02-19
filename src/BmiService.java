public class BmiService {
    public int calculate (int mass, int height){
        return mass / ((height/100)^2);
    }
}
