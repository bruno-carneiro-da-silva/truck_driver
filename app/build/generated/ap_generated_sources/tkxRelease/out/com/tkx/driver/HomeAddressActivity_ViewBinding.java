// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeAddressActivity_ViewBinding implements Unbinder {
  private HomeAddressActivity target;

  @UiThread
  public HomeAddressActivity_ViewBinding(HomeAddressActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeAddressActivity_ViewBinding(HomeAddressActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.addressText = Utils.findRequiredViewAsType(source, R.id.address_text, "field 'addressText'", TextView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.editImage = Utils.findRequiredViewAsType(source, R.id.edit_image, "field 'editImage'", ImageView.class);
    target.button = Utils.findRequiredViewAsType(source, R.id.button, "field 'button'", TextView.class);
    target.ll_set_home_sddress = Utils.findRequiredViewAsType(source, R.id.ll_set_home_sddress, "field 'll_set_home_sddress'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeAddressActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.addressText = null;
    target.root = null;
    target.editImage = null;
    target.button = null;
    target.ll_set_home_sddress = null;
  }
}
