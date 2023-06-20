package school.mjc.stage0.module3.task1;

import org.junit.jupiter.api.Test;
import school.mjc.stage0.module3.task1.PrintWordsApp;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JavaFileSource("src/main/java/school/mjc/stage0/module3/task1/PrintWordsApp.java")
class PrintWordsAppTest extends BaseIOTest {

    @Test
    void mainPrintsLine() {
        PrintWordsApp.main(null);

        assertOutput("java", "is", "smth");
    }
}
