// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.earnings;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WeeklyStatementActivity_ViewBinding implements Unbinder {
  private WeeklyStatementActivity target;

  @UiThread
  public WeeklyStatementActivity_ViewBinding(WeeklyStatementActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WeeklyStatementActivity_ViewBinding(WeeklyStatementActivity target, View source) {
    this.target = target;

    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.place_holder, "field 'placeHolder'", PlaceHolderView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WeeklyStatementActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolder = null;
    target.root = null;
    target.swiperefreshLayout = null;
    target.back = null;
  }
}
