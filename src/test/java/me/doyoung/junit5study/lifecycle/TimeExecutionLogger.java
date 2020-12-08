package me.doyoung.junit5study.lifecycle;



import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

//tag::user_guide[]
@Tag("timed")
@ExtendWith(TimingExtension.class)
interface TimeExecutionLogger {
}
