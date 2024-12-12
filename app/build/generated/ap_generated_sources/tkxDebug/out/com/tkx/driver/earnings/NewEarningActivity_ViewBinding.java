// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.earnings;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewEarningActivity_ViewBinding implements Unbinder {
  private NewEarningActivity target;

  @UiThread
  public NewEarningActivity_ViewBinding(NewEarningActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewEarningActivity_ViewBinding(NewEarningActivity target, View source) {
    this.target = target;

    target.placeHoder = Utils.findRequiredViewAsType(source, R.id.placeHoder, "field 'placeHoder'", PlaceHolderView.class);
    target.rightClick = Utils.findRequiredViewAsType(source, R.id.rightClick, "field 'rightClick'", LinearLayout.class);
    target.leftClick = Utils.findRequiredViewAsType(source, R.id.leftClick, "field 'leftClick'", LinearLayout.class);
    target.selectedDate = Utils.findRequiredViewAsType(source, R.id.selectedDate, "field 'selectedDate'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewEarningActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHoder = null;
    target.rightClick = null;
    target.leftClick = null;
    target.selectedDate = null;
  }
}
