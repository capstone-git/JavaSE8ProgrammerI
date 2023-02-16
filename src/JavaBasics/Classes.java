package JavaBasics;

import static JavaBasics.Classes.Run.run;

public class Classes {

    interface Run {


        String run = "run";

        void run();

        void play();

        default void seat() {
            System.out.println("SEATING");
        }

    }

    static abstract class Animal {

        String s;

        Animal() {

        }

        Animal(String name) {
            this.s = name;
        }

        abstract void setName();

        abstract void setEyeColor();

        abstract void getFurColor();

    }

    static class Dog extends Animal implements Run {


        public Dog() {
        }

        public Dog(String name) {
            super(name);
        }

        @Override
        void setName() {
            s = "NAME";
        }

        @Override
        void setEyeColor() {

        }

        @Override
        void getFurColor() {

        }

        @Override
        public void run() {

            System.out.println(Run.run);
        }

        @Override
        public void play() {

        }

    }

    static class Cat extends Animal implements Run {

        public Cat() {
        }

        public Cat(String name) {
            super(name);
        }

        @Override
        void setName() {

        }

        @Override
        void setEyeColor() {

        }

        @Override
        void getFurColor() {

        }


        public void run() {

        }

        @Override
        public void play() {

        }

    }

    public static void main(String[] args) {

        Run a = new Cat();
        a.seat();
        a.play();
        a.run();

        Cat x = new Cat();
        x.setEyeColor();
        x.setEyeColor();

        Run c = new Dog();
        c.seat();
        c.play();
        c.run();

        Animal animal = new Cat();

        animal = new Dog();


    }
}
