package praktika.java_8.service.impl;

import praktika.java_8.classes.Student;
import praktika.java_8.enums.Gender;
import praktika.java_8.service.StudentService;
import praktika.task3.MyException;

import java.util.ArrayList;
import java.util.List;

public class StudentServiseImpl implements StudentService {
    @Override
    public List<Student> searchByName(String name, List<Student> students) {
        ArrayList<Student> students1 = new ArrayList<>();
 //       try {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    students1.add(student);
                } else {
//                    throw new MyException("Mybdai at jok!!");
                }
            }
//        } catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
        return students1;
    }

    @Override
    public List<Student> findByBoys(List<Student> students) {
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.MALE)) {
                students1.add(student);
            }
        }
        return students1;
    }

    @Override
    public List<Student> findByGirls(List<Student> students) {
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)) {
                students1.add(student);
            }
        }
        return students1;
    }
}
