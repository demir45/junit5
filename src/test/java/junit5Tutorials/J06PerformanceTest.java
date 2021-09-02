package junit5Tutorials;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06PerformanceTest {
    @Test
    void performance(){
        assertTimeout(Duration.ofSeconds(1), () -> IntStream.rangeClosed(0, 100000).
                forEach(System.out::print));
    }
}