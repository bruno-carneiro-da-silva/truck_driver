// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.subscriptionModule;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionModuleList_ViewBinding implements Unbinder {
  private SubscriptionModuleList target;

  @UiThread
  public SubscriptionModuleList_ViewBinding(SubscriptionModuleList target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubscriptionModuleList_ViewBinding(SubscriptionModuleList target, View source) {
    this.target = target;

    target.placeHolderView = Utils.findRequiredViewAsType(source, R.id.placeholder_package_list, "field 'placeHolderView'", PlaceHolderView.class);
    target.placeholder_activate_package = Utils.findRequiredViewAsType(source, R.id.placeholder_activate_package, "field 'placeholder_activate_package'", PlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubscriptionModuleList target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolderView = null;
    target.placeholder_activate_package = null;
  }
}
