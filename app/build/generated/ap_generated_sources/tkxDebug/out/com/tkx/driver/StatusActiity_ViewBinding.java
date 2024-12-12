// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import customviews.typefacesviews.TypefaceDosisRegular;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StatusActiity_ViewBinding implements Unbinder {
  private StatusActiity target;

  @UiThread
  public StatusActiity_ViewBinding(StatusActiity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StatusActiity_ViewBinding(StatusActiity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", RelativeLayout.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.message = Utils.findRequiredViewAsType(source, R.id.message, "field 'message'", TypefaceDosisRegular.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StatusActiity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.image = null;
    target.message = null;
  }
}
