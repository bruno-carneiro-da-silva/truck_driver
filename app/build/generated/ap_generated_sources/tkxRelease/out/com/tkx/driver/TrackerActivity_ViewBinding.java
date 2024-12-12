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
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.amalbit.trail.RouteOverlayView;
import com.apporioinfolabs.apporiotaxislidingbutton.ApporioTaxiSlidingButton;
import customviews.typefacesviews.TypeFaceGoogle;
import customviews.typefacesviews.TypeFaceGoogleBold;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TrackerActivity_ViewBinding implements Unbinder {
  private TrackerActivity target;

  @UiThread
  public TrackerActivity_ViewBinding(TrackerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TrackerActivity_ViewBinding(TrackerActivity target, View source) {
    this.target = target;

    target.eventsButton = Utils.findRequiredViewAsType(source, R.id.events_button, "field 'eventsButton'", ApporioTaxiSlidingButton.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.customerNameTxt = Utils.findRequiredViewAsType(source, R.id.customer_name_txt, "field 'customerNameTxt'", TypeFaceGoogleBold.class);
    target.rating = Utils.findRequiredViewAsType(source, R.id.rating, "field 'rating'", RatingBar.class);
    target.customerPhoneTxt = Utils.findRequiredViewAsType(source, R.id.customer_phone_txt, "field 'customerPhoneTxt'", TypeFaceGoogleBold.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.customerImage = Utils.findRequiredViewAsType(source, R.id.customer_image, "field 'customerImage'", CircleImageView.class);
    target.customerLayout = Utils.findRequiredViewAsType(source, R.id.customer_layout, "field 'customerLayout'", LinearLayout.class);
    target.addressLayout = Utils.findRequiredViewAsType(source, R.id.address_layout, "field 'addressLayout'", LinearLayout.class);
    target.locationText = Utils.findRequiredViewAsType(source, R.id.location_text, "field 'locationText'", TypeFaceGoogle.class);
    target.locationEditIcon = Utils.findRequiredViewAsType(source, R.id.location_edit_icon, "field 'locationEditIcon'", ImageView.class);
    target.actionLayout = Utils.findRequiredViewAsType(source, R.id.action_layout, "field 'actionLayout'", LinearLayout.class);
    target.routeOverlayView = Utils.findRequiredViewAsType(source, R.id.mapOverlayView, "field 'routeOverlayView'", RouteOverlayView.class);
    target.phoneButton = Utils.findRequiredViewAsType(source, R.id.phone_button, "field 'phoneButton'", ImageView.class);
    target.chatCounter = Utils.findRequiredViewAsType(source, R.id.chat_counter, "field 'chatCounter'", TextView.class);
    target.chatButton = Utils.findRequiredViewAsType(source, R.id.chat_button, "field 'chatButton'", FrameLayout.class);
    target.navigationButton = Utils.findRequiredViewAsType(source, R.id.navigation_button, "field 'navigationButton'", ImageView.class);
    target.sosButton = Utils.findRequiredViewAsType(source, R.id.sos_button, "field 'sosButton'", ImageView.class);
    target.childeButton = Utils.findRequiredViewAsType(source, R.id.childe_button, "field 'childeButton'", ImageView.class);
    target.infoButton = Utils.findRequiredViewAsType(source, R.id.info_button, "field 'infoButton'", ImageView.class);
    target.waitButton = Utils.findRequiredViewAsType(source, R.id.wait_button, "field 'waitButton'", ImageView.class);
    target.cancel_btn = Utils.findRequiredViewAsType(source, R.id.cancel_btn, "field 'cancel_btn'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TrackerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.eventsButton = null;
    target.root = null;
    target.customerNameTxt = null;
    target.rating = null;
    target.customerPhoneTxt = null;
    target.back = null;
    target.customerImage = null;
    target.customerLayout = null;
    target.addressLayout = null;
    target.locationText = null;
    target.locationEditIcon = null;
    target.actionLayout = null;
    target.routeOverlayView = null;
    target.phoneButton = null;
    target.chatCounter = null;
    target.chatButton = null;
    target.navigationButton = null;
    target.sosButton = null;
    target.childeButton = null;
    target.infoButton = null;
    target.waitButton = null;
    target.cancel_btn = null;
  }
}
