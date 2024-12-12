// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EarningActivity_ViewBinding implements Unbinder {
  private EarningActivity target;

  @UiThread
  public EarningActivity_ViewBinding(EarningActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EarningActivity_ViewBinding(EarningActivity target, View source) {
    this.target = target;

    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EarningActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeholder = null;
    target.swiperefreshLayout = null;
    target.root = null;
    target.back = null;
  }
}
