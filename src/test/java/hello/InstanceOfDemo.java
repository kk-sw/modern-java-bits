package hello;

import java.io.File;

import org.junit.jupiter.api.Test;

public class InstanceOfDemo {

    @Test
    void showInstanceOfUsage() {
        Object fileObject = aFileObject();
        if (fileObject instanceof File file) {
            System.out.println("Now can use File methods: " + file.getName());
        }
    }

    Object aFileObject() {
        return new File("example.txt");
    }

}
