package hometask_JavaCore03;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int rating;


    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static boolean betterStudent(Student student1, Student student2) {

        if (student1.getRating() > student2.getRating()) {
            return true;
        } else return false;
    }

    public void changerating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compare(Student a, Student b) {
        return b.rating - a.rating;
    }
}



