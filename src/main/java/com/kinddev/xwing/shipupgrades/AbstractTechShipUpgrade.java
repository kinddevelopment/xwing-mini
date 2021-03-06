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

abstract class AbstractTechShipUpgrade extends AbstractShipUpgrade {
  private static final long serialVersionUID = -5787768213767354560L;

  protected AbstractTechShipUpgrade(final String name,
                                    final String description,
                                    final int cost,
                                    final boolean discardOnUse) {
    super(name, description, cost, discardOnUse);
  }

  public abstract void use();
}
