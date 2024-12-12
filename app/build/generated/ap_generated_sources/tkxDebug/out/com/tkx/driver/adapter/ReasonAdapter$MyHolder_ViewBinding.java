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

public class ReasonAdapter$MyHolder_ViewBinding implements Unbinder {
  private ReasonAdapter.MyHolder target;

  @UiThread
  public ReasonAdapter$MyHolder_ViewBinding(ReasonAdapter.MyHolder target, View source) {
    this.target = target;

    target.tv_reason = Utils.findRequiredViewAsType(source, R.id.tv_reason, "field 'tv_reason'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReasonAdapter.MyHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_reason = null;
  }
}
