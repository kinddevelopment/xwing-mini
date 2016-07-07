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
 * Represents a ship's or upgrade's firing range.
 */
public class FireRange extends IntegerRange {
  private static final long serialVersionUID = 5976480213627896620L;

  public FireRange(final int low, final int high) {
    super(low, high);
  }

  public static final int LOWEST_RANGE = 0;
  public static final int HIGHEST_RANGE = 3;

  @Override
  void validateLow(final int low) throws IllegalArgumentException {
    if (low < LOWEST_RANGE || low > HIGHEST_RANGE) {
      throw new IllegalArgumentException(
          "Low value must be larger than LOWEST_RANGE and smaller than HIGHEST_RANGE.");
    }
  }

  @Override
  void validateHigh(final int high) throws IllegalArgumentException {
    if (high < LOWEST_RANGE || high > HIGHEST_RANGE) {
      throw new IllegalArgumentException(
          "High value must be larger than LOWEST_RANGE and smaller than HIGHEST_RANGE.");
    }
  }

}
