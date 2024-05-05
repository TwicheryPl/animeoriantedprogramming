package deansoffice1;

public class Grade {
    private int gradeValue;
    private String subject;

    public Grade(int gradeValue, String subject) {
        this.gradeValue = gradeValue;
        this.subject = subject;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public String getSubject() {
        return subject;
    }
}
