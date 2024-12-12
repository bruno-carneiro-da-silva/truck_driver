// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.rating_module.rating_holders;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DailyRaing_selectdate_ViewBinding implements Unbinder {
  private DailyRaing_selectdate target;

  @UiThread
  public DailyRaing_selectdate_ViewBinding(DailyRaing_selectdate target, View source) {
    this.target = target;

    target.select_date_txt = Utils.findRequiredViewAsType(source, R.id.select_date_txt, "field 'select_date_txt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DailyRaing_selectdate target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.select_date_txt = null;
  }
}
