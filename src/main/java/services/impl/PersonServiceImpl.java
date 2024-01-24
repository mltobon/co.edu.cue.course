package services.impl;

import model.Course;
import model.Person;
import model.Professor;
import model.Student;
import services.PersonService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private Course course;
    private List<Person> people;

    public PersonServiceImpl(Course course) {
        this.course = course;
        people = new ArrayList<Person>();
    }

    @Override
    public boolean addStudent(Student student) {

       people.add(student);
       course.setPeople(people);
       return true;
    }

    @Override
    public String addProfessor(Professor professor) {
        people.add(professor);
        course.setPeople(people);
        return "Profesor agregado exitosamente";
    }

    @Override
    public List<Person> listPeople() {
        return people;
    }
}
