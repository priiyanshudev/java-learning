public class Demo2 {
    public static void main(String[] args) {

        Student s1 = new Student("Priyanshu", 20, 101, "ABC College");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

        Student s2 = new Student();
    }
}


class Student{
    String name;
    int age;
    int rollNo;
    String college;

    // default constructor
    Student(){
        
    }

    // parameterized constructor
    Student(String n, int a, int r, String c){
        name = n;
        age = a;
        rollNo = r;
        college = c;
    }

}