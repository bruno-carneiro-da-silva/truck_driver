// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import customviews.PulsatorLayout;
import customviews.progresswheel.ProgressWheel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReceivePassengerActivity_ViewBinding implements Unbinder {
  private ReceivePassengerActivity target;

  @UiThread
  public ReceivePassengerActivity_ViewBinding(ReceivePassengerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ReceivePassengerActivity_ViewBinding(ReceivePassengerActivity target, View source) {
    this.target = target;

    target.carTyImage = Utils.findRequiredViewAsType(source, R.id.car_ty_image, "field 'carTyImage'", ImageView.class);
    target.rentalPackageHeaig = Utils.findRequiredViewAsType(source, R.id.rental_package_heaig, "field 'rentalPackageHeaig'", TextView.class);
    target.rentalPackageName = Utils.findRequiredViewAsType(source, R.id.rental_package_name, "field 'rentalPackageName'", TextView.class);
    target.requestType = Utils.findRequiredViewAsType(source, R.id.request_type, "field 'requestType'", TextView.class);
    target.tvPaymentMethod = Utils.findRequiredViewAsType(source, R.id.tvPaymentMethod, "field 'tvPaymentMethod'", TextView.class);
    target.progress = Utils.findRequiredViewAsType(source, R.id.progress, "field 'progress'", ProgressWheel.class);
    target.mapImage = Utils.findRequiredViewAsType(source, R.id.map_image, "field 'mapImage'", CircleImageView.class);
    target.pulsator = Utils.findRequiredViewAsType(source, R.id.pulsator, "field 'pulsator'", PulsatorLayout.class);
    target.timeTxt = Utils.findRequiredViewAsType(source, R.id.time_txt, "field 'timeTxt'", TextView.class);
    target.mainLayoutPickupTxt = Utils.findRequiredViewAsType(source, R.id.main_layout_pickup_txt, "field 'mainLayoutPickupTxt'", TextView.class);
    target.mainLayout = Utils.findRequiredViewAsType(source, R.id.main_layout, "field 'mainLayout'", LinearLayout.class);
    target.rideExpirePickAddressTxt = Utils.findRequiredViewAsType(source, R.id.ride_expire_pick_address_txt, "field 'rideExpirePickAddressTxt'", TextView.class);
    target.rideExpireDropAddressTxt = Utils.findRequiredViewAsType(source, R.id.ride_expire_drop_address_txt, "field 'rideExpireDropAddressTxt'", TextView.class);
    target.expireMsg = Utils.findRequiredViewAsType(source, R.id.expire_msg, "field 'expireMsg'", TextView.class);
    target.rideExpireOkBtn = Utils.findRequiredViewAsType(source, R.id.ride_expire_ok_btn, "field 'rideExpireOkBtn'", LinearLayout.class);
    target.rideExpireLayout = Utils.findRequiredViewAsType(source, R.id.ride_expire_layout, "field 'rideExpireLayout'", LinearLayout.class);
    target.acceptRideBtn = Utils.findRequiredViewAsType(source, R.id.accept_ride_btn, "field 'acceptRideBtn'", LinearLayout.class);
    target.cancelBtn = Utils.findRequiredViewAsType(source, R.id.cancel_btn, "field 'cancelBtn'", CardView.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", RelativeLayout.class);
    target.timeAndDistanceText = Utils.findRequiredViewAsType(source, R.id.time_and_distance_text, "field 'timeAndDistanceText'", TextView.class);
    target.mapImageBackground = Utils.findRequiredViewAsType(source, R.id.map_image_background, "field 'mapImageBackground'", CircleImageView.class);
    target.drop = Utils.findRequiredViewAsType(source, R.id.drop, "field 'drop'", TextView.class);
    target.more_destination = Utils.findRequiredViewAsType(source, R.id.more_destination, "field 'more_destination'", ImageView.class);
    target.main_layout_drop_txt = Utils.findRequiredViewAsType(source, R.id.main_layout_drop_txt, "field 'main_layout_drop_txt'", TextView.class);
    target.est_fare = Utils.findRequiredViewAsType(source, R.id.est_fare, "field 'est_fare'", TextView.class);
    target.note = Utils.findRequiredViewAsType(source, R.id.note, "field 'note'", TextView.class);
    target.estimation_fare = Utils.findRequiredViewAsType(source, R.id.estimation_fare, "field 'estimation_fare'", LinearLayout.class);
    target.no_riders = Utils.findRequiredViewAsType(source, R.id.no_riders, "field 'no_riders'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReceivePassengerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.carTyImage = null;
    target.rentalPackageHeaig = null;
    target.rentalPackageName = null;
    target.requestType = null;
    target.tvPaymentMethod = null;
    target.progress = null;
    target.mapImage = null;
    target.pulsator = null;
    target.timeTxt = null;
    target.mainLayoutPickupTxt = null;
    target.mainLayout = null;
    target.rideExpirePickAddressTxt = null;
    target.rideExpireDropAddressTxt = null;
    target.expireMsg = null;
    target.rideExpireOkBtn = null;
    target.rideExpireLayout = null;
    target.acceptRideBtn = null;
    target.cancelBtn = null;
    target.root = null;
    target.timeAndDistanceText = null;
    target.mapImageBackground = null;
    target.drop = null;
    target.more_destination = null;
    target.main_layout_drop_txt = null;
    target.est_fare = null;
    target.note = null;
    target.estimation_fare = null;
    target.no_riders = null;
  }
}
