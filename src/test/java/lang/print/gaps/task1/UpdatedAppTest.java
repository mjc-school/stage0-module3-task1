package lang.print.gaps.task1;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UpdatedAppTest extends BaseIOTest {

    @Test
    void mainUpdated() {
        UpdatedApp.main(null);

        assertEquals("updated\n", updateLineSpliterators(outContent.toString()));
    }
}