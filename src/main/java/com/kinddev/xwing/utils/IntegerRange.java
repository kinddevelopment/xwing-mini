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
public class IntegerRange implements java.io.Serializable {
  private static final long serialVersionUID = 5738841070548255415L;
  private int low;
  private int high;

  /**
   * Creates a new instance of IntegerRange.
   * @param low The lower limit of the range
   * @param high The higher limit of the range
   */
  public IntegerRange(final int low, final int high) {
    validateLow(low);
    validateHigh(high);
    validateRange(low, high);

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
   * @throws IllegalArgumentException if the minimum number is out of range
   */
  public void setLow(final int low) throws IllegalArgumentException {
    // Thows an exception if validation fails
    validateLow(low);
    validateRange(low, this.high);

    this.low = low;
  }

  /**
   * * Check that the new low value is valid.
   * Default implementation allows all inputs.
   * @param low Value to check
   * @throws IllegalArgumentException if value is out of range
   */
  void validateLow(final int low) throws IllegalArgumentException {
    // Allow all input so don't throw any excpetion
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
   * @throws IllegalArgumentException if the maximum number is out of range
   */
  public void setHigh(final int high) throws IllegalArgumentException {
    // Thows an exception if validation fails
    validateHigh(high);
    validateRange(this.low, high);

    this.high = high;
  }

  /**
   * Check that the new high value is valid.
   * Default implementation allows all inputs.
   * @param high Value to check
   * @throws IllegalArgumentException if value is out of range
   */
  void validateHigh(final int high) throws IllegalArgumentException {
    // Allow all input so don't throw any excpetion
  }

  private void validateRange(final int low, final int high) throws IllegalArgumentException {
    if (low > high) {
      throw new IllegalArgumentException(
          "The low value must be smaller or equal to the high value.");
    }
  }

  /**
   * Check if a number is included in the range.
   * @param number Number to test
   * @return true if the number is included in the range.
   */
  public boolean contains(final int number) {
    return number >= low && number <= high;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    final IntegerRange that = (IntegerRange) obj;

    return getLow() == that.getLow() && getHigh() == that.getHigh();
  }

  @Override
  public int hashCode() {
    int result = getLow();
    result = 31 * result + getHigh();
    return result;
  }
}

// TODO: Test serialization