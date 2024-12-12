// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FareActivity_ViewBinding implements Unbinder {
  private FareActivity target;

  @UiThread
  public FareActivity_ViewBinding(FareActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FareActivity_ViewBinding(FareActivity target, View source) {
    this.target = target;

    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.bottomTextBtn = Utils.findRequiredViewAsType(source, R.id.bottom_text_btn, "field 'bottomTextBtn'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FareActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeholder = null;
    target.swipeRefreshLayout = null;
    target.root = null;
    target.bottomTextBtn = null;
  }
}
