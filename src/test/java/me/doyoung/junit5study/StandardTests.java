package me.doyoung.junit5study;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class StandardTests {

    @BeforeAll
    static void initAll() {
        System.out.println("initAll @BeforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("init @BeforeEach");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest");
    }

    @Test
    void succeedingTest2() {
        System.out.println("succeedingTest2");
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }


    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }


    @AfterEach
    void tearDown() {
        System.out.println("tearDown @AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll @AfterAll");
    }


}
