package JavaBasics;

public class Casting {



//    -128 => to <= 127
    byte aByte = -128;

//    -32,768 => to <= 32,767
    short aShort = -32768;

//    -2147483648 => to <= 2147483647
    int anInt = -2147483648;

    char ch = ' ';

//    -9223372036854775808L => to <= 9223372036854775807L
    long aLong = 9223372036854775807L;

//     1.4E-45f => to <= 3.4028235E38f
    float aFloat = 0.000000000000000000000000000000000000000000001f;

    double aDouble = 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001D;

//        Widening
    public void Widening() {
        aShort = aByte;
        anInt = aShort;
        aLong = anInt;
        aFloat = aLong;
        aDouble = aFloat;
    }

//        Narrowing
    public void Narrowing() {
        aFloat = (float) aDouble;
        aLong = (long) aFloat;
        anInt = (int) aLong;
        aShort = (short) anInt;
        aByte = (byte) aShort;
    }

    {
        int a = ch;
    }

    static abstract class Animal {

        String animal;

        Animal(){

        }

        Animal(String catOrDog){

        }

        void voice(){

        }

    }

    static  class Cat extends Animal {

        public Cat() {
        }

        public Cat(String catOrDog) {
            super(catOrDog);

        }

        void meow(){
            System.out.println(super.animal);
        }

    }

    static class Dog extends Animal {

        public Dog() {

        }

        public Dog(String catOrDog) {
            super(catOrDog);
        }

        void bark(){

        }

    }

    public static void main(String[] args) {

        Cat a = new Cat();

        extracted(a);

    }

    private static void extracted(Animal a) {
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.meow();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
        }
    }
}
