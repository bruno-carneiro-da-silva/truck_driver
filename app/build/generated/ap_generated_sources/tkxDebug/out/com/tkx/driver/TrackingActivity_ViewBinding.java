// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.tkx.driver.views.CustomButton;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TrackingActivity_ViewBinding implements Unbinder {
  private TrackingActivity target;

  private View view7f09032c;

  @UiThread
  public TrackingActivity_ViewBinding(TrackingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TrackingActivity_ViewBinding(final TrackingActivity target, View source) {
    this.target = target;

    View view;
    target.chatNumber = Utils.findRequiredViewAsType(source, R.id.chat_number, "field 'chatNumber'", TextView.class);
    target.selectCarImage = Utils.findRequiredViewAsType(source, R.id.select_car_image, "field 'selectCarImage'", LinearLayout.class);
    target.topLayoutTwo = Utils.findRequiredViewAsType(source, R.id.top_layout_two, "field 'topLayoutTwo'", CardView.class);
    target.topLayoutOne = Utils.findRequiredViewAsType(source, R.id.top_layout_one, "field 'topLayoutOne'", CardView.class);
    target.actionLayout = Utils.findRequiredViewAsType(source, R.id.action_layout, "field 'actionLayout'", LinearLayout.class);
    target.locationPinColor = Utils.findRequiredViewAsType(source, R.id.image_color, "field 'locationPinColor'", ImageView.class);
    target.locationText = Utils.findRequiredViewAsType(source, R.id.location_text, "field 'locationText'", TextView.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", CircleImageView.class);
    target.customerNameTxt = Utils.findRequiredViewAsType(source, R.id.customer_name_txt, "field 'customerNameTxt'", TextView.class);
    target.customerPhoneTxt = Utils.findRequiredViewAsType(source, R.id.customer_phone_txt, "field 'customerPhoneTxt'", TextView.class);
    target.rating = Utils.findRequiredViewAsType(source, R.id.rating, "field 'rating'", RatingBar.class);
    target.ratingTxt = Utils.findRequiredViewAsType(source, R.id.rating_txt, "field 'ratingTxt'", TextView.class);
    target.paymentMethodNameTxt = Utils.findRequiredViewAsType(source, R.id.payment_method_name_txt, "field 'paymentMethodNameTxt'", TextView.class);
    target.callBtn = Utils.findRequiredViewAsType(source, R.id.call_btn, "field 'callBtn'", FrameLayout.class);
    target.chatBtn = Utils.findRequiredViewAsType(source, R.id.chat_btn, "field 'chatBtn'", FrameLayout.class);
    target.navigateButton = Utils.findRequiredViewAsType(source, R.id.navigate_button, "field 'navigateButton'", FrameLayout.class);
    target.sos = Utils.findRequiredViewAsType(source, R.id.sos, "field 'sos'", LinearLayout.class);
    target.cancelBtn = Utils.findRequiredViewAsType(source, R.id.cancel_btn, "field 'cancelBtn'", TextView.class);
    target.tripStatusTxtSimple = Utils.findRequiredViewAsType(source, R.id.trip_status_txt_simple, "field 'tripStatusTxtSimple'", TextView.class);
    target.tripStatusTxtSlider = Utils.findRequiredViewAsType(source, R.id.trip_status_txt_slider, "field 'tripStatusTxtSlider'", CustomButton.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.sliderImage = Utils.findRequiredViewAsType(source, R.id.slider_image, "field 'sliderImage'", ImageView.class);
    target.layoutSliingButton = Utils.findRequiredViewAsType(source, R.id.layout_sliing_button, "field 'layoutSliingButton'", CardView.class);
    target.locationEditIcon = Utils.findRequiredViewAsType(source, R.id.location_edit_icon, "field 'locationEditIcon'", ImageView.class);
    target.call_track_btn = Utils.findRequiredViewAsType(source, R.id.call_btn_track, "field 'call_track_btn'", ImageView.class);
    target.chat_btn_track = Utils.findRequiredViewAsType(source, R.id.chat_btn_track, "field 'chat_btn_track'", ImageView.class);
    target.share_button_track = Utils.findRequiredViewAsType(source, R.id.navigate_button_track, "field 'share_button_track'", ImageView.class);
    target.info_button = Utils.findRequiredViewAsType(source, R.id.info_button, "field 'info_button'", FrameLayout.class);
    target.cardChildDetails = Utils.findRequiredViewAsType(source, R.id.cardChildDetails, "field 'cardChildDetails'", CardView.class);
    view = Utils.findRequiredView(source, R.id.llWaitRide, "field 'llWaitRide' and method 'onClickWaitRide'");
    target.llWaitRide = Utils.castView(view, R.id.llWaitRide, "field 'llWaitRide'", LinearLayout.class);
    view7f09032c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClickWaitRide();
      }
    });
    target.ivWaitRide = Utils.findRequiredViewAsType(source, R.id.ivWaitRide, "field 'ivWaitRide'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TrackingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chatNumber = null;
    target.selectCarImage = null;
    target.topLayoutTwo = null;
    target.topLayoutOne = null;
    target.actionLayout = null;
    target.locationPinColor = null;
    target.locationText = null;
    target.back = null;
    target.image = null;
    target.customerNameTxt = null;
    target.customerPhoneTxt = null;
    target.rating = null;
    target.ratingTxt = null;
    target.paymentMethodNameTxt = null;
    target.callBtn = null;
    target.chatBtn = null;
    target.navigateButton = null;
    target.sos = null;
    target.cancelBtn = null;
    target.tripStatusTxtSimple = null;
    target.tripStatusTxtSlider = null;
    target.root = null;
    target.sliderImage = null;
    target.layoutSliingButton = null;
    target.locationEditIcon = null;
    target.call_track_btn = null;
    target.chat_btn_track = null;
    target.share_button_track = null;
    target.info_button = null;
    target.cardChildDetails = null;
    target.llWaitRide = null;
    target.ivWaitRide = null;

    view7f09032c.setOnClickListener(null);
    view7f09032c = null;
  }
}
