package task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * Озунуздун Exception классынызды тузунуз.
         * Employee деген класс тузунуз (свойства: name, age, job).
         * Age берип жатканда эгерде минус сан болсо, тузгон Exception классынызды ыргытыныз.
         * ArrayList тузуп аны жумушчулар менен толтурунуз, бироосунун жашын минус сан менен
         * бериниз, бир элементин null деп бериниз.
         * Элементтеринин маалыматтарын консолго чыгарыныз.
         * Жок индексине да кайрылып корунуз.
         * Болушу мумкун болгон бардык каталарга оз озунчо catch блогун жазыныз.
         * finally блогун кошунуз акырында “Бутту” деп программаны бутурунуз.
         */

        int i = 100;
        int j = 200;

        while (++i < --j);
        System.out.println(i);
    }
}
