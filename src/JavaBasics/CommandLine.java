package JavaBasics;

//  javac CommandLine.java
//  java CommandLine.class args args

// javac CommandLine.java
// jar -cf CommandLine.jar CommandLine.class

// java -jar <jar-file-name>.jar
// required for manifest file

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}
