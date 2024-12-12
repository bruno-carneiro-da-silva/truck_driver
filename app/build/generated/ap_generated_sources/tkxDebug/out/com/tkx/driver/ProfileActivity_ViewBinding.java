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
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProfileActivity_ViewBinding implements Unbinder {
  private ProfileActivity target;

  @UiThread
  public ProfileActivity_ViewBinding(ProfileActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProfileActivity_ViewBinding(ProfileActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.driverImage = Utils.findRequiredViewAsType(source, R.id.driver_image, "field 'driverImage'", CircleImageView.class);
    target.driverName = Utils.findRequiredViewAsType(source, R.id.driver_name, "field 'driverName'", TextView.class);
    target.driverEmail = Utils.findRequiredViewAsType(source, R.id.driver_email, "field 'driverEmail'", TextView.class);
    target.driverPhone = Utils.findRequiredViewAsType(source, R.id.driver_phone, "field 'driverPhone'", TextView.class);
    target.changePassword = Utils.findRequiredViewAsType(source, R.id.change_password, "field 'changePassword'", LinearLayout.class);
    target.changeBankDetails = Utils.findRequiredViewAsType(source, R.id.change_bank_details, "field 'changeBankDetails'", LinearLayout.class);
    target.changeHomeAddress = Utils.findRequiredViewAsType(source, R.id.change_home_address, "field 'changeHomeAddress'", LinearLayout.class);
    target.llSubscription = Utils.findRequiredViewAsType(source, R.id.llSubscription, "field 'llSubscription'", LinearLayout.class);
    target.logout = Utils.findRequiredViewAsType(source, R.id.logout, "field 'logout'", LinearLayout.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.managePersonalDoc = Utils.findRequiredViewAsType(source, R.id.manage_personal_doc, "field 'managePersonalDoc'", LinearLayout.class);
    target.edit = Utils.findRequiredViewAsType(source, R.id.edit, "field 'edit'", TextView.class);
    target.totalRides = Utils.findRequiredViewAsType(source, R.id.total_rides, "field 'totalRides'", TextView.class);
    target.totalRating = Utils.findRequiredViewAsType(source, R.id.total_rating, "field 'totalRating'", TextView.class);
    target.totalEarning = Utils.findRequiredViewAsType(source, R.id.total_earning, "field 'totalEarning'", TextView.class);
    target.someDocExpireText = Utils.findRequiredViewAsType(source, R.id.some_doc_expire_text, "field 'someDocExpireText'", TextView.class);
    target.emergency_contacts = Utils.findRequiredViewAsType(source, R.id.emergency_contacts, "field 'emergency_contacts'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProfileActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.driverImage = null;
    target.driverName = null;
    target.driverEmail = null;
    target.driverPhone = null;
    target.changePassword = null;
    target.changeBankDetails = null;
    target.changeHomeAddress = null;
    target.llSubscription = null;
    target.logout = null;
    target.root = null;
    target.managePersonalDoc = null;
    target.edit = null;
    target.totalRides = null;
    target.totalRating = null;
    target.totalEarning = null;
    target.someDocExpireText = null;
    target.emergency_contacts = null;
  }
}
