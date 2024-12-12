// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HolderSubscriptionPackageList_ViewBinding implements Unbinder {
  private HolderSubscriptionPackageList target;

  @UiThread
  public HolderSubscriptionPackageList_ViewBinding(HolderSubscriptionPackageList target,
      View source) {
    this.target = target;

    target.view_details = Utils.findRequiredViewAsType(source, R.id.view_details, "field 'view_details'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HolderSubscriptionPackageList target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.view_details = null;
  }
}
