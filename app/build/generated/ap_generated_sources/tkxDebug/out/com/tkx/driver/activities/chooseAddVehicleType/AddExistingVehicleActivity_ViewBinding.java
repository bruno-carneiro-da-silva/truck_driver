// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.chooseAddVehicleType;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddExistingVehicleActivity_ViewBinding implements Unbinder {
  private AddExistingVehicleActivity target;

  @UiThread
  public AddExistingVehicleActivity_ViewBinding(AddExistingVehicleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddExistingVehicleActivity_ViewBinding(AddExistingVehicleActivity target, View source) {
    this.target = target;

    target.estVehicleCode = Utils.findRequiredViewAsType(source, R.id.estVehicleCode, "field 'estVehicleCode'", EditText.class);
    target.btnSubmit = Utils.findRequiredViewAsType(source, R.id.btnSubmit, "field 'btnSubmit'", TextView.class);
    target.driver_image = Utils.findRequiredViewAsType(source, R.id.driver_image, "field 'driver_image'", CircleImageView.class);
    target.tvDriverName = Utils.findRequiredViewAsType(source, R.id.tvDriverName, "field 'tvDriverName'", TextView.class);
    target.tvVehicleName = Utils.findRequiredViewAsType(source, R.id.tvVehicleName, "field 'tvVehicleName'", TextView.class);
    target.btnAddExistingVehicle = Utils.findRequiredViewAsType(source, R.id.btnAddExistingVehicle, "field 'btnAddExistingVehicle'", Button.class);
    target.llEnterCodeLayout = Utils.findRequiredViewAsType(source, R.id.llEnterCodeLayout, "field 'llEnterCodeLayout'", LinearLayout.class);
    target.llExistingVehicleDetails = Utils.findRequiredViewAsType(source, R.id.llExistingVehicleDetails, "field 'llExistingVehicleDetails'", LinearLayout.class);
    target.edtVerifyOtp = Utils.findRequiredViewAsType(source, R.id.edtVerifyOtp, "field 'edtVerifyOtp'", EditText.class);
    target.ll_back_about = Utils.findRequiredViewAsType(source, R.id.ll_back_about, "field 'll_back_about'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddExistingVehicleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.estVehicleCode = null;
    target.btnSubmit = null;
    target.driver_image = null;
    target.tvDriverName = null;
    target.tvVehicleName = null;
    target.btnAddExistingVehicle = null;
    target.llEnterCodeLayout = null;
    target.llExistingVehicleDetails = null;
    target.edtVerifyOtp = null;
    target.ll_back_about = null;
  }
}
