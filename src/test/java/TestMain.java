import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testMain() {
        Assertions.assertEquals("Hello, Jenkins!", Main.getHelloMessage());
    }
    @Test
    public void testMainWrong() {
        assertEquals("Hello, Jenkins!", Main.getHelloMessageWrong());
    }
}

