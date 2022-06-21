package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UpdatedAppTest extends BaseIOTest {

    @Test
    void mainUpdated() {
        UpdatedApp.main(null);

        assertEquals("I'm updated\ncan be compiled. And can write to console\n", updateLineSpliterators(outContent.toString()));
    }
}
