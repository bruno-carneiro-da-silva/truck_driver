// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.currentwork;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentPastRides$HolderRideHistoruPast_ViewBinding implements Unbinder {
  private FragmentPastRides.HolderRideHistoruPast target;

  @UiThread
  public FragmentPastRides$HolderRideHistoruPast_ViewBinding(
      FragmentPastRides.HolderRideHistoruPast target, View source) {
    this.target = target;

    target.est_fare = Utils.findRequiredViewAsType(source, R.id.est_fare, "field 'est_fare'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentPastRides.HolderRideHistoruPast target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.est_fare = null;
  }
}
