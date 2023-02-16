package JavaBasics;

import java.io.IOException;

public class Exceptions {
    // Checked
    public void checked(boolean isResourceAvailable) throws IOException {
        if (!isResourceAvailable) {
            throw new IOException();
        }
    }

    // Unchecked

    public void unchecked() {
//        which will not be caught at compile time

//        ArithmeticException
//        ArrayIndexOutOfBoundsException
//        NullPointerException

        int x = 0;
        int y = 10;
        int z = y / x;
    }

    // Errors

    void errors() {
//        errors serious problems that a reasonable application should not try to catch

        throw new Error();
    }

}
