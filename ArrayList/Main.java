import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
//    Arrays are fixed in size but arraylist can change
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ADD
        list.add(8);
        list.add(5);
        list.add(9);
        System.out.println(list);

//        REMOVE
        list.remove(2);
        System.out.println(list);

//        SET
        list.set(1, 6);
        System.out.println(list);

//        GET
        System.out.println(list.get(0));

//        SIZE
        System.out.println(list.size());

//        SORT
        Collections.sort(list);
        System.out.println(list);
    }
}
