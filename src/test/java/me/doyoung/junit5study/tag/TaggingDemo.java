package me.doyoung.junit5study.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TaggingDemo {

    @Test
    @Tag("regression")
    void testingTaxCalculation() {
    }

    @Test
    @Tag("integration")
    void testIntegration() {
    }

    @Test
    @Fast
    void testFast() {
    }

    @Test
    @Tag("slow")
    void testSlow() {
    }

    @Test
    @Tag("middle")
    void testMiddle() {
    }
}
