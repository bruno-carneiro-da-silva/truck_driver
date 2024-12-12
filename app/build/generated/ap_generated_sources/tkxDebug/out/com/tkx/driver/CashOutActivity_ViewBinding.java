// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CashOutActivity_ViewBinding implements Unbinder {
  private CashOutActivity target;

  @UiThread
  public CashOutActivity_ViewBinding(CashOutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CashOutActivity_ViewBinding(CashOutActivity target, View source) {
    this.target = target;

    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.ed_enter_money = Utils.findRequiredViewAsType(source, R.id.ed_enter_money, "field 'ed_enter_money'", EditText.class);
    target.txt_add_money = Utils.findRequiredViewAsType(source, R.id.txt_add_money, "field 'txt_add_money'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CashOutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeholder = null;
    target.back = null;
    target.root = null;
    target.ed_enter_money = null;
    target.txt_add_money = null;
  }
}
