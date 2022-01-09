import Models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main3 {

    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "Enes");
        Student s2 = new Student(109, "Dilara");
        Student s3 = new Student(105, "Zafer");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);

        Collections.sort(students);

    }
}
