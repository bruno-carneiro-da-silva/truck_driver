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

public class UpdatePasswordActivity_ViewBinding implements Unbinder {
  private UpdatePasswordActivity target;

  @UiThread
  public UpdatePasswordActivity_ViewBinding(UpdatePasswordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UpdatePasswordActivity_ViewBinding(UpdatePasswordActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", LinearLayout.class);
    target.newPassEdt = Utils.findRequiredViewAsType(source, R.id.new_pass_edt, "field 'newPassEdt'", EditText.class);
    target.confirmPassEdt = Utils.findRequiredViewAsType(source, R.id.confirm_pass_edt, "field 'confirmPassEdt'", EditText.class);
    target.llDoneChangePassword = Utils.findRequiredViewAsType(source, R.id.ll_done_change_password, "field 'llDoneChangePassword'", CardView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UpdatePasswordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.newPassEdt = null;
    target.confirmPassEdt = null;
    target.llDoneChangePassword = null;
    target.root = null;
  }
}
