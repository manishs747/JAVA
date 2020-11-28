package java8.stream;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://www.baeldung.com/java-list-split
 */
public class ListInBatch {




    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i < 13000;i++){
            list.add(i);
        }
        java8Split(list,100);
    }

    public static void java8Split(List<Integer> intList,int batchSize) {
        Map<Integer, List<Integer>> groups = intList.stream().collect(Collectors.groupingBy(s -> (s - 1) / batchSize));
        List<List<Integer>> batchList = new ArrayList<>(groups.values());
        batchList.parallelStream().forEach(list->System.out.println(list));
    }
}
