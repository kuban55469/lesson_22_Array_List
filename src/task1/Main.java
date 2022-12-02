package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Student деген класс тузунуз (свойства: name, age, group).
         * ArrayList тузуп аны 10 студент менен толтурунуз.
         * 1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
         * 2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
         * салыныз(Java,JavaScript)
         * 3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
         * 4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
         * Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
         * Маанилер main класстан берилуусу керек.
         */
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<>();
        students.add( new Student("Kuban", 20,"java"));
        students.add(new Student("Aibek", 24,"js"));
        students.add(new Student("Suban", 14,"java"));
        students.add(new Student("Kut", 45,"js"));
        students.add(new Student("Joke", 19,"java"));
        students.add(new Student("Asan", 34,"js"));
        students.add(new Student("Sabina", 27,"java"));
        students.add(new Student("Yson", 23,"js"));
        students.add( new Student("Ilim", 22,"java"));
        students.add(new Student("Asam", 31,"js"));


//       student.getAllStudent(students);
//        student.filterByGroup(students);

//        student.sortAge(students);

        student.filterName(students);


    }
}
