package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveAndReferenceVars {

//    int value = 10;
//    Name leevi = new Name("Leevi");

//    The most significant difference between primitive and reference variables
//    is that primitives (usually numbers) are immutable

//    it is mean that primitive vars are using unique memory references;
//    reference typed vars need to be cloned or initiated with "new" to get clean state copy

    public static void main(String[] args) {

        List<String> a = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }};


        // dereference by reassignment

//        List<String> b = a;
        List<String> b = new ArrayList<String>(a);

        b.add("d");

        System.out.println(a.size());
        System.out.println(b.size());


    }

}
