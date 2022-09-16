package iteration;
import java.util.*;
public class People {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<String>();
        persons.add("Colin");
        persons.add("Titus");
        persons.add("John");
        persons.add("Timo");
        persons.forEach(
                System.out::println
        );
    }
}
