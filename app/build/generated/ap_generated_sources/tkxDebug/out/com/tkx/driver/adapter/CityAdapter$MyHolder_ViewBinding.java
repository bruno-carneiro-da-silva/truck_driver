// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CityAdapter$MyHolder_ViewBinding implements Unbinder {
  private CityAdapter.MyHolder target;

  @UiThread
  public CityAdapter$MyHolder_ViewBinding(CityAdapter.MyHolder target, View source) {
    this.target = target;

    target.tv_city1 = Utils.findRequiredViewAsType(source, R.id.tv_city1, "field 'tv_city1'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CityAdapter.MyHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_city1 = null;
  }
}
