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

public class CarModelAdapter$MyHolder_ViewBinding implements Unbinder {
  private CarModelAdapter.MyHolder target;

  @UiThread
  public CarModelAdapter$MyHolder_ViewBinding(CarModelAdapter.MyHolder target, View source) {
    this.target = target;

    target.tv_car2 = Utils.findRequiredViewAsType(source, R.id.tv_car2, "field 'tv_car2'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CarModelAdapter.MyHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_car2 = null;
  }
}
