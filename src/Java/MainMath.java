package Java;

public class MainMath {
    public static void main(String[] args) {
        System.out.println(Math.max(5,10)); //method can be used to find the highest value of x and y

        System.out.println(Math.min(5,10)); //method can be used to find the lowest value of x and y

        System.out.println(Math.sqrt(9)); //method returns the square root of x

        System.out.println(Math.abs(-3.14159)); //method returns the absolute (positive) value of x

        System.out.println(Math.random()  + " returns a random number between 0.0 (inclusive), and 1.0 (exclusive)"); //returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
    int randomNum = (int) (Math.random() *101);
        System.out.println("Random number 0 to 100: " + randomNum + " with int value");

    }
}
