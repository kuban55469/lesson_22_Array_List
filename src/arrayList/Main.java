package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

//        Random random = new Random();
//        ArrayList<Integer> num = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            num.add(random.nextInt(1,20));
//            System.out.println(num.get(i));
//        }
        
//        numbers.clear();

//        System.out.println(numbers);
//        System.out.println(numbers.get(1));
//        System.out.println("Razmer" + numbers.size());

//        System.out.println(numbers.set(1, 7));
//        System.out.println(numbers);
//
//        System.out.println(numbers.isEmpty());

//        System.out.println(numbers.remove(3));
//        System.out.println(numbers);

//        System.out.println(numbers.contains(5));
//        System.out.println(numbers);


//
//        ArrayList<String> gr = new ArrayList<>(
//                Arrays.asList("java-6","Java-7", "Java-8"));
//        System.out.println(gr);


        ArrayList<Integer> numm = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6)
        );
        System.out.println(numm);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < numm.size(); i++) {
            System.out.print(numm.get(i) + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~");

        for (Integer integer : numm) {
            System.out.print(integer + " ");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~");

        Iterator<Integer> integers = numm.iterator();
        while (integers.hasNext()){
            System.out.print(integers.next() + " ");
        }

    }
}