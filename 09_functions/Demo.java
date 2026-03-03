public class Demo {

    public static void main(String[] args) {
        greet();

        sayHello("Priyanshu");

        int num = getNumber();
        System.out.println("The number is: " + num);

        int product = multiply(5, 3);
        System.out.println("The product is: " + product);
    }

    // no input, no output

    static void greet(){
        System.out.println("Hello");
        return; // optional
    }

    // input, no output

    static void sayHello(String name){
        System.out.println("hello " + name);
    }

    // no input, output

    static int getNumber(){
        return 10;
    }

    // input, output

    static int multiply(int a, int b){
        int result = a*b;
        return result;
    }
}
