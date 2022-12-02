package praktika.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /**
         * Озуно соз кабыл ала турган динамический массив тузунуз.
         * Аны толтурунуз, консолго баарын чыгарыныз.
         * Жана экинчисинде сорттоп чыгарыныз."China"
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Kurgyzstan","Uzbekistan","Russia" ,"USA")
        );

        words.forEach(System.out::println);
        System.out.println();
        Collections.sort(words);
        words.forEach(System.out::println);
    }
}
