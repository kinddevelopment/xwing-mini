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

package com.kinddev.xwing.engine;

import org.junit.Test;

import static org.junit.Assert.*;

public class HealthTest {

  @Test
  public void getHull() throws Exception {
    Health dut = new Health(5, 2);
    assertEquals(5, dut.getHull());
  }

  @Test
  public void getHull_default() throws Exception {
    Health dut = new Health();
    assertEquals(0, dut.getHull());
  }

  @Test
  public void setHull() throws Exception {
    Health dut = new Health();
    assertEquals(0, dut.getHull());
    dut.setHull(11);
    assertEquals(11, dut.getHull());
  }

  @Test
  public void getShield() throws Exception {
    Health dut = new Health(5, 2);
    assertEquals(2, dut.getShield());
  }

  @Test
  public void getShield_default() throws Exception {
    Health dut = new Health();
    assertEquals(0, dut.getShield());
  }

  @Test
  public void setShield() throws Exception {
    Health dut = new Health();
    assertEquals(0, dut.getShield());
    dut.setShield(11);
    assertEquals(11, dut.getShield());
  }

  @Test
  public void decrementHealth_twoHulltwoShield() throws Exception {
    Health dut = new Health(2, 2);
    dut.decrementHealth();
    assertEquals(1, dut.getShield());
    assertEquals(2, dut.getHull());
  }

  @Test
  public void decrementHealth_oneHulloneShield() throws Exception {
    Health dut = new Health(1, 1);
    dut.decrementHealth();
    assertEquals(0, dut.getShield());
    assertEquals(1, dut.getHull());
  }

  @Test
  public void decrementHealth_twoHullzeroShield() throws Exception {
    Health dut = new Health(2, 0);
    dut.decrementHealth();
    assertEquals(0, dut.getShield());
    assertEquals(1, dut.getHull());
  }

  @Test
  public void decrementHealth_zeroHullzeroShield() throws Exception {
    Health dut = new Health(0, 0);
    dut.decrementHealth();
    assertEquals(0, dut.getShield());
    assertEquals(0, dut.getHull());
  }

  @Test
  public void isDead_zeroHullzeroShield() throws Exception {
    Health dut = new Health(0, 0);
    assertTrue(dut.isDead());
  }

  @Test
  public void isDead_oneHullzeroShield() throws Exception {
    Health dut = new Health(1, 0);
    assertFalse(dut.isDead());
  }

  @Test
  public void isDead_zeroHulloneShield() throws Exception {
    Health dut = new Health(0, 1);
    assertFalse(dut.isDead());
  }

  @Test
  public void isDead_oneHulloneShield() throws Exception {
    Health dut = new Health(1, 1);
    assertFalse(dut.isDead());
  }

}