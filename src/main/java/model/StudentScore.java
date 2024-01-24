package model;

public class StudentScore {

    private Student student;
    private Asignature asignature;
    private double score;

    public StudentScore() {
    }

    public StudentScore(Student student, Asignature asignature, double score) {
        this.student = student;
        this.asignature = asignature;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Asignature getAsignature() {
        return asignature;
    }

    public void setAsignature(Asignature asignature) {
        this.asignature = asignature;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
