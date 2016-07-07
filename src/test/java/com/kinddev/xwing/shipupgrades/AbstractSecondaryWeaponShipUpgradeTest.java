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

import com.kinddev.xwing.utils.FireRange;
import org.junit.Test;

import static org.junit.Assert.*;

class TestableSecondaryWeaponShipUpgrade extends AbstractSecondaryWeaponShipUpgrade {
  public TestableSecondaryWeaponShipUpgrade(final String name,
                                            final String description,
                                            final int cost,
                                            final boolean discardOnUse,
                                            final int firePower,
                                            final FireRange fireRange) {
    super(name, description, cost, discardOnUse, firePower, fireRange);
  }

  @Override
  public void use() {

  }
}

public class AbstractSecondaryWeaponShipUpgradeTest {

  @Test
  public void getFireRange() throws Exception {
    TestableSecondaryWeaponShipUpgrade dut = new TestableSecondaryWeaponShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        true,
        3,
        new FireRange(2, 3));
    assertFalse(dut.getFireRange().contains(1));
    assertTrue(dut.getFireRange().contains(2));
    assertTrue(dut.getFireRange().contains(3));
    assertFalse(dut.getFireRange().contains(4));
  }

  @Test
  public void getFirePower() throws Exception {
    TestableSecondaryWeaponShipUpgrade dut = new TestableSecondaryWeaponShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        5,
        true,
        3,
        new FireRange(2, 3));
    assertEquals(3, dut.getFirePower());
  }

  @Test
  public void getCost() throws Exception {
    TestableSecondaryWeaponShipUpgrade dut = new TestableSecondaryWeaponShipUpgrade(
        "Test upgrade",
        "This is a test upgrade",
        7,
        true,
        3,
        new FireRange(2, 3));
    assertEquals(7, dut.getCost());
  }
}
// TODO: Test serialization