// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationActivity_ViewBinding implements Unbinder {
  private NotificationActivity target;

  @UiThread
  public NotificationActivity_ViewBinding(NotificationActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NotificationActivity_ViewBinding(NotificationActivity target, View source) {
    this.target = target;

    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.placeHolder, "field 'placeHolder'", PlaceHolderView.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", LinearLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolder = null;
    target.back = null;
    target.root = null;
    target.swiperefreshLayout = null;
  }
}
