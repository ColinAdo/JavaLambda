package adding;

public class Main {
    public static void main(String[] args) {
        AdditionInterface sum = Integer::sum;
        System.out.println(sum.addition(2,7));
    }
}
