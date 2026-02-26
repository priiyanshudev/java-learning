public class Demo4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a<b) && (b<c);
        boolean e = (a<b) || (b<c);

        System.out.println(d + " " + e);

        // short circuiting
        boolean f = (a>b) && (b<c);
        System.out.println(f);
        
        // avoiding short circuiting
        boolean g = (a>b) & (b<c);
        System.out.println(g);
    }
}
