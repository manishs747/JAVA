package java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
   https://www.baeldung.com/java-strings-concatenation
 */
public class StringAppend {


    public static void main(String[] args) {
        StringJoiner fruitJoiner = new StringJoiner(",");
        fruitJoiner.add("Apples");
        fruitJoiner.add("Oranges");
        fruitJoiner.add("Bananas");
        System.out.println(fruitJoiner.toString());


        List<String> awesomeAnimals = Arrays.asList("Shark", "Panda", "Armadillo");
        String animalString = awesomeAnimals.stream().collect(Collectors.joining());
        System.out.println(animalString);

    }
}
