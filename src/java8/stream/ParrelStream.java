package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ParrelStream {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i < 1000;i++){
            list.add(i);
        }
        printParrel(list);
    }

       public static void print(List<Integer> list){
           for (int i:list) {
               System.out.println(i);
           }
       }

    public static void printParrel(List<Integer> list){
        list.parallelStream().forEach(i->System.out.println(i));
    }



}
