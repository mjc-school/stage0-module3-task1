package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FillGapsAppTest extends BaseIOTest {

    @Test
    void mainFixed() {
        FillGapsApp.main(null);

        assertEquals("Fixed\n", updateLineSpliterators(outContent.toString()));
    }
}