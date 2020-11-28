package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*

It is not recommended to use ArrayList.remove() when iterating over elements.
 This may lead to ConcurrentModificationException
 */

public class IteratorDemo {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(10);
        al.add(20);
        al.add(30);

      //  removeWithForLoop(al);

        // Remove elements smaller than 10 using
        // Iterator.remove()
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext())
        {
            int x = itr.next();
            if (x < 10)
                itr.remove();
        }

        System.out.println("Modified ArrayList : " + al);


    }





    // https://www.geeksforgeeks.org/iterating-arraylists-java/
    //will give Concurrent exception
    public static void removeWithForLoop(List<Integer> al) {
        for (Integer x : al)
        {
            if (x >= 10)
                al.remove(new Integer(x));
        }
        System.out.println("Modified ArrayList : "
                + al);
    }



}
