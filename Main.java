import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Вариант 1
        Integer[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        for (int i : input) {
            if (i > 0 && i % 2 == 0) {
                intList.add(i);
            }
        }
        Collections.sort(intList);
        System.out.println("Результат первого варианта: " + intList);

        //Вариант 2
        System.out.println("Результат второго варианта: ");
        StreamMain obj = new StreamMain();
        obj.intList2.stream()
                .filter(x-> x >0)
                .filter(x-> x % 2 ==0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}