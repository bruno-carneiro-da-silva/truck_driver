// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.chooseAddVehicleType;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChooseVehicleType_ViewBinding implements Unbinder {
  private ChooseVehicleType target;

  @UiThread
  public ChooseVehicleType_ViewBinding(ChooseVehicleType target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChooseVehicleType_ViewBinding(ChooseVehicleType target, View source) {
    this.target = target;

    target.btnAddNewVehicle = Utils.findRequiredViewAsType(source, R.id.btnAddNewVehicle, "field 'btnAddNewVehicle'", Button.class);
    target.addExistingVehicle = Utils.findRequiredViewAsType(source, R.id.addExistingVehicle, "field 'addExistingVehicle'", Button.class);
    target.llAddNewVehicleLayout = Utils.findRequiredViewAsType(source, R.id.llAddNewVehicleLayout, "field 'llAddNewVehicleLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChooseVehicleType target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnAddNewVehicle = null;
    target.addExistingVehicle = null;
    target.llAddNewVehicleLayout = null;
  }
}
