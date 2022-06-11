package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintWordsAppTest extends BaseIOTest {

    @Test
    void mainPrintsLine() {
        PrintWordsApp.main(null);

        assertEquals("java\nis\nsmth\n", updateLineSpliterators(outContent.toString()));
    }
}