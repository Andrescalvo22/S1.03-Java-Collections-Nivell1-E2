import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise2 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("List with the original order");
        System.out.println(numberList);

        List<Integer> reversedNumberList = new ArrayList<>();
        ListIterator<Integer> iterator = numberList.listIterator(numberList.size());

        while (iterator.hasPrevious()) {
            reversedNumberList.add(iterator.previous());
        }
        System.out.println("List with a reverse order");
        System.out.println(reversedNumberList);
    }
}