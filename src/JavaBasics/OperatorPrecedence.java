package JavaBasics;

public class OperatorPrecedence {

//      postfix and prefix increment and decrement
//      X++ X-- ++X --X

//      unary (mathematical operation)
//      + -  +(a) -(b)

//      multiplicative
//      * / % (modulo) a % 2 == 0

//      relational
//      < > <= >= instanceof (check inheritance, nulls)

//      logical operators
//      ! not
//      || OR                   false || false = false, false || true = true, true || false = true, true || true = true
//      ^ Inclusive OR (XOR)    false ^ false = false, false ^ true = true, true ^ false = true, true ^ true = false
//      &&  AND
//      ? true : false ternary
//      = += -= *= /= %=
//      &= ^= |=  assignment

//      Bitwise Operands
//      ~(c) Bitwise Complement (invert binary code 0 -> 1)
//      |   Bitwise OR
//      &   Bitwise AND
//      <<  Left Shift
//      >>  Signed Right Shift
//      >>> Unsigned Right Shift


    public static void main(String[] args) {
        boolean[] all = { false, true };
        for (boolean a : all) {
            for (boolean b: all) {
                boolean c = a || b;

                String s = "";
                System.out.println(a + " || " + b + " = " + c);
            }
        }
    }



}
