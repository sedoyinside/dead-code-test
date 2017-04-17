package com.aurea.deadcode.test;

/**
 * Created by sedoy on 06.04.17.
 */
public class UnusedClass {

    public static final String TEST_UNUSED_STATIC_PUB_TT ="dfdfs";
    private static final String TEST_UNUSED_STATIC_PRIV_TT ="3433";
    public Integer unusedPublicProp;
    private Integer unusedPrivateProp;
    public static final Integer unusedPublicProp = 1253;
    volatile long volatileDEfaultUnused;
    volatile private long volatilePrivateUnused;

    public void methodWithUnsedLocalVar(String unsedParam) {
        int unsedVar;
    }

    public void unusedPublicMethod(Integer unusedMethodVar) {
        final String unusedFinalLocalVar= "Test";
        final String unusedLocalVar= "Test";
        System.out.println("ertet");
        usedFunctionInUnsedClass();
    }


    public void setUnusedPublicProp(Integer unusedPublicProp1) {
        final String unusedFinalLocalVar1= "Test";
        final String unusedLocalVar1= "Test";
        System.out.println("ertet");
        usedFunctionInUnsedClass();
        System.out.println("ertet");
    }

    public Integer getUnusedPublicProp() {
        return 1;
    }

    public static class unusedPublicInnerClass {

    }

    public void usedFunctionInUnsedClass() {
        System.out.println("ertet");
    }

    private void unusedPrivateFunctionInUnsedClass {
        System.out.println("ertet");
    }

    private String unusedPrivateMethodInUnsedClass {
        System.out.println("ertet");
        return "test"
    }


    private static class PrivateInnerClass {

    }

    public static class PublicInnerClass {

    }

}
