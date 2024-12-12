// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
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

public class SetRadiusActivity_ViewBinding implements Unbinder {
  private SetRadiusActivity target;

  @UiThread
  public SetRadiusActivity_ViewBinding(SetRadiusActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SetRadiusActivity_ViewBinding(SetRadiusActivity target, View source) {
    this.target = target;

    target.ll_get_started = Utils.findRequiredViewAsType(source, R.id.ll_get_started, "field 'll_get_started'", LinearLayout.class);
    target.ll_radius_intro = Utils.findRequiredViewAsType(source, R.id.ll_radius_intro, "field 'll_radius_intro'", LinearLayout.class);
    target.txt_address = Utils.findRequiredViewAsType(source, R.id.txt_address, "field 'txt_address'", TextView.class);
    target.iv_back = Utils.findRequiredViewAsType(source, R.id.iv_back, "field 'iv_back'", ImageView.class);
    target.et_radius = Utils.findRequiredViewAsType(source, R.id.et_radius, "field 'et_radius'", EditText.class);
    target.submit = Utils.findRequiredViewAsType(source, R.id.submit, "field 'submit'", LinearLayout.class);
    target.rl_map = Utils.findRequiredViewAsType(source, R.id.rl_map, "field 'rl_map'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SetRadiusActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ll_get_started = null;
    target.ll_radius_intro = null;
    target.txt_address = null;
    target.iv_back = null;
    target.et_radius = null;
    target.submit = null;
    target.rl_map = null;
  }
}
