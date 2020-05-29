package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInnerClass {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Manish",33));
        personList.add(new Person("Preeti",34));
        personList.add(new Person("rajnish",28));

        Predicate<Person> preOld = (p)-> p.getAge() >= 30;

        personList.forEach(p->{
            if(preOld.test(p)){
                System.out.println(p);
            }
        });



    }
}
