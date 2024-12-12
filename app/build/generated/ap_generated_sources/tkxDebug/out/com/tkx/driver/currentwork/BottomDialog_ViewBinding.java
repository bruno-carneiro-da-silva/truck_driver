// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.currentwork;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BottomDialog_ViewBinding implements Unbinder {
  private BottomDialog target;

  @UiThread
  public BottomDialog_ViewBinding(BottomDialog target, View source) {
    this.target = target;

    target.ok = Utils.findRequiredViewAsType(source, R.id.ok, "field 'ok'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BottomDialog target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ok = null;
  }
}
