public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        s1.rollNo = 101;
        s1.college = "ABC University";

        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Roll No: " + s1.rollNo);
        System.out.println("Student College: " + s1.college);

        int x = 3; // local variable
    }
}


class Student{
    String name; // instance variable
    int age;
    int rollNo;
    String college;

    void markAttendance(){
        System.out.println("attendance marked for student"+ name);
    }
}