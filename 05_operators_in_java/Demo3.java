public class Demo3 {
    public static void main(String[] args) {
        

        // bitwise operators

        int a = 2;
        int b = 3;

        int c = a & b; // 2
        int d = a | b; // 3
        int e = a ^ b; // 1
        int f = ~a; // -3

        System.out.println(c + " " + d + " " + e + " " + f);

        // shift operations

        int g = 1;
        g = g << 33;

        byte h = 1;
        h = (byte)(h << 1);
        System.out.println(g); // 2
    }
}
