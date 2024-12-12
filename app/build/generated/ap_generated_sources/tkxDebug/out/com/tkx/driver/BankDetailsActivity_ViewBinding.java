// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BankDetailsActivity_ViewBinding implements Unbinder {
  private BankDetailsActivity target;

  @UiThread
  public BankDetailsActivity_ViewBinding(BankDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BankDetailsActivity_ViewBinding(BankDetailsActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.bankName = Utils.findRequiredViewAsType(source, R.id.bank_name, "field 'bankName'", EditText.class);
    target.bankAccountName = Utils.findRequiredViewAsType(source, R.id.bank_account_name, "field 'bankAccountName'", EditText.class);
    target.bankAccountNumber = Utils.findRequiredViewAsType(source, R.id.bank_Account_number, "field 'bankAccountNumber'", EditText.class);
    target.hint_iFC = Utils.findRequiredViewAsType(source, R.id.bank_ifsc_code, "field 'hint_iFC'", TextInputLayout.class);
    target.bankIFSCode = Utils.findRequiredViewAsType(source, R.id.ifc_edittext, "field 'bankIFSCode'", EditText.class);
    target.submit = Utils.findRequiredViewAsType(source, R.id.submit, "field 'submit'", TextView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.accounTypeSpinner = Utils.findRequiredViewAsType(source, R.id.accounttype_spinner, "field 'accounTypeSpinner'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BankDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.bankName = null;
    target.bankAccountName = null;
    target.bankAccountNumber = null;
    target.hint_iFC = null;
    target.bankIFSCode = null;
    target.submit = null;
    target.root = null;
    target.accounTypeSpinner = null;
  }
}
