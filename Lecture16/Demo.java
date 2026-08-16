package Lecture16;

// import college.Student;
// import school.Student;

// import college.*;
// import school.*;

//import packageName.className


public class Demo {
    public static void main(String[] args) {
        Lecture16.college.Student s1 = new Lecture16.college.Student();
        s1.print();

        Lecture16.school.Student s2 = new Lecture16.school.Student();
        s2.print();
    }
}
