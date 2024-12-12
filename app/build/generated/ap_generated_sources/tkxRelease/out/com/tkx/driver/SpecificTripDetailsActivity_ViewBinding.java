// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

public class SpecificTripDetailsActivity_ViewBinding implements Unbinder {
  private SpecificTripDetailsActivity target;

  @UiThread
  public SpecificTripDetailsActivity_ViewBinding(SpecificTripDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SpecificTripDetailsActivity_ViewBinding(SpecificTripDetailsActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.swiperefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swiperefreshLayout'", SwipeRefreshLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.bottomText = Utils.findRequiredViewAsType(source, R.id.bottom_text, "field 'bottomText'", TextView.class);
    target.cancel_btn_triphistory = Utils.findRequiredViewAsType(source, R.id.cancel_btn_triphistory, "field 'cancel_btn_triphistory'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SpecificTripDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeholder = null;
    target.swiperefreshLayout = null;
    target.root = null;
    target.bottomText = null;
    target.cancel_btn_triphistory = null;
  }
}
