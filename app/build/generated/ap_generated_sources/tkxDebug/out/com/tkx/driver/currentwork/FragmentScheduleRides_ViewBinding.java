// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.currentwork;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentScheduleRides_ViewBinding implements Unbinder {
  private FragmentScheduleRides target;

  @UiThread
  public FragmentScheduleRides_ViewBinding(FragmentScheduleRides target, View source) {
    this.target = target;

    target.no_record_schedule = Utils.findRequiredViewAsType(source, R.id.no_record_trips, "field 'no_record_schedule'", TextView.class);
    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.place_holder, "field 'placeHolder'", PlaceHolderView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", FrameLayout.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentScheduleRides target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.no_record_schedule = null;
    target.placeHolder = null;
    target.root = null;
    target.swipeRefreshLayout = null;
  }
}
