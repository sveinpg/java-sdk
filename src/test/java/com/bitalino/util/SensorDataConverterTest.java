/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.bitalino.util;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SensorDataConverterTest {

  @Test
  public void test_emg_conversion() {
    assertEquals(SensorDataConverter.scaleEMG(0, 0), -1.65);
    assertEquals(SensorDataConverter.scaleEMG(0, 1023), 1.65);
  }

  @Test
  public void test_ecg_conversion() {
    assertEquals(SensorDataConverter.scaleECG(0, 0), 0.0);
    assertEquals(SensorDataConverter.scaleECG(0, 1023), 3.0);
  }

  @Test
  public void test_eda_conversion() {
    assertEquals(SensorDataConverter.scaleEDA(0, 0), 0.0);
    assertEquals(SensorDataConverter.scaleEDA(0, 1023), 1.055);
  }

  @Test
  public void test_luminosity_conversion() {
    assertEquals(SensorDataConverter.scaleLuminosity(0, 0), 0.0);
    assertEquals(SensorDataConverter.scaleLuminosity(0, 1023), 100.0);
  }

}