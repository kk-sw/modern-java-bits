package hello;

import org.junit.jupiter.api.Test;


public class NpeDemo {

    @Test
    void showNpeDetailsUsage() {
        String text = null;
        boolean empty = text.isEmpty();
        System.out.println("Text is empty: " + empty);

        //
        // JVM arg:  -XX:+ShowCodeDetailsInExceptionMessages
        //
        // java.lang.NullPointerException
        // java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "text" is null
    }

}
