// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EmergencyContatcsActivity_ViewBinding implements Unbinder {
  private EmergencyContatcsActivity target;

  @UiThread
  public EmergencyContatcsActivity_ViewBinding(EmergencyContatcsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EmergencyContatcsActivity_ViewBinding(EmergencyContatcsActivity target, View source) {
    this.target = target;

    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.placeholder_emergency_contacts, "field 'placeHolder'", PlaceHolderView.class);
    target.add_new_contact = Utils.findRequiredViewAsType(source, R.id.add_new_contact, "field 'add_new_contact'", Button.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EmergencyContatcsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolder = null;
    target.add_new_contact = null;
    target.back = null;
  }
}
