// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.currentwork;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentActiveRides_ViewBinding implements Unbinder {
  private FragmentActiveRides target;

  @UiThread
  public FragmentActiveRides_ViewBinding(FragmentActiveRides target, View source) {
    this.target = target;

    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.place_holder, "field 'placeHolder'", PlaceHolderView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentActiveRides target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.placeHolder = null;
  }
}
