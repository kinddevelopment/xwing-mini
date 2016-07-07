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

abstract class AbstractSecondaryWeaponShipUpgrade extends AbstractShipUpgrade {
  private static final long serialVersionUID = 6882907744745920053L;
  private final FireRange fireRange;
  private final int firePower;

  protected AbstractSecondaryWeaponShipUpgrade(final String name,
                                               final String description,
                                               final int cost,
                                               final boolean discardOnUse,
                                               final int firePower,
                                               final FireRange fireRange) {
    super(name, description, cost, discardOnUse);
    this.firePower = firePower;

    // TODO: Check range to be valid (0-3 is maximum span for range)
    this.fireRange = fireRange;
  }

  public abstract void use();

  public FireRange getFireRange() {
    return fireRange;
  }

  public int getFirePower() {
    return firePower;
  }
}
