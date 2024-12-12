// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.typeface.TypefaceTextView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SelectedRentalRideActivity_ViewBinding implements Unbinder {
  private SelectedRentalRideActivity target;

  @UiThread
  public SelectedRentalRideActivity_ViewBinding(SelectedRentalRideActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SelectedRentalRideActivity_ViewBinding(SelectedRentalRideActivity target, View source) {
    this.target = target;

    target.llBackRideSelect = Utils.findRequiredViewAsType(source, R.id.ll_back_ride_select, "field 'llBackRideSelect'", LinearLayout.class);
    target.tvDateTime1 = Utils.findRequiredViewAsType(source, R.id.tv_date_time1, "field 'tvDateTime1'", TypefaceTextView.class);
    target.ivImageDriver = Utils.findRequiredViewAsType(source, R.id.iv_image_driver, "field 'ivImageDriver'", CircleImageView.class);
    target.customerNameTxt = Utils.findRequiredViewAsType(source, R.id.customer_name_txt, "field 'customerNameTxt'", TextView.class);
    target.customerPhoneTxt = Utils.findRequiredViewAsType(source, R.id.customer_phone_txt, "field 'customerPhoneTxt'", TextView.class);
    target.ratingSelected = Utils.findRequiredViewAsType(source, R.id.rating_selected, "field 'ratingSelected'", RatingBar.class);
    target.llDriverKiDetail = Utils.findRequiredViewAsType(source, R.id.ll_driver_ki_detail, "field 'llDriverKiDetail'", LinearLayout.class);
    target.tvCarIma = Utils.findRequiredViewAsType(source, R.id.tv_car_ima, "field 'tvCarIma'", CircleImageView.class);
    target.tvRupee = Utils.findRequiredViewAsType(source, R.id.tv_rupee, "field 'tvRupee'", TextView.class);
    target.tvDis = Utils.findRequiredViewAsType(source, R.id.tv_dis, "field 'tvDis'", TextView.class);
    target.tvTime1 = Utils.findRequiredViewAsType(source, R.id.tv_time1, "field 'tvTime1'", TextView.class);
    target.llBill = Utils.findRequiredViewAsType(source, R.id.ll_bill, "field 'llBill'", LinearLayout.class);
    target.startTimeTxt = Utils.findRequiredViewAsType(source, R.id.start_time_txt, "field 'startTimeTxt'", TextView.class);
    target.tvStartLocation = Utils.findRequiredViewAsType(source, R.id.tv_start_location, "field 'tvStartLocation'", TextView.class);
    target.dropTimeTxt = Utils.findRequiredViewAsType(source, R.id.drop_time_txt, "field 'dropTimeTxt'", TextView.class);
    target.tvEndLocation = Utils.findRequiredViewAsType(source, R.id.tv_end_location, "field 'tvEndLocation'", TextView.class);
    target.llLocationModule = Utils.findRequiredViewAsType(source, R.id.ll_location_module, "field 'llLocationModule'", LinearLayout.class);
    target.tvRideDistance = Utils.findRequiredViewAsType(source, R.id.tv_ride_distance, "field 'tvRideDistance'", TextView.class);
    target.textView6 = Utils.findRequiredViewAsType(source, R.id.textView6, "field 'textView6'", TextView.class);
    target.totalHoursTxt = Utils.findRequiredViewAsType(source, R.id.total_hours_txt, "field 'totalHoursTxt'", TextView.class);
    target.basePackageTxt = Utils.findRequiredViewAsType(source, R.id.base_package_txt, "field 'basePackageTxt'", TextView.class);
    target.basePackagePrice = Utils.findRequiredViewAsType(source, R.id.base_package_price, "field 'basePackagePrice'", TextView.class);
    target.extraDistanceTxt = Utils.findRequiredViewAsType(source, R.id.extra_distance_txt, "field 'extraDistanceTxt'", TextView.class);
    target.extraDistancePriceTxt = Utils.findRequiredViewAsType(source, R.id.extra_distance_price_txt, "field 'extraDistancePriceTxt'", TextView.class);
    target.extraTimeTxt = Utils.findRequiredViewAsType(source, R.id.extra_time_txt, "field 'extraTimeTxt'", TextView.class);
    target.extraTimePriceTxt = Utils.findRequiredViewAsType(source, R.id.extra_time_price_txt, "field 'extraTimePriceTxt'", TextView.class);
    target.totalPriceTxt = Utils.findRequiredViewAsType(source, R.id.total_price_txt, "field 'totalPriceTxt'", TextView.class);
    target.couponTxt = Utils.findRequiredViewAsType(source, R.id.coupon_txt, "field 'couponTxt'", TextView.class);
    target.couponPriceTxt = Utils.findRequiredViewAsType(source, R.id.coupon_price_txt, "field 'couponPriceTxt'", TextView.class);
    target.totalPaybleBottom = Utils.findRequiredViewAsType(source, R.id.total_payble_bottom, "field 'totalPaybleBottom'", TextView.class);
    target.llTrackRide = Utils.findRequiredViewAsType(source, R.id.ll_track_ride, "field 'llTrackRide'", LinearLayout.class);
    target.activitySelectedRides = Utils.findRequiredViewAsType(source, R.id.activity_selected_rides, "field 'activitySelectedRides'", LinearLayout.class);
    target.bill_layout = Utils.findRequiredViewAsType(source, R.id.bill_layout, "field 'bill_layout'", LinearLayout.class);
    target.drop_layout = Utils.findRequiredViewAsType(source, R.id.drop_layout, "field 'drop_layout'", LinearLayout.class);
    target.nightTimeTxt = Utils.findRequiredViewAsType(source, R.id.night_time_txt, "field 'nightTimeTxt'", TextView.class);
    target.nightTimePriceTxt = Utils.findRequiredViewAsType(source, R.id.night_time_price_txt, "field 'nightTimePriceTxt'", TextView.class);
    target.peakTimeTxt = Utils.findRequiredViewAsType(source, R.id.peak_time_txt, "field 'peakTimeTxt'", TextView.class);
    target.peakTimePriceTxt = Utils.findRequiredViewAsType(source, R.id.peak_time_price_txt, "field 'peakTimePriceTxt'", TextView.class);
    target.payMode = Utils.findRequiredViewAsType(source, R.id.payMode, "field 'payMode'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SelectedRentalRideActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.llBackRideSelect = null;
    target.tvDateTime1 = null;
    target.ivImageDriver = null;
    target.customerNameTxt = null;
    target.customerPhoneTxt = null;
    target.ratingSelected = null;
    target.llDriverKiDetail = null;
    target.tvCarIma = null;
    target.tvRupee = null;
    target.tvDis = null;
    target.tvTime1 = null;
    target.llBill = null;
    target.startTimeTxt = null;
    target.tvStartLocation = null;
    target.dropTimeTxt = null;
    target.tvEndLocation = null;
    target.llLocationModule = null;
    target.tvRideDistance = null;
    target.textView6 = null;
    target.totalHoursTxt = null;
    target.basePackageTxt = null;
    target.basePackagePrice = null;
    target.extraDistanceTxt = null;
    target.extraDistancePriceTxt = null;
    target.extraTimeTxt = null;
    target.extraTimePriceTxt = null;
    target.totalPriceTxt = null;
    target.couponTxt = null;
    target.couponPriceTxt = null;
    target.totalPaybleBottom = null;
    target.llTrackRide = null;
    target.activitySelectedRides = null;
    target.bill_layout = null;
    target.drop_layout = null;
    target.nightTimeTxt = null;
    target.nightTimePriceTxt = null;
    target.peakTimeTxt = null;
    target.peakTimePriceTxt = null;
    target.payMode = null;
  }
}
