// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePasswordActivity_ViewBinding implements Unbinder {
  private ChangePasswordActivity target;

  @UiThread
  public ChangePasswordActivity_ViewBinding(ChangePasswordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePasswordActivity_ViewBinding(ChangePasswordActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.ll_back_change_password, "field 'back'", LinearLayout.class);
    target.edtOldPass = Utils.findRequiredViewAsType(source, R.id.edt_o_pass, "field 'edtOldPass'", EditText.class);
    target.edtNewPass = Utils.findRequiredViewAsType(source, R.id.edt_n_pass, "field 'edtNewPass'", EditText.class);
    target.edtConfirmPass = Utils.findRequiredViewAsType(source, R.id.edt_c_pass, "field 'edtConfirmPass'", EditText.class);
    target.doneButton = Utils.findRequiredViewAsType(source, R.id.ll_done_change_password, "field 'doneButton'", CardView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangePasswordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.edtOldPass = null;
    target.edtNewPass = null;
    target.edtConfirmPass = null;
    target.doneButton = null;
    target.root = null;
  }
}
