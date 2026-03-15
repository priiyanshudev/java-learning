public class Demo3 {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        // Student s2 = new Student("John");

        // Student s3 = new Student("John", 20);

        // Student s4 = new Student("John", 20, 101);

        // Student s5 = new Student("John", 20, 101, "ABC College");

        // System.out.println(s3.college);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

    }
}


class Student{
    String name;
    int age;
    int rollNum;
    String college;

    Student(){}

    Student(String name){
        this(name, 0);
        System.out.println("im in first constructor");
    }

    Student(String name, int age){
        this(name, age, 0);
        System.out.println("im in second constructor");
    }

    Student(String name, int age, int rollNum){
        this(name, age, rollNum, null);
        System.out.println("im in third constructor");
    }

    Student(String name, int age, int rollNum, String college){
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
        System.out.println("im in fourth constructor");
    }
}