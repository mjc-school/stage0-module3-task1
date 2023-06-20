package school.mjc.stage0.module3.task1;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import org.junit.jupiter.api.Test;
import school.mjc.stage0.module3.task1.FillGapsApp;
import school.mjc.test.BaseIOTest;
import school.mjc.test.JavaFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static school.mjc.parser.predicate.Dsl.findMain;
import static school.mjc.parser.predicate.Dsl.sout;
import static school.mjc.parser.predicate.Dsl.stringLiteral;


@JavaFileSource("src/main/java/school/mjc/stage0/module3/task1/FillGapsApp.java")
class FillGapsAppTest extends BaseIOTest {

    @Test
    void main(){
        FillGapsApp.main(null);

        assertOutput("Fixed");
    }

    @Test
    public void verifyCode(CompilationUnit parsed) {
        MethodDeclaration main = findMain(parsed);

        int helloWorldSouts = main.findAll(MethodCallExpr.class,
                sout().withArgument(stringLiteral("Fixed"))).size();
        assertEquals(1, helloWorldSouts,
                "Could not find System.out.println with \"Fixed\" argument");
    }
}
