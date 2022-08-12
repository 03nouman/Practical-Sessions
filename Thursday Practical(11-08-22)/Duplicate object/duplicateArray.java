import java.util.ArrayList;
import java.util.Arrays;

class duplicateArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2, 4, 5, 6, 7, 10, 5));
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println("ArrayList with duplicates: " + list);

        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }

        }
        System.out.println("Array without duplicate number :" + newList);
    }

}
