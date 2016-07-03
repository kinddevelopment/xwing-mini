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

/**
 * Represents a range of integers.
 *
 * <p>The range will always include the low and high numbers.
 */
public class Range implements java.io.Serializable {
  private static final long serialVersionUID = 5738841070548255415L;
  private int low;
  private int high;

  public Range(final int low, final int high) {
    this.low = low;
    this.high = high;
  }

  /**
   * Get the minimum number in this range.
   * @return Minimum number in range.
   */
  public int getLow() {
    return low;
  }

  /**
   * Set the minimum number in this range.
   * @param low The new minimum number
   */
  public void setLow(final int low) {
    this.low = low;
  }

  /**
   * Get the maximum number in this range.
   * @return Maximum number in range.
   */
  public int getHigh() {
    return high;
  }

  /**
   * Set the maximum number in this range.
   * @param high The new maximum number
   */
  public void setHigh(final int high) {
    this.high = high;
  }

  /**
   * Check if a number is included in the range.
   * @param number Number to test
   * @return true if the number is included in the range.
   */
  public boolean contains(final int number) {
    return number >= low && number <= high;
  }
}
