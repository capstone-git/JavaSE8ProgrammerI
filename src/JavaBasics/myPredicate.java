package JavaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class myPredicate {

//    Lambda expression that consumes a Lambda Predicate expression
    interface Addition {
        int run(int a, int b);
    }

    {
        List<Integer> jerseys = Arrays.asList(99, 66, 88, 16);

        /* Java predicate and lambda stream example usage */
        List<Integer> evenNumbers =
                jerseys.stream()
                        .filter(x -> ((x % 2) == 0))
                        .collect(Collectors.toList());

        /* The following line prints: [66, 88, 16] 8 */
        System.out.println(evenNumbers);

        int a =0;
        int b =0;

        Addition addition = (x1, x2) -> x1 + x2;

        System.out.println(addition);

        System.out.println((Addition) (a1, b1) -> a1 + b1);
    }


}
