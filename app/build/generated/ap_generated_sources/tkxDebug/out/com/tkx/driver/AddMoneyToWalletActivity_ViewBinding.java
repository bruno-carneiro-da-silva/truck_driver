// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddMoneyToWalletActivity_ViewBinding implements Unbinder {
  private AddMoneyToWalletActivity target;

  @UiThread
  public AddMoneyToWalletActivity_ViewBinding(AddMoneyToWalletActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddMoneyToWalletActivity_ViewBinding(AddMoneyToWalletActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.edEnterMoney = Utils.findRequiredViewAsType(source, R.id.ed_enter_money, "field 'edEnterMoney'", EditText.class);
    target.amFirstTxt = Utils.findRequiredViewAsType(source, R.id.am_first_txt, "field 'amFirstTxt'", TextView.class);
    target.amSecondTxt = Utils.findRequiredViewAsType(source, R.id.am_second_txt, "field 'amSecondTxt'", TextView.class);
    target.amThirdTxt = Utils.findRequiredViewAsType(source, R.id.am_third_txt, "field 'amThirdTxt'", TextView.class);
    target.txtAddMoney = Utils.findRequiredViewAsType(source, R.id.txt_add_money, "field 'txtAddMoney'", Button.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddMoneyToWalletActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.edEnterMoney = null;
    target.amFirstTxt = null;
    target.amSecondTxt = null;
    target.amThirdTxt = null;
    target.txtAddMoney = null;
    target.root = null;
  }
}
