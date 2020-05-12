package hello;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class SwitchDemo {

    private static final String[] COLOR_NAMES = {"Black", "Red", "Blue", "Green", "Other"};

    @Test
    void showSwitchUsage() {
        var colorString = COLOR_NAMES[new Random().nextInt(COLOR_NAMES.length)];
//        colorString = COLOR_NAMES[1];

        var dynamicResult = switch (colorString) {               // result type: aka Object (need to cast)
            case "Black" -> 0;                                   // integer
            case "Red" -> 1;                                     // integer
            default -> {
                yield colorString + " is unknown";               // string + yield (block return)
            }
        };

        System.out.println(colorString + " is " + dynamicResult + " with type of " + dynamicResult.getClass());
    }
}
