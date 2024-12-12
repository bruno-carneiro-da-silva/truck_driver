// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OnlineOfflineActivity_ViewBinding implements Unbinder {
  private OnlineOfflineActivity target;

  @UiThread
  public OnlineOfflineActivity_ViewBinding(OnlineOfflineActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OnlineOfflineActivity_ViewBinding(OnlineOfflineActivity target, View source) {
    this.target = target;

    target.close_btn = Utils.findRequiredViewAsType(source, R.id.close_btn, "field 'close_btn'", RelativeLayout.class);
    target.status_description_txt = Utils.findRequiredViewAsType(source, R.id.status_description_txt, "field 'status_description_txt'", TextView.class);
    target.status__txt = Utils.findRequiredViewAsType(source, R.id.status__txt, "field 'status__txt'", TextView.class);
    target.status_image = Utils.findRequiredViewAsType(source, R.id.status_image, "field 'status_image'", ImageView.class);
    target.status_btn = Utils.findRequiredViewAsType(source, R.id.status_btn, "field 'status_btn'", LinearLayout.class);
    target.btn_txt = Utils.findRequiredViewAsType(source, R.id.btn_txt, "field 'btn_txt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OnlineOfflineActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.close_btn = null;
    target.status_description_txt = null;
    target.status__txt = null;
    target.status_image = null;
    target.status_btn = null;
    target.btn_txt = null;
  }
}
