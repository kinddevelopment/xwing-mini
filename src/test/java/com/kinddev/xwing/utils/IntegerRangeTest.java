/**
 * Copyright 2016 The xwing-mini project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kinddev.xwing.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerRangeTest {
  @Test(expected=IllegalArgumentException.class)
  public void creation_lowLargerThanHigh() throws Exception {
    IntegerRange dut = new IntegerRange(4, 2);
  }

  @Test
  public void creation_lowEqualsHigh() throws Exception {
    IntegerRange dut = new IntegerRange(4, 4);
  }

  @Test
  public void getLow() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertEquals(2, dut.getLow());
  }

  @Test
  public void setLow() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertEquals(2, dut.getLow());
    dut.setLow(3);
    assertEquals(3, dut.getLow());
  }

  @Test
  public void getHigh() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertEquals(4, dut.getHigh());
  }

  @Test
  public void setHigh() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertEquals(4, dut.getHigh());
    dut.setHigh(3);
    assertEquals(3, dut.getHigh());
  }

  @Test
  public void contains_contained() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertTrue(dut.contains(3));
  }

  @Test
  public void contains_below() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertFalse(dut.contains(1));
  }

  @Test
  public void contains_above() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertFalse(dut.contains(5));
  }

  @Test
  public void contains_onLow() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertTrue(dut.contains(2));
  }

  @Test
  public void contains_onHigh() throws Exception {
    IntegerRange dut = new IntegerRange(2, 4);
    assertTrue(dut.contains(4));
  }

  @Test
  public void equalsTest_equal() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    IntegerRange dut2 = new IntegerRange(2, 4);
    assertTrue(dut1.equals(dut2));
  }

  @Test
  public void equalsTest_same() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    assertTrue(dut1.equals(dut1));
  }

  @Test
  public void equalsTest_highDiffer() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    IntegerRange dut2 = new IntegerRange(2, 5);
    assertFalse(dut1.equals(dut2));
  }

  @Test
  public void equalsTest_lowDiffer() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    IntegerRange dut2 = new IntegerRange(3, 4);
    assertFalse(dut1.equals(dut2));
  }

  @Test
  public void equalsTest_null() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    assertFalse(dut1.equals(null));
  }

  @Test
  public void hashCodeTest_equal() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    IntegerRange dut2 = new IntegerRange(2, 4);
    assertEquals(dut1.hashCode(), dut2.hashCode());
  }

  @Test
  public void hashCodeTest_notEqual() throws Exception {
    IntegerRange dut1 = new IntegerRange(2, 4);
    IntegerRange dut2 = new IntegerRange(2, 2);
    assertNotEquals(dut1.hashCode(), dut2.hashCode());
  }

}