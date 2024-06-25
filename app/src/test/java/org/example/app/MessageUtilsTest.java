package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.utilities.StringUtils;
import org.junit.jupiter.api.Test;

class MessageUtilsTest {
  @Test
  void testGetMessage() {
    assertEquals("Hello      World!", MessageUtils.getMessage());
  }

  @Test
  void testConflictingClass() {
      var t = new ConflictingClass();
      System.out.println("testConflictingClass");
      System.out.println(t.getMessage());
      
    assertEquals("wrong message", t.getMessage());
  }

  @Test
  void testWithStringUtils() {
    assertEquals("test", StringUtils.test());
  }
}
