package main.java.ThirdDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraysListIteration {

    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<>();
        tvSeries.add("Game of thrones");
        tvSeries.add("Breaking bad");
        tvSeries.add("The big bang theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");

        // Using Java 8 with Foreach loop and lambda
        tvSeries.forEach(shows -> System.out.println(shows));

        // Using Iterator
        Iterator<String> it = tvSeries.iterator();
        while(it.hasNext()){
            String shows = it.next();
            System.out.println(shows);
        }

        // Using iterator and jave 8 forEachRemaining() method
        it = tvSeries.iterator();
        it.forEachRemaining(shows -> System.out.println(shows));

        // Using for each loop
        for(String show :tvSeries){
            System.out.println(show);
        }

        // Using for loop with order/index
        for(int i = 0; i<tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }

        // Using list iterator to traverse in both the directions
        ListIterator<String> stringListIterator = tvSeries.listIterator(tvSeries.size());
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

    }
}
