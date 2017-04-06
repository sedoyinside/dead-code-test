package com.aurea.deadcode.test;

/**
 * Created by sedoy on 06.04.17.
 */
public class UnusedClass {

    public Integer unusedPublicProp;
    private Integer unusedPrivateProp;
    public static final Integer unusedPSFProp = 1253;

    public void methodWithUnsedLocalVar(String unsedParam) {
        int unsedVar;
    }

    public void unusedMethod() {
        System.out.println("ertet");
    }


    public void setUnusedProp(Integer unusedPublicProp) {

    }

    public Integer getUnusedProp() {
        return 1;
    }

    public static class unusedInnerClass {

    }

}
