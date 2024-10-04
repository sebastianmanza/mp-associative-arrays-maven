package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Sebastian Manza
 */
public class TestsFromStudent {
  /**
   * Testing very basic uses of get, set, and remove.
   */
  @Test
  public void SebastianManzaTest01() {
    AssociativeArray<String, Integer> testArr = new AssociativeArray<String, Integer>();
    try {
      testArr.set("key1", 0);
    } catch (Exception e) {
      fail("Could not set a value to the key");
    } //try/catch
    try {
      assertEquals(0, testArr.get("key1"), "key did not match expected values");
    } catch (Exception KeyNotFoundException) {
      fail("Could not retrieve proper key");
    } //try/catch
    try {
      testArr.remove("key1");
      assertEquals(0, testArr.size(), "Remove did not work properly");
    } catch (Exception e) {
    } //try/catch
  } //SebastianManzaTest01

  /**
   * Testing working with larger arrays
   */
  @Test
  public void SebastianManzaTest02() {
    AssociativeArray<Integer, Integer> testArr = new AssociativeArray<Integer, Integer>();
    try {
      for (int i = 0; i < 10; i++) {
        testArr.set(i, i);
      } //for
    } catch (Exception e) {
      fail("Could not set the array");
    } //try/catch
    try {
      for (int i = 0; i < 10; i++) {
        assertEquals(Integer.valueOf(i), testArr.get(i), "Did not receive proper value");
      } //for
    } catch (Exception KeyNotFoundException) {
      fail("Could not find Key");
    }//try/catch
  }

  /**
   * Testing if set, get, and size can work properly when a value of null is set as a value corresponding to a key
   */
  @Test
  public void SebastianManzaEdge01() {
    AssociativeArray<String, Integer> testArr = new AssociativeArray<String, Integer>();
    try {
      testArr.set("key", null);
    } catch(Exception e) {
      fail("Could not set a key with a null value");
    } //try/catch
    try {
      assertEquals(null, testArr.get("key"), "key did not match expected value: null");
    } catch(Exception KeyNotFoundException) {
      fail("Value at key could not be found");
    } //try/catch
    assertEquals(1, testArr.size(), "Array not expected size");
  } // SebastianManzaEdge01
} // class TestsFromStudent
