// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.sam.placer.PlaceHolderView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.docs_alert = Utils.findRequiredViewAsType(source, R.id.docs_alert, "field 'docs_alert'", LinearLayout.class);
    target.expire_msg = Utils.findRequiredViewAsType(source, R.id.expiry_msg, "field 'expire_msg'", TextView.class);
    target.see_docs = Utils.findRequiredViewAsType(source, R.id.see_docs, "field 'see_docs'", TextView.class);
    target.close_docs = Utils.findRequiredViewAsType(source, R.id.close_docs, "field 'close_docs'", ImageView.class);
    target.onlineOfflineText = Utils.findRequiredViewAsType(source, R.id.online_offline_text, "field 'onlineOfflineText'", TextView.class);
    target.todaysBooking = Utils.findRequiredViewAsType(source, R.id.todays_booking, "field 'todaysBooking'", TextView.class);
    target.todaysEarning = Utils.findRequiredViewAsType(source, R.id.todays_earning, "field 'todaysEarning'", TextView.class);
    target.activatedCarImage = Utils.findRequiredViewAsType(source, R.id.activated_car_image, "field 'activatedCarImage'", ImageView.class);
    target.activatedCarText = Utils.findRequiredViewAsType(source, R.id.activated_car_text, "field 'activatedCarText'", TextView.class);
    target.demandSpot = Utils.findRequiredViewAsType(source, R.id.demand_Spot, "field 'demandSpot'", CardView.class);
    target.main_screen_counter_layout = Utils.findRequiredViewAsType(source, R.id.todays_schedule_text, "field 'main_screen_counter_layout'", FrameLayout.class);
    target.upcoming_ride_btn = Utils.findRequiredViewAsType(source, R.id.btn_upcomming_ride, "field 'upcoming_ride_btn'", CardView.class);
    target.tripsBtn = Utils.findRequiredViewAsType(source, R.id.trips_btn, "field 'tripsBtn'", LinearLayout.class);
    target.accountsBtn = Utils.findRequiredViewAsType(source, R.id.accounts_btn, "field 'accountsBtn'", LinearLayout.class);
    target.settingsBtn = Utils.findRequiredViewAsType(source, R.id.settings_btn, "field 'settingsBtn'", LinearLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.switchBtn = Utils.findRequiredViewAsType(source, R.id.switch_btn, "field 'switchBtn'", SwitchCompat.class);
    target.switch_btn_auto = Utils.findRequiredViewAsType(source, R.id.switch_btn_auto, "field 'switch_btn_auto'", SwitchCompat.class);
    target.switchControll = Utils.findRequiredViewAsType(source, R.id.switch_controll, "field 'switchControll'", RelativeLayout.class);
    target.frameAuto = Utils.findRequiredViewAsType(source, R.id.frameAuto, "field 'frameAuto'", FrameLayout.class);
    target.switch_controll_auto = Utils.findRequiredViewAsType(source, R.id.switch_controll_auto, "field 'switch_controll_auto'", RelativeLayout.class);
    target.viewCars = Utils.findRequiredViewAsType(source, R.id.view_cars, "field 'viewCars'", LinearLayout.class);
    target.notificationBtn = Utils.findRequiredViewAsType(source, R.id.notification_btn, "field 'notificationBtn'", RelativeLayout.class);
    target.placeholder = Utils.findRequiredViewAsType(source, R.id.placeholder, "field 'placeholder'", PlaceHolderView.class);
    target.placeholderLayout = Utils.findRequiredViewAsType(source, R.id.placeholder_layout, "field 'placeholderLayout'", CardView.class);
    target.mainScreenConterText = Utils.findRequiredViewAsType(source, R.id.main_screen_conter_text, "field 'mainScreenConterText'", TextView.class);
    target.bottomBell = Utils.findRequiredViewAsType(source, R.id.bottom_bell, "field 'bottomBell'", ImageView.class);
    target.bottomCross = Utils.findRequiredViewAsType(source, R.id.bottom_cross, "field 'bottomCross'", CardView.class);
    target.btn_manual_dispatch = Utils.findRequiredViewAsType(source, R.id.btn_manual_dispatch, "field 'btn_manual_dispatch'", CardView.class);
    target.activatedCarNumber = Utils.findRequiredViewAsType(source, R.id.activated_car_number, "field 'activatedCarNumber'", TextView.class);
    target.auto_text = Utils.findRequiredViewAsType(source, R.id.auto_text, "field 'auto_text'", TextView.class);
    target.connectionStatus = Utils.findRequiredViewAsType(source, R.id.connection_status, "field 'connectionStatus'", TextView.class);
    target.tvVehicleStatus = Utils.findRequiredViewAsType(source, R.id.tvVehicleStatus, "field 'tvVehicleStatus'", TextView.class);
    target.igi = Utils.findRequiredViewAsType(source, R.id.igi, "field 'igi'", Button.class);
    target.frm1 = Utils.findRequiredViewAsType(source, R.id.frm1, "field 'frm1'", FrameLayout.class);
    target.gender_option = Utils.findRequiredViewAsType(source, R.id.gender_option, "field 'gender_option'", CardView.class);
    target.NotficationText = Utils.findRequiredViewAsType(source, R.id.notfication_text, "field 'NotficationText'", TextView.class);
    target.llViewBottomLayout = Utils.findRequiredViewAsType(source, R.id.llViewBottomLayout, "field 'llViewBottomLayout'", LinearLayout.class);
    target.notification = Utils.findRequiredViewAsType(source, R.id.notification_number, "field 'notification'", TextView.class);
    target.todaytriptext = Utils.findRequiredViewAsType(source, R.id.todaytriptext, "field 'todaytriptext'", TextView.class);
    target.todayearningtext = Utils.findRequiredViewAsType(source, R.id.todayearningtext, "field 'todayearningtext'", TextView.class);
    target.text_upcoming = Utils.findRequiredViewAsType(source, R.id.text_upcoming, "field 'text_upcoming'", TextView.class);
    target.triptext = Utils.findRequiredViewAsType(source, R.id.triptext, "field 'triptext'", TextView.class);
    target.accounttext = Utils.findRequiredViewAsType(source, R.id.accounttext, "field 'accounttext'", TextView.class);
    target.settingtext = Utils.findRequiredViewAsType(source, R.id.settingtext, "field 'settingtext'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.docs_alert = null;
    target.expire_msg = null;
    target.see_docs = null;
    target.close_docs = null;
    target.onlineOfflineText = null;
    target.todaysBooking = null;
    target.todaysEarning = null;
    target.activatedCarImage = null;
    target.activatedCarText = null;
    target.demandSpot = null;
    target.main_screen_counter_layout = null;
    target.upcoming_ride_btn = null;
    target.tripsBtn = null;
    target.accountsBtn = null;
    target.settingsBtn = null;
    target.root = null;
    target.switchBtn = null;
    target.switch_btn_auto = null;
    target.switchControll = null;
    target.frameAuto = null;
    target.switch_controll_auto = null;
    target.viewCars = null;
    target.notificationBtn = null;
    target.placeholder = null;
    target.placeholderLayout = null;
    target.mainScreenConterText = null;
    target.bottomBell = null;
    target.bottomCross = null;
    target.btn_manual_dispatch = null;
    target.activatedCarNumber = null;
    target.auto_text = null;
    target.connectionStatus = null;
    target.tvVehicleStatus = null;
    target.igi = null;
    target.frm1 = null;
    target.gender_option = null;
    target.NotficationText = null;
    target.llViewBottomLayout = null;
    target.notification = null;
    target.todaytriptext = null;
    target.todayearningtext = null;
    target.text_upcoming = null;
    target.triptext = null;
    target.accounttext = null;
    target.settingtext = null;
  }
}
