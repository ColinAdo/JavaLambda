package statemens;

public class Main {
    public static void main(String[] args) {
        Interfaces string = (apart)->{
            String str1 = "I just wanna tell you";
            String str2 = str1 + apart;
            return str2;
        };
        System.out.println(string.message(" I love you!"));
    }
}
