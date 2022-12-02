package praktika.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        /**
         * Бир бутун санды камтыган динамический массив тузунуз.
         * Аны сандар менен толтурунуз жана бир кайтарбоочу метод
         * жазыныз ал бизге так сандарды очуруп берсин.
         */
        ArrayList<Integer> nums = new  ArrayList<>(Arrays.asList(
                1,2,3,4,5,7,8,9,10
        ));

        getNum(nums);
    }
    public static void getNum(ArrayList<Integer> numbers){
//        Iterator<Integer> integers = numbers.iterator();
//        while (integers.hasNext()) {
//                System.out.print(integers.next() + " ");
//        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) %2 != 0)
                numbers.remove(i);
        }
        System.out.println(numbers);
    }
}
