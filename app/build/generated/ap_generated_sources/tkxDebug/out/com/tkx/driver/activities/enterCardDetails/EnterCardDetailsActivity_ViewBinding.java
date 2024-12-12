// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.enterCardDetails;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EnterCardDetailsActivity_ViewBinding implements Unbinder {
  private EnterCardDetailsActivity target;

  @UiThread
  public EnterCardDetailsActivity_ViewBinding(EnterCardDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EnterCardDetailsActivity_ViewBinding(EnterCardDetailsActivity target, View source) {
    this.target = target;

    target.edt_card_number = Utils.findRequiredViewAsType(source, R.id.edt_card_number, "field 'edt_card_number'", EditText.class);
    target.date_edit = Utils.findRequiredViewAsType(source, R.id.date_edit, "field 'date_edit'", EditText.class);
    target.cvv_edit = Utils.findRequiredViewAsType(source, R.id.cvv_edit, "field 'cvv_edit'", EditText.class);
    target.btnNext = Utils.findRequiredViewAsType(source, R.id.btnNext, "field 'btnNext'", Button.class);
    target.llBack = Utils.findRequiredViewAsType(source, R.id.llBack, "field 'llBack'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EnterCardDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edt_card_number = null;
    target.date_edit = null;
    target.cvv_edit = null;
    target.btnNext = null;
    target.llBack = null;
  }
}
