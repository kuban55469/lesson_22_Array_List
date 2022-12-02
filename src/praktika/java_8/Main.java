package praktika.java_8;

import praktika.java_8.classes.Student;
import praktika.java_8.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * java-8 деген пакет ачыныз.
         * Ошол пакеттин ичине classes, enums , servise, пакет ачыныз.
         * classes пакетинин ичине Student деген класс ачыныз.
         * String name;
         * int age;
         * Gender gender;
         * LocalDate dateOfBrith;
         * enums пакетинин ичине Gender enum ачыныз.
         * service пакетинин ичине StudentService деген interface ачыныз.
         *
         * Studentти аты менен тапчуу метод жазыныз.
         * Балдардын баарын кацтарчу метод жазыныз.
         * Кыздардын баарын кацтарчу метод жазыныз.
         * service пакетинин ичине impl деген пакет ачып анын ичине
         * studentServiceImpl деген класс тузуп аны StudentService
         * implement кылсын.
         * Логикаларын чыгырып main класста иштениз.
         */


        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Kuban" , 20, Gender.MALE, LocalDate.of(2002,12,10)),
                new Student("Nuraiym", 18,Gender.FEMALE,LocalDate.of(2030,7,9)),
                new Student("Asan", 22,Gender.MALE,LocalDate.of(2000,9,22)),
                new Student("Asel" ,16,Gender.FEMALE,LocalDate.of(2006,11,4))
        ));

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);


        //

        //
        System.out.println(student.searchByName(scanner.nextLine(), students));
//        switch (scanner.nextInt()) {
//            case 1 -> System.out.println(student.searchByName(scanner.nextLine(), students));
//            case 2 -> System.out.println(student.findByBoys(students));
//            case 3 -> System.out.println(student.findByGirls(students));
//            default -> System.out.println();
//        }
    }
}
