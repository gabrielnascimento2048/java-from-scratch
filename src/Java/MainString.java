package Java;

public class MainString {
    public static void main(String[] args) {
        System.out.println("Java String reference for new methods: https://www.w3schools.com/java/java_ref_string.asp");

        String greeting = "Hello";
        System.out.println(greeting);
        System.out.println(greeting.toUpperCase() + ": UpperCase mode");
        System.out.println(greeting.toLowerCase() + ": LowerCase mode");


        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The Length of txt is: " + txt.length() + " using length method by String object");
        System.out.println("The lower case of txt is: " + txt.toLowerCase() + " using LowerCase method by String object");

        String sentence = " I will be more stronger than I was, and also be smarter than I was";
        System.out.println(sentence.indexOf("was"));
        System.out.println(sentence.indexOf("will"));
        System.out.println("Using the isEmpty method: " + sentence.isEmpty());

        //Concatenation
        System.out.println("==============String Concatenation=============");
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + "" + lastName  + " I did concatenation with just plus + ");
        System.out.println(firstName.concat(lastName) + " I did concatenation with concat method");

        //Adding Numbers and Strings
        System.out.println("==============String & Numbers=============");

        int a = 12;
        int b = 15;
        int c = a+b;

        System.out.println("Numbers: " + c);

        String d = "12";
        String e = "15";
        String f = d+e;

        System.out.println("String: " + f);

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println("Concatenation between string and int: " + z);


        System.out.println("==============Special Characters=============");

        String txt1 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt1);

        String txt2 = "It\'s alright.";
        System.out.println(txt2);

        String txt3 = "The character \\ is called backslash.";
        System.out.println(txt3);



    }
}
