package model;

import java.util.List;

public class Course {
    private String name;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    private List<Person> people;

    public String getName() {
        return name;
    }

    public Course() {
    }

    public Course(String name, List<Person> people) {
        this.name = name;
        this.people = people;
    }

    public void setName(String name) {
        this.name = name;
    }
}
