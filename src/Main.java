import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        StreamMain streamOne = new StreamMain();
        streamOne.streamList();

        noStreamList();
    }

    public static void noStreamList() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int num : intList) {
            if (num > 0 && num % 2 == 0) newList.add(num);
        }

        Collections.sort(newList);

        for (int num_two : newList) {
            System.out.println(num_two);
        }
    }
}