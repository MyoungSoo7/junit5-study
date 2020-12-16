package me.doyoung.junit5study.parameter;


import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ExternalMethodSourceDemo {

@ParameterizedTest
@MethodSource("me.doyoung.junit5study.parameter.StringsProviders#tinyStrings")
void testWithExternalMethodSource(String tinyString) {
    // test with tiny string
}

}
