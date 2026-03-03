public class Demo2 {
    public static void main(String[] args) {
        // function overloading

        int x = sum(2,3);
        System.out.println("The sum is: " + x);

        int y = sum(4,3);
        System.out.println("The sum is: " + y);

        int z = sum(4,3,5);
        System.out.println("The sum is: " + z);

    }
    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c){ // different number of parameters
        return (a + b + c);
    }


    // another example of function overloading

    static int sum(double a, double b) { // different data type of parameters
        return (int)(a + b);
    }

    static void greet(String name, int age){
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    static void greet(int age,String name){ // different order of parameters
        System.out.println("Hello " + name);
    }
}
