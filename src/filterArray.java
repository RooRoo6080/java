import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterArray {
    public static void main(String[] args) {
        String[] array = {""};
        List<String> formatted = new ArrayList<>();
        for (String i : array) {
            if (i.endsWith("s")) {
                i = i.replaceFirst(".$","");
            }
            i = '"' + i + '"';
            formatted.add(i);
        }
        System.out.println(Arrays.toString(formatted.toArray()));
    }
}
