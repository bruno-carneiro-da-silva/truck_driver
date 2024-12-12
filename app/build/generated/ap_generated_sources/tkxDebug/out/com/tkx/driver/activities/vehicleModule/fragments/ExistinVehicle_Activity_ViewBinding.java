// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.vehicleModule.fragments;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExistinVehicle_Activity_ViewBinding implements Unbinder {
  private ExistinVehicle_Activity target;

  private View view7f090100;

  private View view7f090107;

  @UiThread
  public ExistinVehicle_Activity_ViewBinding(final ExistinVehicle_Activity target, View source) {
    this.target = target;

    View view;
    target.estVehicleCode = Utils.findRequiredViewAsType(source, R.id.estVehicleCode, "field 'estVehicleCode'", EditText.class);
    target.driver_image = Utils.findRequiredViewAsType(source, R.id.driver_image, "field 'driver_image'", CircleImageView.class);
    target.tvDriverName = Utils.findRequiredViewAsType(source, R.id.tvDriverName, "field 'tvDriverName'", TextView.class);
    target.tvVehicleName = Utils.findRequiredViewAsType(source, R.id.tvVehicleName, "field 'tvVehicleName'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnAddExistingVehicle, "field 'btnAddExistingVehicle' and method 'onSubmit'");
    target.btnAddExistingVehicle = Utils.castView(view, R.id.btnAddExistingVehicle, "field 'btnAddExistingVehicle'", Button.class);
    view7f090100 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmit(p0);
      }
    });
    target.llEnterCodeLayout = Utils.findRequiredViewAsType(source, R.id.llEnterCodeLayout, "field 'llEnterCodeLayout'", LinearLayout.class);
    target.llExistingVehicleDetails = Utils.findRequiredViewAsType(source, R.id.llExistingVehicleDetails, "field 'llExistingVehicleDetails'", LinearLayout.class);
    target.edtVerifyOtp = Utils.findRequiredViewAsType(source, R.id.edtVerifyOtp, "field 'edtVerifyOtp'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnSubmit, "field 'btnSubmit' and method 'onSubmit'");
    target.btnSubmit = Utils.castView(view, R.id.btnSubmit, "field 'btnSubmit'", TextView.class);
    view7f090107 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSubmit(p0);
      }
    });
    target.driver_details = Utils.findRequiredViewAsType(source, R.id.driver_details, "field 'driver_details'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExistinVehicle_Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.estVehicleCode = null;
    target.driver_image = null;
    target.tvDriverName = null;
    target.tvVehicleName = null;
    target.btnAddExistingVehicle = null;
    target.llEnterCodeLayout = null;
    target.llExistingVehicleDetails = null;
    target.edtVerifyOtp = null;
    target.btnSubmit = null;
    target.driver_details = null;

    view7f090100.setOnClickListener(null);
    view7f090100 = null;
    view7f090107.setOnClickListener(null);
    view7f090107 = null;
  }
}
