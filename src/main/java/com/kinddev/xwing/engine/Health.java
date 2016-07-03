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

/**
 * Represents the health of a ship.
 *
 * <p>Has two properties hull and shield.
 */
public class Health implements java.io.Serializable {
  private static final long serialVersionUID = -5499165532329424906L;
  private int hull;
  private int shield;

  public Health() {
    this(0, 0);
  }

  public Health(final int hull, final int shield) {
    this.hull = hull;
    this.shield = shield;
  }

  public int getHull() {
    return hull;
  }

  public void setHull(final int hull) {
    this.hull = hull;
  }

  public int getShield() {
    return shield;
  }

  public void setShield(final int shield) {
    this.shield = shield;
  }

  /**
   * Decrement the health when the ship has been hit.
   * If there are any shield left it is decremented before the hull is.
   */
  public void decrementHealth() {
    if (isDead()) {
      return;
    }

    if (shield > 0) {
      shield--;
    } else {
      hull--;
    }
  }

  /**
   * See if the both hull and shield is zero.
   * @return true if hull and shield is zero.
   */
  public boolean isDead() {
    return hull == 0 && shield == 0;
  }
}
