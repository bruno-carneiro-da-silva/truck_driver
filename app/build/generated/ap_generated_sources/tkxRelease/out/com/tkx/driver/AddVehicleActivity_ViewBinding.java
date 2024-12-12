// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddVehicleActivity_ViewBinding implements Unbinder {
  private AddVehicleActivity target;

  @UiThread
  public AddVehicleActivity_ViewBinding(AddVehicleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddVehicleActivity_ViewBinding(AddVehicleActivity target, View source) {
    this.target = target;

    target.carTypeName = Utils.findRequiredViewAsType(source, R.id.car_type_name, "field 'carTypeName'", TextView.class);
    target.edtCarMake = Utils.findRequiredViewAsType(source, R.id.edt_car_make, "field 'edtCarMake'", TextView.class);
    target.tvCarModel = Utils.findRequiredViewAsType(source, R.id.tv_car_model, "field 'tvCarModel'", TextView.class);
    target.tvCarTraction = Utils.findRequiredViewAsType(source, R.id.tv_car_traction, "field 'tvCarTraction'", TextView.class);
    target.carTypeAntt = Utils.findRequiredViewAsType(source, R.id.car_type_antt, "field 'carTypeAntt'", TextView.class);
    target.tvRideCategory = Utils.findRequiredViewAsType(source, R.id.tv_ride_category, "field 'tvRideCategory'", TextView.class);
    target.numberPlacetImage = Utils.findRequiredViewAsType(source, R.id.number_placet_image, "field 'numberPlacetImage'", LinearLayout.class);
    target.selectCarImage = Utils.findRequiredViewAsType(source, R.id.select_car_image, "field 'selectCarImage'", LinearLayout.class);
    target.numberPlateImage = Utils.findRequiredViewAsType(source, R.id.number_plate_image, "field 'numberPlateImage'", ImageView.class);
    target.vehicleImage = Utils.findRequiredViewAsType(source, R.id.vehicle_image, "field 'vehicleImage'", ImageView.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.submitVehicleButton = Utils.findRequiredViewAsType(source, R.id.submit_vehicle_button, "field 'submitVehicleButton'", TextView.class);
    target.carNumberEdt = Utils.findRequiredViewAsType(source, R.id.car_number_edt, "field 'carNumberEdt'", EditText.class);
    target.carCapacityEdt = Utils.findRequiredViewAsType(source, R.id.car_capacity_edt, "field 'carCapacityEdt'", EditText.class);
    target.createVehicleInfo = Utils.findRequiredViewAsType(source, R.id.create_vehicle_info, "field 'createVehicleInfo'", ImageView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.ac_non_ac_checkbox = Utils.findRequiredViewAsType(source, R.id.ac_non_ac_checkbox, "field 'ac_non_ac_checkbox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddVehicleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carTypeName = null;
    target.edtCarMake = null;
    target.tvCarModel = null;
    target.tvCarTraction = null;
    target.carTypeAntt = null;
    target.tvRideCategory = null;
    target.numberPlacetImage = null;
    target.selectCarImage = null;
    target.numberPlateImage = null;
    target.vehicleImage = null;
    target.back = null;
    target.submitVehicleButton = null;
    target.carNumberEdt = null;
    target.carCapacityEdt = null;
    target.createVehicleInfo = null;
    target.root = null;
    target.ac_non_ac_checkbox = null;
  }
}
