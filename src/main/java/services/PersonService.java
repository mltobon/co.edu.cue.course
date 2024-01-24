package services;

import model.Person;
import model.Professor;
import model.Student;

import java.util.List;

public interface PersonService {

    boolean addStudent(Student student);
    String addProfessor(Professor professor);
    List<Person> listPeople();
}
