// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomerSupportActivity_ViewBinding implements Unbinder {
  private CustomerSupportActivity target;

  @UiThread
  public CustomerSupportActivity_ViewBinding(CustomerSupportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CustomerSupportActivity_ViewBinding(CustomerSupportActivity target, View source) {
    this.target = target;

    target.user_name_edt = Utils.findRequiredViewAsType(source, R.id.user_name_edt, "field 'user_name_edt'", EditText.class);
    target.email_edt = Utils.findRequiredViewAsType(source, R.id.email_edt, "field 'email_edt'", EditText.class);
    target.pone_edt = Utils.findRequiredViewAsType(source, R.id.pone_edt, "field 'pone_edt'", EditText.class);
    target.query_edt = Utils.findRequiredViewAsType(source, R.id.query_edt, "field 'query_edt'", EditText.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomerSupportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.user_name_edt = null;
    target.email_edt = null;
    target.pone_edt = null;
    target.query_edt = null;
    target.root = null;
  }
}
