public class Demo4 {

    static int x = 78; // global scope
    public static void main(String[] args) {
        // scope of a variable

        int x = 4; // local scope of x is only within the main method
        int y = 5;

        System.out.println(x + " , " + y);

        fun();
    }

    static void fun(){
        // System.out.println(x + " , " + y); // error because x and y are not in scope here
    }
}
