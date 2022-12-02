package praktika.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter suze: ");
        int num = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter num: ");
            numbers.add(scanner.nextInt());
        }
        System.out.println("Enter surch num:");
        try {
            boolean isTrue = sorch(scanner.nextInt(), numbers);
            if (isTrue){
                System.out.println("Bar");
            }else {
                throw  new MyException("Not found");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }


    }
    public static boolean sorch(int num, List<Integer> numbers){
        for (Integer number : numbers) {
            if (number == num){
                System.out.println(number);
                return true;
            }
        }
        return false;
    }
}
