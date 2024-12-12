// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RentalPriceFareActiviy_ViewBinding implements Unbinder {
  private RentalPriceFareActiviy target;

  @UiThread
  public RentalPriceFareActiviy_ViewBinding(RentalPriceFareActiviy target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RentalPriceFareActiviy_ViewBinding(RentalPriceFareActiviy target, View source) {
    this.target = target;

    target.pickLocationTxt = Utils.findRequiredViewAsType(source, R.id.pick_location_txt, "field 'pickLocationTxt'", TextView.class);
    target.dropLocationTxt = Utils.findRequiredViewAsType(source, R.id.drop_location_txt, "field 'dropLocationTxt'", TextView.class);
    target.totalPaybleTop = Utils.findRequiredViewAsType(source, R.id.total_payble_top, "field 'totalPaybleTop'", TextView.class);
    target.totalHoursTxt = Utils.findRequiredViewAsType(source, R.id.total_hours_txt, "field 'totalHoursTxt'", TextView.class);
    target.basePackageTxt = Utils.findRequiredViewAsType(source, R.id.base_package_txt, "field 'basePackageTxt'", TextView.class);
    target.basePackagePrice = Utils.findRequiredViewAsType(source, R.id.base_package_price, "field 'basePackagePrice'", TextView.class);
    target.totalPriceTxt = Utils.findRequiredViewAsType(source, R.id.total_price_txt, "field 'totalPriceTxt'", TextView.class);
    target.couponTxt = Utils.findRequiredViewAsType(source, R.id.coupon_txt, "field 'couponTxt'", TextView.class);
    target.couponPriceTxt = Utils.findRequiredViewAsType(source, R.id.coupon_price_txt, "field 'couponPriceTxt'", TextView.class);
    target.totalPaybleBottom = Utils.findRequiredViewAsType(source, R.id.total_payble_bottom, "field 'totalPaybleBottom'", TextView.class);
    target.ratingBar = Utils.findRequiredViewAsType(source, R.id.rating_bar, "field 'ratingBar'", RatingBar.class);
    target.llSubmitRating = Utils.findRequiredViewAsType(source, R.id.ll_submit_rating, "field 'llSubmitRating'", TextView.class);
    target.comments = Utils.findRequiredViewAsType(source, R.id.comments, "field 'comments'", EditText.class);
    target.nightTimeTxt = Utils.findRequiredViewAsType(source, R.id.night_time_txt, "field 'nightTimeTxt'", TextView.class);
    target.nightTimePriceTxt = Utils.findRequiredViewAsType(source, R.id.night_time_price_txt, "field 'nightTimePriceTxt'", TextView.class);
    target.peakTimeTxt = Utils.findRequiredViewAsType(source, R.id.peak_time_txt, "field 'peakTimeTxt'", TextView.class);
    target.peakTimePriceTxt = Utils.findRequiredViewAsType(source, R.id.peak_time_price_txt, "field 'peakTimePriceTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RentalPriceFareActiviy target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pickLocationTxt = null;
    target.dropLocationTxt = null;
    target.totalPaybleTop = null;
    target.totalHoursTxt = null;
    target.basePackageTxt = null;
    target.basePackagePrice = null;
    target.totalPriceTxt = null;
    target.couponTxt = null;
    target.couponPriceTxt = null;
    target.totalPaybleBottom = null;
    target.ratingBar = null;
    target.llSubmitRating = null;
    target.comments = null;
    target.nightTimeTxt = null;
    target.nightTimePriceTxt = null;
    target.peakTimeTxt = null;
    target.peakTimePriceTxt = null;
  }
}
