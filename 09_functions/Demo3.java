public class Demo3 {

    // chaining of functions


    public static void main(String[] args) {
        fun1(0);
        System.out.println("bye");
    }

    static void fun1(int n) {
        fun2();
        System.out.println("Hi");
    }

    static void fun2(){
        fun3();
        System.out.println("Hello");
    }

    static void fun3(){
        System.out.println("How are you");
    }
}
