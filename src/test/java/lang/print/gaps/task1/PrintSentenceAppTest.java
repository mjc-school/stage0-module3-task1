package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintSentenceAppTest extends BaseIOTest {

    @Test
    void mainPrintSentence() {
        PrintSentenceApp.main(null);

        assertEquals("This is my first Java program\n", updateLineSpliterators(outContent.toString()));
    }
}