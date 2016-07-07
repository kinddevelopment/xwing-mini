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

public class FireRangeTest {
  @Test(expected=IllegalArgumentException.class)
  public void validateLow_below() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE - 1, FireRange.HIGHEST_RANGE);
  }

  public void validateLow_on() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE, FireRange.HIGHEST_RANGE);
  }

  public void validateLow_above() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE + 1, FireRange.HIGHEST_RANGE);
  }

  @Test
  public void validateHigh_below() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE, FireRange.HIGHEST_RANGE - 1);
  }

  @Test
  public void validateHigh_on() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE, FireRange.HIGHEST_RANGE);
  }

  @Test(expected=IllegalArgumentException.class)
  public void validateHigh_above() throws Exception {
    FireRange dut = new FireRange(FireRange.LOWEST_RANGE, FireRange.HIGHEST_RANGE + 1);
  }

}