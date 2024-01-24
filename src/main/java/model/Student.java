package model;

public class Student extends Person{
    public Student(String name, String identity, double initialScore) {
        super(name, identity);
        this.initialScore = initialScore;
    }

    public double getInitialScore() {
        return initialScore;
    }

    private double initialScore;


    public void setInitialScore(double initialScore) {
        this.initialScore = initialScore;
    }
}
