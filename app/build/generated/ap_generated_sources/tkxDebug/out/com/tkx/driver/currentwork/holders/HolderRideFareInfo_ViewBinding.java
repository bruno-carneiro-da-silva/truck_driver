// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.currentwork.holders;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HolderRideFareInfo_ViewBinding implements Unbinder {
  private HolderRideFareInfo target;

  @UiThread
  public HolderRideFareInfo_ViewBinding(HolderRideFareInfo target, View source) {
    this.target = target;

    target.vehicleImage = Utils.findRequiredViewAsType(source, R.id.vehicle_image, "field 'vehicleImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HolderRideFareInfo target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vehicleImage = null;
  }
}
