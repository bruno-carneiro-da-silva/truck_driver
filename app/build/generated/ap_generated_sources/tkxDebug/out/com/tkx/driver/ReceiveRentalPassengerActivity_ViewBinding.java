// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import customviews.PulsatorLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReceiveRentalPassengerActivity_ViewBinding implements Unbinder {
  private ReceiveRentalPassengerActivity target;

  @UiThread
  public ReceiveRentalPassengerActivity_ViewBinding(ReceiveRentalPassengerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReceiveRentalPassengerActivity_ViewBinding(ReceiveRentalPassengerActivity target,
      View source) {
    this.target = target;

    target.mapImage = Utils.findRequiredViewAsType(source, R.id.map_image, "field 'mapImage'", CircleImageView.class);
    target.carTypeImage = Utils.findRequiredViewAsType(source, R.id.car_type_image, "field 'carTypeImage'", ImageView.class);
    target.carTypeNameTxt = Utils.findRequiredViewAsType(source, R.id.car_type_name_txt, "field 'carTypeNameTxt'", TextView.class);
    target.packageTxt = Utils.findRequiredViewAsType(source, R.id.package_txt, "field 'packageTxt'", TextView.class);
    target.TimeOfBookingTxt = Utils.findRequiredViewAsType(source, R.id._time_of_booking_txt, "field 'TimeOfBookingTxt'", TextView.class);
    target.etaPriceTxt = Utils.findRequiredViewAsType(source, R.id.eta_price_txt, "field 'etaPriceTxt'", TextView.class);
    target.pickupAddressTxt = Utils.findRequiredViewAsType(source, R.id.pickup_address_txt, "field 'pickupAddressTxt'", TextView.class);
    target.acceptBtn = Utils.findRequiredViewAsType(source, R.id.accept_btn, "field 'acceptBtn'", LinearLayout.class);
    target.rejectBtn = Utils.findRequiredViewAsType(source, R.id.reject_btn, "field 'rejectBtn'", LinearLayout.class);
    target.pulsator = Utils.findRequiredViewAsType(source, R.id.pulsator, "field 'pulsator'", PulsatorLayout.class);
    target.timeTxt = Utils.findRequiredViewAsType(source, R.id.time_txt, "field 'timeTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReceiveRentalPassengerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mapImage = null;
    target.carTypeImage = null;
    target.carTypeNameTxt = null;
    target.packageTxt = null;
    target.TimeOfBookingTxt = null;
    target.etaPriceTxt = null;
    target.pickupAddressTxt = null;
    target.acceptBtn = null;
    target.rejectBtn = null;
    target.pulsator = null;
    target.timeTxt = null;
  }
}
