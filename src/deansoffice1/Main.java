package deansoffice1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", LocalDate.of(1980, 1, 1));
        Program itProgram = new Program("IT", "Information Technology Program", 7, 5);

        student1.enrollInProgram(itProgram);
        student1.addGrade(new Grade(5, "PGO"));
        student1.addGrade(new Grade(2, "APBD"));

        StudentManager.registerStudent(student1);

        StudentManager.promoteAllStudents();
        StudentManager.displayInfoAboutAllStudents();
    }
}
