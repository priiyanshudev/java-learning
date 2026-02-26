public class Demo2 {
    public static void main(String[] args) {
        // switch statements

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


        // nested switch statements

        int month = 2;
        int year = 2020;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                switch (year % 4) {
                    case 0:
                        System.out.println("29 days");
                        break;
                    default:
                        System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
