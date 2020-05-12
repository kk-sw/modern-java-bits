package hello;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * record: a final (data) class that have only final fields that are set in the constructor with compiler
 *          generated standard methods
 */
public class RecordDemo {

    @Test
    void showRecordUsage() {
        Meter meter = new Meter("Itron S500", 1244784);
        System.out.println(meter);                                                      // toString
        System.out.println("Meter name is " + meter.name() + "\n");                     // field access

        Color colGreen = new Color("Green");
        assertThat(colGreen, is(new Color("Green")));                                   // equals
        assertThrows(IllegalArgumentException.class, () -> new Color(""));              // validating ctor
    }


    record Meter(String name, int id) { // extends java.lang.Record

    }

    record Color(String color) {

        public Color {                                                                  // compact ctor
            if (color.isEmpty())
                throw new IllegalArgumentException("Empty color");
        }

        void changeColor (String newColor) {
            //color = newColor;                                                         // can't change color
        }
    }

}
