package Java;

public class MainNumbers {
    public static void main(String[] args) {

        /*
        Data types are divided into two groups:
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes
         */


        /*
        Numbers are divided in two groups
        Interger types -> int, byte, short and long
        Floating point types -> double and float usually represents numbers with a fractional part, containing one or more decimals.

        The most used for numbers are 'int' (for whole numbers) and double (for floating point numbers)
         */

        //Integer Types

        byte myNum = 100;
        System.out.println("Integer Types my number byte is: " + myNum);

        short myMum = 5000;
        System.out.println("Integer Types my number short is: " + myMum);

        int myNumInt = 100000;
        System.out.println("Integer Types my int number is: " + myNumInt);

        long myNumLong = 15000000547L;
        System.out.println("Integer Types my Long numer is: " + myNumLong);


        //Floating Types


        float myNumFloat = 3.99f;
        System.out.println("Floating Point Types myNumFloat is: " + myNumFloat); //six decimal digits

        double myNumDouble = 3.1416;
        System.out.println("Floating Point Types myNumDouble is: " + myNumDouble); //15 decimals digits


        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}
