/*
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.dfg.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

public class DeviceFragmentPagerAdapter extends FragmentStatePagerAdapter {

  private final int count;

  public DeviceFragmentPagerAdapter(FragmentManager fm, int count) {
    super(fm);
    this.count = count;
  }

  @Override
  public Fragment getItem(int position) {
    return DeviceFragment.newInstance(position);
  }

  @Override
  public int getCount() {
    return count;
  }
}
