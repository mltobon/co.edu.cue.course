package view;

import model.*;
import services.PersonService;
import services.impl.PersonServiceImpl;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Course course = new Course();
        course.setName("Ingenieria de Software");
        List<Person> people = new ArrayList<Person>();
        List<Student> students = createStudentList();
        List<Professor> professors = createProfessors();
        people.addAll(students);
        people.addAll(professors);
        course.setPeople(people);

        PersonService service = new PersonServiceImpl(course);

        service.addProfessor(new Professor("Andrea","3",Category.AUXILIAR));

        JOptionPane.showMessageDialog(null,course.getPeople().get(0).getName());


      /*  Asignature asignature = new Asignature();
        asignature.setName("Programacion 2");

        StudentScore studentScore = new StudentScore();
        studentScore.setScore(4);
        studentScore.setStudent(students.get(0));
        studentScore.setAsignature(asignature);

        StudentScore studentScore2 = new StudentScore();
        studentScore2.setScore(3);
        studentScore2.setStudent(students.get(1));
        studentScore2.setAsignature(asignature);

        List<StudentScore> studentScores= List.of(studentScore,studentScore2);

        String programa = JOptionPane.showInputDialog(null,"Ingrese A para conocer el programa de Software");
        if(programa.equalsIgnoreCase("A")){
            JOptionPane.showMessageDialog(null,"El programa seleccionado es:" +course.getName());
            JOptionPane.showMessageDialog(null, "El personal del programa: " + course.getPeople());
        }

        List<Double> scores= studentScores
                .stream()
                .filter(a->a.getAsignature().getName().equalsIgnoreCase("Programacion 2")).map(e->e.getScore()).toList();
        JOptionPane.showMessageDialog(null,"Las notas del curso de programacion 2: \n" +scores);
*/

    }

    private static List<Student> createStudentList(){
        Student student = new Student("Lola","1",5);

        Student student1 = new Student("Karla","1",4);

        Student student2 = new Student("Andres","1",3);

        return List.of(student,student1, student2);
    }

    private static List<Professor> createProfessors(){
        Professor professor =  new Professor("Monica","1",Category.TITULAR);
        Professor professor1 =  new Professor("Julio","2",Category.TITULAR);
        return List.of(professor,professor1);
    }

}