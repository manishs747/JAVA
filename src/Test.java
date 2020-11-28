import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result.addAll(new ArrayList<>());
        result.addAll(new ArrayList<>());

        System.out.println(result.size());


    }
}
