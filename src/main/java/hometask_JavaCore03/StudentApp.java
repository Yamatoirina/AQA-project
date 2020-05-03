package hometask_JavaCore03;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
    public static void main(String[] args) {
        Student stud1 = new Student("Nikita", 3);
        Student stud2 = new Student("Elena", 5);
        Student stud3 = new Student("Artem", 6);


        ArrayList<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        System.out.println("list of students: ");
        for (Student person : students) {
            System.out.println(person.toString());
        }

        Collections.sort(students, new Student());
        System.out.println("\n list of students by rating: ");
        for (Student person : students) {
            System.out.println(person);
        }


        stud2.changerating(2);
        Collections.sort(students, new Student());
        System.out.println("\n list of students by changed rating: ");
        for (Student person : students) {
            System.out.println(person);
        }

    }
}
