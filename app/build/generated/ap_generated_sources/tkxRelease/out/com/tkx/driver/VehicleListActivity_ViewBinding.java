// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VehicleListActivity_ViewBinding implements Unbinder {
  private VehicleListActivity target;

  @UiThread
  public VehicleListActivity_ViewBinding(VehicleListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VehicleListActivity_ViewBinding(VehicleListActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.placeHolder = Utils.findRequiredViewAsType(source, R.id.placeHolder, "field 'placeHolder'", PlaceHolderView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.tvManageVehicle = Utils.findRequiredViewAsType(source, R.id.tvManageVehicle, "field 'tvManageVehicle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VehicleListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.placeHolder = null;
    target.root = null;
    target.swipeRefreshLayout = null;
    target.tvManageVehicle = null;
  }
}
