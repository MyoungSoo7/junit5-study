package me.doyoung.junit5study.injection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import me.doyoung.junit5study.injection.RandomParametersExtension.Random;

@ExtendWith(RandomParametersExtension.class)
class MyRandomParametersTest {

    @Test
    void injectsInteger(@Random int i, @Random int j) {

        assertNotEquals(i, j);
    }

    @Test
    void injectsDouble(@Random double d) {
        System.out.println(d);
        assertEquals(0.0, d, 1.0);
    }

}

