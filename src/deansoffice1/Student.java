package deansoffice1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int indexCounter = 1;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDate birthdate;
    private String indexNumber;
    private String status;
    private Program program;
    private int currentSemester;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.indexNumber = "s" + indexCounter++;
        this.status = "Candidate";
        this.grades = new ArrayList<>();
    }

    public void enrollInProgram(Program program) {
        this.program = program;
        this.currentSemester = 1;
        this.status = "Student";
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void promoteToNextSemester() {
        if (currentSemester < program.getTotalSemesters() && !exceedsAllowedITNs()) {
            currentSemester++;
        } else {
            status = "Graduate";
        }
    }

    private boolean exceedsAllowedITNs() {
        long itnCount = grades.stream().filter(g -> g.getGradeValue() < 3).count();
        return itnCount > program.getMaxAllowedITNs();
    }

    @Override
    public String toString() {
        return String.format("Student: %s %s, Index: %s, Semester: %d, Status: %s", firstName, lastName, indexNumber, currentSemester, status);
    }
}
