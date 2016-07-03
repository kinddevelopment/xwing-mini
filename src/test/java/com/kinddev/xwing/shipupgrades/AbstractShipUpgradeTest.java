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

package com.kinddev.xwing.shipupgrades;

import org.junit.Test;

import static org.junit.Assert.*;

class TestableShipUpgrade extends AbstractShipUpgrade {
  public TestableShipUpgrade(final String name,
                             final String description,
                             final int cost,
                             final boolean discardOnUse) {
    super(name, description, cost, discardOnUse);
  }

  @Override
  public void use() {

  }
}

public class AbstractShipUpgradeTest {

  @Test
  public void shouldBeDiscardOnUse_yes() throws Exception {
    TestableShipUpgrade dut = new TestableShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        true);
    assertEquals(true, dut.shouldBeDiscardOnUse());
  }

  @Test
  public void shouldBeDiscardOnUse_no() throws Exception {
    TestableShipUpgrade dut = new TestableShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        false);
    assertEquals(false, dut.shouldBeDiscardOnUse());
  }

  @Test
  public void getName() throws Exception {
    TestableShipUpgrade dut = new TestableShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        false);
    assertEquals("Test upgrade", dut.getName());
  }

  @Test
  public void getDescription() throws Exception {
    TestableShipUpgrade dut = new TestableShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        false);
    assertEquals("This is a test upgrade", dut.getDescription());
  }

  @Test
  public void getCost() throws Exception {
    TestableShipUpgrade dut = new TestableShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        false);
    assertEquals(5, dut.getCost());
  }
}