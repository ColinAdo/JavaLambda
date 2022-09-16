public class Main {
    public static void main(String[] args ) {
        // Printable obj = new Printable();
        //OtherPrint(obj);
        LambdaInterface obj = ()-> System.out.println("hello there");
        obj.print();

    }
    //this can be used by creating an object of class Printable and then pass the object as parameter
    static void OtherPrint(Printable thing){
        thing.print();
    }
}
