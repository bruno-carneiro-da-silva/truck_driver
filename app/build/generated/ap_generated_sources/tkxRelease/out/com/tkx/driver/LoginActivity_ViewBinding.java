// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hbb20.CountryCodePicker;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.ll_back_login = Utils.findRequiredViewAsType(source, R.id.ll_back_login, "field 'll_back_login'", LinearLayout.class);
    target.phone_code = Utils.findRequiredViewAsType(source, R.id.phone_code, "field 'phone_code'", TextView.class);
    target.edt_phone_login = Utils.findRequiredViewAsType(source, R.id.edt_phone_login, "field 'edt_phone_login'", EditText.class);
    target.phone_layout = Utils.findRequiredViewAsType(source, R.id.phone_layout, "field 'phone_layout'", LinearLayout.class);
    target.edt_pass_login = Utils.findRequiredViewAsType(source, R.id.edt_pass_login, "field 'edt_pass_login'", EditText.class);
    target.edt_os = Utils.findRequiredViewAsType(source, R.id.edt_os, "field 'edt_os'", EditText.class);
    target.tv_forgot = Utils.findRequiredViewAsType(source, R.id.tv_forgot, "field 'tv_forgot'", TextView.class);
    target.ll_login = Utils.findRequiredViewAsType(source, R.id.ll_login, "field 'll_login'", CardView.class);
    target.country_code = Utils.findRequiredViewAsType(source, R.id.country_code1, "field 'country_code'", CountryCodePicker.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.root = null;
    target.ll_back_login = null;
    target.phone_code = null;
    target.edt_phone_login = null;
    target.phone_layout = null;
    target.edt_pass_login = null;
    target.edt_os = null;
    target.tv_forgot = null;
    target.ll_login = null;
    target.country_code = null;
  }
}
