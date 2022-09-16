package parameter;

public class Main {
    public static void main(String[] args) {
        Lambdas obj = (username,age) -> "Hello there "+username+" you are "+age+" years old";
        System.out.println(obj.name("Colin",20));
    }
}
