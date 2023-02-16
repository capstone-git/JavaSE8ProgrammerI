package JavaBasics.importPackages;

import java.util.Date;
import JavaBasics.importPackages.TestPackage;

import static JavaBasics.importPackages.TestPackage.VALUE;


// import needed to simplify object call signature,
// public full path for java.util.Date -> Date (import java.util.Date;)


//  public static full path for JavaBasics.importPackages.TestPackage.VALUE or * -> VALUE
//  * star import all class members

class Packages extends java.util.Date  {

    private boolean local =
    VALUE;
}