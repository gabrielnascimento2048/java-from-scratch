package Java;

public class MainCasting {
    public static void main(String[] args) {

        //Widening casting  (automatically) byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble);

        //Narrowing casting must be done manually by placing the type in parentheses in front of the value
        double myOtherDouble = 3.1416f;
        int myOtherInt = (int) myOtherDouble;
        System.out.println("Original value: " + myOtherDouble); //3.1415998935699463
        System.out.println("Casting value to int: " + myOtherInt); //3

    }
}
