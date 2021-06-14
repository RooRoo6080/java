import java.util.ArrayList;

public class ArrayMaker {

    public Integer[] arrayMaker(int start, int end) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            al.add(i);
        }
        return al.toArray(new Integer[end-1]);
    }

}
