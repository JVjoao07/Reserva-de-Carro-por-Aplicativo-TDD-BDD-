import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertTrue(classUnderTest.getGreeting().length() > 0);
    }
}