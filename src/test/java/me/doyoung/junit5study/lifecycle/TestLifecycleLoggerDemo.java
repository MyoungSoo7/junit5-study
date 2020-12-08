package me.doyoung.junit5study.lifecycle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestLifecycleLoggerDemo implements TestLifecycleLogger, TimeExecutionLogger,
        TestInterfaceDynamicTestsDemo {

    @Test
    void isEqualValue() {
        assertEquals(1, 1, "is always equal");
    }
}

