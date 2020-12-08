package me.doyoung.junit5study.testable;

public interface Testable<T> {
    T createValue();
}
