package hello;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapWithSize.aMapWithSize;


public class VarDemo {

    //var field = "Can't declare fields using var"

    @Test
    void showVarUsage() {

        var aNumber = 5;
        var aText = "This is a simple text";

        System.out.println("aNumber: " + aNumber);
        System.out.println("aText: " + aText + " with class of " + aText.getClass());

        String anotherText = aText;
        assertThat(anotherText, containsString(aText));

        final var aConstantText = "This is a constant";
//        aConstantText ="Error";

        var map = new HashMap<String, String>(1);
        map.put("Key", "Value");
        assertThat(map, is(aMapWithSize(1)));
    }

}
