public class Demo {
    public static void main(String[] args){
        //  arithmetic operators

        // + - * / %
        // += -=  *=  /=  %=
        // ++ --

        int a = 5;
        int b = 10;

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println(c + ", " + d + ", " + e + ", " + f + ", " + g);

        int h = a + 2;
        h = h + 2; 
        h += 2; // h = h + 2
        h -= 2; // h = h - 2
        h *= 2; // h = h * 2
        h /= 2; // h = h / 2
        h %= 2; // h = h % 2
        System.out.println(h);

        int i = 6;
        i++; // i = i + 1
        i--; // i = i - 1
        System.out.println(i);

        int j = 7;
        j++; // postfix increment
        System.out.println(j); // 8
        
        int k = 7;
        ++k; // prefix increment
        System.out.println(k); // 8


        
    }
}
