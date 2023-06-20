package school.mjc.stage0.module3.task1;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import org.junit.jupiter.api.Test;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.mjc.parser.predicate.Dsl.findMain;
import static school.mjc.parser.predicate.Dsl.sout;
import static school.mjc.parser.predicate.Dsl.stringLiteral;

@JavaFileSource("src/main/java/school/mjc/stage0/module3/task1/BrokenApp.java")
class BrokenAppTest extends BaseIOTest {
    @Test
    void main(){
        BrokenApp.main(null);

        assertOutput("fixMe");
    }

    @Test
    public void dummyTest(CompilationUnit parsed) {
        MethodDeclaration main = findMain(parsed);

        int helloWorldSouts = main.findAll(MethodCallExpr.class,
                sout().withArgument(stringLiteral("fixMe"))).size();
        assertEquals(1, helloWorldSouts,
                "Could not find System.out.println with \"fixMe\" argument");
    }
}
