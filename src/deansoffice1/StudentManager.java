package deansoffice1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static List<Student> students = new ArrayList<>();

    public static void registerStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
