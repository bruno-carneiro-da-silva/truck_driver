// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.activities.vehicleModule.fragments;

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
import com.tkx.driver.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddVehicleDriver_Activity_ViewBinding implements Unbinder {
  private AddVehicleDriver_Activity target;

  @UiThread
  public AddVehicleDriver_Activity_ViewBinding(AddVehicleDriver_Activity target, View source) {
    this.target = target;

    target.carTypeName = Utils.findRequiredViewAsType(source, R.id.car_type_name, "field 'carTypeName'", TextView.class);
    target.edtCarMake = Utils.findRequiredViewAsType(source, R.id.edt_car_make, "field 'edtCarMake'", TextView.class);
    target.tvCarModel = Utils.findRequiredViewAsType(source, R.id.tv_car_model, "field 'tvCarModel'", TextView.class);
    target.tvCarTraction = Utils.findRequiredViewAsType(source, R.id.tv_car_traction, "field 'tvCarTraction'", TextView.class);
    target.tvCarColor = Utils.findRequiredViewAsType(source, R.id.tv_car_color, "field 'tvCarColor'", TextView.class);
    target.carTypeAntt = Utils.findRequiredViewAsType(source, R.id.car_type_antt, "field 'carTypeAntt'", TextView.class);
    target.numberPlacetImage = Utils.findRequiredViewAsType(source, R.id.number_placet_image, "field 'numberPlacetImage'", LinearLayout.class);
    target.selectCarImage = Utils.findRequiredViewAsType(source, R.id.select_car_image, "field 'selectCarImage'", LinearLayout.class);
    target.numberPlateImage = Utils.findRequiredViewAsType(source, R.id.number_plate_image, "field 'numberPlateImage'", ImageView.class);
    target.vehicleImage = Utils.findRequiredViewAsType(source, R.id.vehicle_image, "field 'vehicleImage'", ImageView.class);
    target.submitVehicleButton = Utils.findRequiredViewAsType(source, R.id.submit_vehicle_button, "field 'submitVehicleButton'", TextView.class);
    target.carNumberEdt = Utils.findRequiredViewAsType(source, R.id.car_number_edt, "field 'carNumberEdt'", EditText.class);
    target.carCapacityEdt = Utils.findRequiredViewAsType(source, R.id.car_capacity_edt, "field 'carCapacityEdt'", EditText.class);
    target.country_id_owner = Utils.findRequiredViewAsType(source, R.id.country_id_owner, "field 'country_id_owner'", TextView.class);
    target.createVehicleInfo = Utils.findRequiredViewAsType(source, R.id.create_vehicle_info, "field 'createVehicleInfo'", ImageView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.owner_vehLL = Utils.findRequiredViewAsType(source, R.id.owner_veh_id, "field 'owner_vehLL'", LinearLayout.class);
    target.ll_babyseat = Utils.findRequiredViewAsType(source, R.id.ll_babyseat, "field 'll_babyseat'", LinearLayout.class);
    target.cb_babyseat = Utils.findRequiredViewAsType(source, R.id.cb_babyseat, "field 'cb_babyseat'", CheckBox.class);
    target.ownerCheckBox = Utils.findRequiredViewAsType(source, R.id.owner_chkbx, "field 'ownerCheckBox'", CheckBox.class);
    target.owner_name_et = Utils.findRequiredViewAsType(source, R.id.owner_name_et, "field 'owner_name_et'", EditText.class);
    target.owner_no_et = Utils.findRequiredViewAsType(source, R.id.owner_no_et, "field 'owner_no_et'", EditText.class);
    target.owner_email_et = Utils.findRequiredViewAsType(source, R.id.owner_email_et, "field 'owner_email_et'", EditText.class);
    target.bank_name_et = Utils.findRequiredViewAsType(source, R.id.bank_name_et, "field 'bank_name_et'", EditText.class);
    target.bank_code_et = Utils.findRequiredViewAsType(source, R.id.bank_code_et, "field 'bank_code_et'", EditText.class);
    target.owner_accno_et = Utils.findRequiredViewAsType(source, R.id.owner_accno_et, "field 'owner_accno_et'", EditText.class);
    target.select_cheque_image = Utils.findRequiredViewAsType(source, R.id.select_cheque_image, "field 'select_cheque_image'", LinearLayout.class);
    target.cheque_image = Utils.findRequiredViewAsType(source, R.id.cheque_image, "field 'cheque_image'", ImageView.class);
    target.ll_wheel_chair = Utils.findRequiredViewAsType(source, R.id.ll_wheel_chair, "field 'll_wheel_chair'", LinearLayout.class);
    target.cb_wheel_chair = Utils.findRequiredViewAsType(source, R.id.cb_wheel_chair, "field 'cb_wheel_chair'", CheckBox.class);
    target.llSelectVehicleMake = Utils.findRequiredViewAsType(source, R.id.llSelectVehicleMake, "field 'llSelectVehicleMake'", LinearLayout.class);
    target.llSelectVehicleModel = Utils.findRequiredViewAsType(source, R.id.llSelectVehicleModel, "field 'llSelectVehicleModel'", LinearLayout.class);
    target.llFieldVehicleMake = Utils.findRequiredViewAsType(source, R.id.llFieldVehicleMake, "field 'llFieldVehicleMake'", LinearLayout.class);
    target.llFieldVehicleModel = Utils.findRequiredViewAsType(source, R.id.llFieldVehicleModel, "field 'llFieldVehicleModel'", LinearLayout.class);
    target.edtVehicleMake = Utils.findRequiredViewAsType(source, R.id.edtVehicleMake, "field 'edtVehicleMake'", EditText.class);
    target.edtVehicleModel = Utils.findRequiredViewAsType(source, R.id.edtVehicleModel, "field 'edtVehicleModel'", EditText.class);
    target.llNoOfSeats = Utils.findRequiredViewAsType(source, R.id.llNoOfSeats, "field 'llNoOfSeats'", LinearLayout.class);
    target.edtNoOfSeats = Utils.findRequiredViewAsType(source, R.id.edtNoOfSeats, "field 'edtNoOfSeats'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddVehicleDriver_Activity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carTypeName = null;
    target.edtCarMake = null;
    target.tvCarModel = null;
    target.tvCarTraction = null;
    target.tvCarColor = null;
    target.carTypeAntt = null;
    target.numberPlacetImage = null;
    target.selectCarImage = null;
    target.numberPlateImage = null;
    target.vehicleImage = null;
    target.submitVehicleButton = null;
    target.carNumberEdt = null;
    target.carCapacityEdt = null;
    target.country_id_owner = null;
    target.createVehicleInfo = null;
    target.root = null;
    target.owner_vehLL = null;
    target.ll_babyseat = null;
    target.cb_babyseat = null;
    target.ownerCheckBox = null;
    target.owner_name_et = null;
    target.owner_no_et = null;
    target.owner_email_et = null;
    target.bank_name_et = null;
    target.bank_code_et = null;
    target.owner_accno_et = null;
    target.select_cheque_image = null;
    target.cheque_image = null;
    target.ll_wheel_chair = null;
    target.cb_wheel_chair = null;
    target.llSelectVehicleMake = null;
    target.llSelectVehicleModel = null;
    target.llFieldVehicleMake = null;
    target.llFieldVehicleModel = null;
    target.edtVehicleMake = null;
    target.edtVehicleModel = null;
    target.llNoOfSeats = null;
    target.edtNoOfSeats = null;
  }
}
