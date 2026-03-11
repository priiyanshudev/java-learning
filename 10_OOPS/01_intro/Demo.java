public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();


        s1.name = "Alice";
        s1.age = 20;
        s1.rollNumber = 101;
        s1.college = "XYZ University";
    }
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println(name + " is present.");
    }

    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College: " + college);
    }
}


// java is almost complete object oriented programming language