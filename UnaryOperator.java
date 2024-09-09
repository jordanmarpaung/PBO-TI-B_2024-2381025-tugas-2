public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y =-5;
        boolean isTrue = true;
        //Increment
        System.out.println("x awal: "  + x);
        System.out.println("++x: " + ++x); // pre- increment
        System.out.println("x++: " + x++);// post- increment
        System.out.println("x akhir: "+ x);
        //decrement
        System.out.println("x awal: " + x);
        System.out.println(" ++x: " + --x); // Pre decrement
        System.out.println(" x++: " + x--); // Post decrement
        System.out.println("x akhir: " + x);

        // Unaryplus dan minus
        System.out.println("+x : " + x);
        System.out.println("-y : " + -y);

        // logical Not
        System.out.println("!isTrue : " + !isTrue);
    }
}
