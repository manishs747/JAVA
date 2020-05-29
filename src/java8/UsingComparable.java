package java8;

import javaPractice.Collection.ArrayListSortingComparoter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparable {


    public static void main(String[] args) {

        List<String > list = new ArrayList<>();
        list.add("AAA");
        list.add("bbb");
        list.add("CCC");
        list.add("dd");
        list.add("EE");

        Comparator<String> comp = (str1, str2) -> {return  str1.compareToIgnoreCase(str2);};
        Collections.sort(list,comp);
      /*  for (String str:list) {
            System.out.println(str);
        }*/
      list.forEach(str ->System.out.println(str));



    }
}
