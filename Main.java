import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    static List<Integer> onlyPositive(List<Integer> intList) {
        List<Integer> positiveList = new ArrayList<>();
        for (Integer num : intList
        ) {
            if (num > 0) {
                positiveList.add(num);
            }
        }
        return positiveList;
    }

    static List<Integer> divisibleBy2(List<Integer> intList) {
        List<Integer> positiveList = new ArrayList<>();
        for (Integer num : intList
        ) {
            if (num % 2 == 0) {
                positiveList.add(num);
            }
        }
        return positiveList;
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        intList = onlyPositive(intList);
        intList = divisibleBy2(intList);
        Collections.sort(intList);

        intList.forEach(System.out::println);
    }
}