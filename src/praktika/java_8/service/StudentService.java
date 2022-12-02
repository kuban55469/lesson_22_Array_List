package praktika.java_8.service;

import praktika.java_8.classes.Student;

import java.util.List;

public interface StudentService {
    List<Student> searchByName (String name, List<Student> students );

    List<Student> findByBoys(List<Student> students);

    List<Student> findByGirls(List<Student> students);

}
