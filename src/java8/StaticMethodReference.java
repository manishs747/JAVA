package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Manish",33));
        people.add(new Person("Preeti",34));
        people.add(new Person("rajnish",28));

        Collections.sort(people,Person::compareAges);  //this ::compareAges if compareAges is current class
        people.forEach(person -> System.out.println(person));


    }
}
