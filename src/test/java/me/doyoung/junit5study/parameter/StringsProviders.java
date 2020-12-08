package me.doyoung.junit5study.parameter;

import java.util.stream.Stream;

class StringsProviders {
    static Stream<String> tinyStrings() {
        return Stream.of(".", "oo", "OOO");
    }
}
