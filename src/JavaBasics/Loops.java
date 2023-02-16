package JavaBasics;

import java.util.*;

public class Loops {

    public static void main(String[] args) {
//        Map<String, Integer> personAges = new TreeMap<>();
//        personAges.put("Oliver", 18);
//        personAges.put("Charlotte", 41);
//        personAges.put("Noah", 30);
//        personAges.put("Z", 25);

//        Iterator<Map.Entry<String, Integer>> a = personAges.entrySet().iterator();
//
//        while (a.hasNext()) {
//
//            Map.Entry<String, Integer> pair = a.next();
//
//            System.out.println(pair.getKey());
//
//        }

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
