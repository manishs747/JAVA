package compare;

import java.util.Comparator;

/*
https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem

Declare a Checker class that implements the comparator method as described.
It should sort first descending by score, then ascending by name.
 The code stub reads the input, creates a list of Player objects,
 uses your method to sort the data, and prints it out properly.
 */
public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if(a.score == b.score){
           return a.name.compareTo(b.name);
        }
       // return (a.score>b.score ? -1 : (a.score==b.score ? 0 : 1));
        return b.score - a.score;
    }
}
