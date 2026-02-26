public class Demo{
    public static void main(String[] args){
        // Integers

        byte b = 5;

        short s = 10;

        int i = 18882;

        long l = 1828488;

        long l2 = 123_456_789L; // using underscores for readability

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Long (with underscores): " + l2);

        // Floating-point numbers

        float f = 2.28f;

        double d = 3.14159;

        double d2 = 6.022e23; // scientific notation

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Double (scientific notation): " + d2);

        // characters

        char c = 'A';

        System.out.println("Char: " + c);

        // Booleans

        boolean bool = true;

        System.out.println("Boolean: " + bool);




        // how to store a binary number in java

        byte binaryNum = 0b101;
        System.out.println("Binary number (0b101): " + binaryNum);


        // how to store a octal number in java

        byte octalNum = 0123;
        System.out.println("Octal number (0123): " + octalNum);

        // how to store a hexadecimal number in java

        byte hexNum = 0x1A;
        System.out.println("Hexadecimal number (0x1A): " + hexNum);
    }   
}