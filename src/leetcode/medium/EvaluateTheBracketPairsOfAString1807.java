package leetcode.medium;
import java.util.List;
public class EvaluateTheBracketPairsOfAString1807 {
    public static String evaluate(String s, List<List<String>> knowledge) {
        for (List<String> i : knowledge) {
            String repl = "\\(" + i.get(0) + "\\)";
            s = s.replaceAll(repl, i.get(1));
        }
        s = s.replaceAll("\\(.*?\\)", "?");
        return s;
    }
}
