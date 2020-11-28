package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List8 {


    public static void main(String[] args) {
        List<Integer> result  = new ArrayList<>();
        List<Integer> source1 = Arrays.asList(1, 2, 3);
        List<Integer> source2 = Arrays.asList(5, 6, 7, 8, 9, 10);
        result.addAll(source1);
        result.addAll(source2);
        System.out.println(result);





        Stream<Integer> combinedStream = Stream.concat(
                source1.stream(),
                source2.stream());
        System.out.println(Arrays.asList(combinedStream.toArray()));






    }



}
