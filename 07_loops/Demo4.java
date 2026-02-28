public class Demo4 {
    public static void main(String[] args) {
        
        // break

        for(int i=1; i<= 10; i++){
            System.out.println(i);

            if(i > 5){
                break;
            }
        }

        // continue

        for(int i=1; i<=10; i++){
            if(i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }


        // labels

        outer: for (int i=1; i<=10; i++){
            inner: for(int j=1; j<=i; j++){
                System.out.print("*");

                if(j>=5){
                    break outer;
                }
            }
            System.out.println();
     
        }

// code block
        first: {
            second: {
                third: {

                }
            }
        }



    }
}
