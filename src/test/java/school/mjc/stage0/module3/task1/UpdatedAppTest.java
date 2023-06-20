package school.mjc.stage0.module3.task1;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.module3.task1.UpdatedApp;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@JavaFileSource("src/main/java/school/mjc/stage0/module3/task1/UpdatedApp.java")
class UpdatedAppTest extends BaseIOTest {

    @Test
    void mainUpdated() {
        UpdatedApp.main(null);

        assertOutput("I'm updated", "can be compiled. And can write to console");
    }
}
