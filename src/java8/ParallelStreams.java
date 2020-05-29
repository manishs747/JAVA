package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreams {

    public static void main(String[] args) {
        System.out.println("Normal...");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.forEach(v->System.out.println(v));



        System.out.println("Parallel...");
        list.parallelStream().forEach(v->System.out.println(v));

    }
}
