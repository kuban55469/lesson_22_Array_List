package praktika.java_8.classes;

import praktika.java_8.enums.Gender;
import praktika.java_8.myException.MyException;
import praktika.java_8.service.impl.StudentServiseImpl;

import java.time.LocalDate;
import java.util.List;

public class Student extends StudentServiseImpl {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dateOfVBrith;

    public Student() {
    }

    public Student(String name, int age, Gender gender, LocalDate dateOfVBrith) {
        this.name = name;
        try {
            if (age > 0){
                this.age = age;
            }
            else {
                throw new MyException("Jash ters san bolboit!!");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }

        this.gender = gender;

        LocalDate j = LocalDate.now();
        int rezult = dateOfVBrith.compareTo(j);
        if(rezult==0){
            this.dateOfVBrith=null;
        } else if (rezult<0) {
            this.dateOfVBrith = dateOfVBrith;
        }else {
            this.dateOfVBrith=null;
        }

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfVBrith() {
        return dateOfVBrith;
    }

    public void setDateOfVBrith(LocalDate dateOfVBrith) {
        this.dateOfVBrith = dateOfVBrith;
    }

    @Override
    public List<Student> searchByName(String name, List<Student> students) {
        return super.searchByName(name, students);
    }

    @Override
    public List<Student> findByBoys(List<Student> students) {
        return super.findByBoys(students);
    }

    @Override
    public List<Student> findByGirls(List<Student> students) {
        return super.findByGirls(students);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfVBrith=" + dateOfVBrith +
                '}' + "\n";
    }
}
