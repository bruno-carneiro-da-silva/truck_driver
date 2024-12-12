// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddEmergencyContactFieldActivity_ViewBinding implements Unbinder {
  private AddEmergencyContactFieldActivity target;

  @UiThread
  public AddEmergencyContactFieldActivity_ViewBinding(AddEmergencyContactFieldActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddEmergencyContactFieldActivity_ViewBinding(AddEmergencyContactFieldActivity target,
      View source) {
    this.target = target;

    target.country_idd = Utils.findRequiredViewAsType(source, R.id.country_id, "field 'country_idd'", TextView.class);
    target.edt_enter_phone = Utils.findRequiredViewAsType(source, R.id.edt_enter_phone, "field 'edt_enter_phone'", EditText.class);
    target.submit_emergency_contact = Utils.findRequiredViewAsType(source, R.id.submit_emergency_contact, "field 'submit_emergency_contact'", Button.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.enter_name = Utils.findRequiredViewAsType(source, R.id.enter_name, "field 'enter_name'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddEmergencyContactFieldActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.country_idd = null;
    target.edt_enter_phone = null;
    target.submit_emergency_contact = null;
    target.back = null;
    target.enter_name = null;
  }
}
