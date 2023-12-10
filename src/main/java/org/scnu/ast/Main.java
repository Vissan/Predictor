package org.scnu.ast;

import org.scnu.ast.util.JavaParserUtil;
import org.scnu.hardwareObject.AstInfo;

import java.util.List;

public class Main {

    public static void main(String[] args){
        try {
            /**
             * 文件地址和方法名需要修改
             */
            String fileName = "/Users/vissan/IdeaProjects/Predictor/src/main/java/org/scnu/ast/Test.java";
            String methodName = "test";
            AstInfo astInfo = JavaParserUtil.parseMethod(fileName, methodName);
            System.out.println(astInfo.toString());
        } catch (Exception e){
            System.out.println("JavaParserUtil.parseMethod 方法异常：" + e.getMessage());
            new RuntimeException(e);
        }
    }

}
