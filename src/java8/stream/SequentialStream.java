package java8.stream;

import java8.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SequentialStream {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Manish",33));
        people.add(new Person("Preeti",34));
        people.add(new Person("rajnish",28));
        Predicate<Person> pred = (p) -> p.getAge() > 30;
        displayStream(people,pred);
        display(people,pred);
    }


    public static void  displayStream(List<Person> list,Predicate<Person> pred){
        System.out.println("*******************displayStream*******************");
        list.stream()
                .filter(pred)
                .forEach(p-> System.out.println(p.getName()));
    }


    public static void  display(List<Person> list,Predicate<Person> pred){
        System.out.println("*******************Display Lambda**************");
        list.forEach(p-> {
            if(pred.test(p)){
             System.out.println(p.getName());
        }
        });
    }
}
