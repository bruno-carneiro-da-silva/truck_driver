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

public class OutStationUpcomingFragment_ViewBinding implements Unbinder {
  private OutStationUpcomingFragment target;

  @UiThread
  public OutStationUpcomingFragment_ViewBinding(OutStationUpcomingFragment target, View source) {
    this.target = target;

    target.no_record_outstation = Utils.findRequiredViewAsType(source, R.id.no_record_found, "field 'no_record_outstation'", TextView.class);
    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeHolder'", PlaceHolderView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", FrameLayout.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swiperefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OutStationUpcomingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.no_record_outstation = null;
    target.placeHolder = null;
    target.root = null;
    target.swipeRefreshLayout = null;
  }
}
