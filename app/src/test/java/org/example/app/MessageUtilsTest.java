package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MessageUtilsTest {

  @Test
  void test_ConflictingClass_fromTest_shouldNotBeEqual() {
    var conflict = new ConflictingClass();

    assertNotEquals("test", conflict.getMessage());
  }

  @Test
  void test_ConflictingClass_fromTestFixtures_shouldBeEqual() {
    var conflict = new ConflictingClass();

    assertEquals("testFixtures", conflict.getMessage());
  }
}
