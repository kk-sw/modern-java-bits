package hello;

import org.junit.jupiter.api.Test;

public class TextBlockDemo {

    @Test
    void showTextBlockUsage() {
        var htmlTextBlock = """
                <html>
                         
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";

        System.out.println(htmlTextBlock);
    }

}
