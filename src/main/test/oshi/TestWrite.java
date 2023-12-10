package oshi;

import org.scnu.ast.util.JavaParserUtil;
import org.scnu.hardwareObject.AstInfo;

public class TestWrite {

    public void testwriteExcel() throws Exception {
        String fileName = "/Users/vissan/IdeaProjects/Predictor/src/main/java/org/scnu/ast/Test.java";
        String methodName = "test";
        AstInfo astInfo = JavaParserUtil.parseMethod(fileName, methodName);


    }
}
