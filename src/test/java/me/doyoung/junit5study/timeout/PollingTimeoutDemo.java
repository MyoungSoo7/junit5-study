package me.doyoung.junit5study.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PollingTimeoutDemo {

    // tag::user_guide[]
    @Test
    @Timeout(5) // Poll at most 5 seconds
    void pollUntil() throws InterruptedException {
        while (asynchronousResultNotAvailable()) {
            Thread.sleep(250); // custom poll interval
        }
        // Obtain the asynchronous result and perform assertions
    }
    // end::user_guide[]

    private boolean asynchronousResultNotAvailable() {
        return false;
    }

}
