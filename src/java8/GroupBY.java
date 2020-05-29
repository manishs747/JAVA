package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBY {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Manish",33));
        people.add(new Person("Preeti",28));
        people.add(new Person("rajnish",28));


        Map<Integer,List<Person>> personByAge = people.stream() .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Person grouped by age in Java 8: " + personByAge);

    }
}
