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

abstract class AbstractShipUpgrade implements java.io.Serializable {
  private static final long serialVersionUID = -485788349614178131L;
  private final boolean discardOnUse;
  private final String name;
  private final String description;
  private final int cost;

  public abstract void use();

  protected AbstractShipUpgrade(final String name,
                                final String description,
                                final int cost,
                                final boolean discardOnUse) {
    this.discardOnUse = discardOnUse;
    this.name = name;
    this.description = description;
    this.cost = cost;
  }

  public boolean shouldBeDiscardOnUse() {
    return discardOnUse;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getCost() {
    return cost;
  }
}
