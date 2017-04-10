package com.aurea.deadcode.test;

/**
 * Created by sedoy on 06.04.17.
 */
public class UnusedClass {

    public static final String TEST_UNUSED_STATIC_PUB_TT ="dfdfs";
    private static final String TEST_UNUSED_STATIC_PRIV_TT ="3433";
    public Integer unusedPublicProp;
    private Integer unusedPrivateProp;
    public static final Integer unusedPSFProp = 1253;

    public void methodWithUnsedLocalVar(String unsedParam) {
        int unsedVar;
    }

    public void unusedMethod() {
        System.out.println("ertet");
        usedFunctionInUnsedClass();
    }


    public void setUnusedProp(Integer unusedPublicProp) {
        System.out.println("ertet");
    }

    public Integer getUnusedProp() {
        return 1;
    }

    public static class unusedInnerClass {

    }

    public void usedFunctionInUnsedClass() {
        System.out.println("ertet");
    }

    public void unusedFunctionInUnsedClass {
        System.out.println("ertet");
    }

}
