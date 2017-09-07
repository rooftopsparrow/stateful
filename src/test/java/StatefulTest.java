import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StatefulTest extends TestCase {

  public StatefulTest(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite( StatefulTest.class );
  }

  public void testAccessors() {
    Stateful s = new Stateful("foo", 27, true);
    assertEquals("foo", s.text());
    assertEquals(27, s.number());
    assertTrue(s.truth());
  }

  public void testFlip() {
    Stateful s = new Stateful();
    assertFalse(s.truth());
    s.flip();
    assertTrue(s.truth());
  }

  public void testPlainConstructor() {
    Stateful s = new Stateful();
    assertEquals("", s.text());
    assertEquals(0, s.number());
    assertFalse(s.truth());
  }

  public void testToString() {
    Stateful s = new Stateful("hello", 7, true);
    assertEquals("toString is not the same", "Stateful[true, 7, \"hello\"]", s.toString());
  }
}
