package com.aurea.deadcode.test;

/**
 * Created by sedoy on 06.04.17.
 */
public class TestusesClass implements ImplemetnInterface {

    public void test(ImplemetnInterface.usedInnerClass var, String unusedMethodVar) {
        CastClass test = (CastClass) new Object();
    }
}
