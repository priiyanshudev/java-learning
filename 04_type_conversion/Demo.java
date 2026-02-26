public class Demo {
    public static void main(String[] args){
        
        // implicit conversion
        // byte -> int 
        byte b = 24;
        int i = b;

        System.out.println(i); // 24

        // character to int

        char c = 'a';
        int i2 = c;

        System.out.println(i2); // 97


        // explicit conversion
        // int to byte

        int i3 = 300;
        byte b2;
        b2 = (byte) i3;

        System.out.println(b2); // 24
        // 
        System.out.println(300 % 256); // 44;


        // truncating conversion

        float f = 15.678f;

        int i4;
        i4 = (int) f;


        // boolean to any data type is not possible in java


        // automatic type promotion in expressions

        byte b3 = 50;
        // b3 = b3 * 2; // error because b3 * 2 is int and cannot be assigned to byte without explicit casting


        byte b4 = 50;
        b4 = (byte)(b4 * 2);
        System.out.println(b4); // 100
    }


}
