
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class TestDuck {

    // Fields used between test methods need to be static
    static Duck d;  // Every test needs a Duck object

    @BeforeEach
    void init() {
	d = new Duck("me");
    }

    @Test
    void testDisplay() {
	// Prep
	PrintStream originalOut = System.out;     // save to restore later
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	
	// Test: method writes to System.out which has been redirected
	d.display();

	// Check results
	System.out.flush();
	String actualOutput = baos.toString();
	String expectedOutput = "I'm a duck named me.\n";
	assertEquals(expectedOutput, actualOutput);

	// Cleanup
	System.setOut(originalOut);
    }

    @Test
    public void testFly() {
	// Prep
	PrintStream originalOut = System.out;     // save to restore later
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// Test: method writes to System.out which has been redirected
	d.fly();

	// Check results
	System.out.flush();
	String actualOutput = baos.toString();
	String expectedOutput = "me is flying!!\n";
	assertEquals(expectedOutput, actualOutput);

	// Cleanup
	System.setOut(originalOut);
    }

    @Test
    public void testQuack() {
	// Prep
	PrintStream originalOut = System.out;     // save to restore later
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// Test: method writes to System.out which has been redirected
	d.quack();

	// Check results
	System.out.flush();
	String actualOutput = baos.toString();
	String expectedOutput = "me says Quack.\n";
	assertEquals(expectedOutput, actualOutput);

	// Cleanup
	System.setOut(originalOut);
    }

    @Test
    public void testSwim() {
	// Prep
	PrintStream originalOut = System.out;     // save to restore later
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);

	// Test: method writes to System.out which has been redirected
	d.swim();

	// Check results
	System.out.flush();
	String actualOutput = baos.toString();
	String expectedOutput = "me's webbed feet a paddlin'...\n";
	assertEquals(expectedOutput, actualOutput);

	// Cleanup
	System.setOut(originalOut);
    }
}
