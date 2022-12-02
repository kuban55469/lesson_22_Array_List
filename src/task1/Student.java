package task1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student() {
    }

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    public void getAllStudent(List<Student> students){
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void filterByGroup(List<Student> students){
        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals("java")){
               java.add(student);
            }
            else if (student.getGroup().equals("js")){
                js.add(student);
            }
        }
        java.forEach(System.out::println);
        js.forEach(System.out::println);
    }

    public void sortAge(List<Student> students){
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() == 19){
                students1.add(student);
            }
        }
        students1.forEach(System.out::println);
    }

    public void filterName(List<Student> students){
        ArrayList<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains("A")){
                students1.add(student);
            }
        }
        students1.forEach(System.out::println);
    }
}
