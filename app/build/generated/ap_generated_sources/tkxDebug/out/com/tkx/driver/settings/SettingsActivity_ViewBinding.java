// Generated code from Butter Knife. Do not modify!
package com.tkx.driver.settings;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tkx.driver.R;
import customviews.typefacesviews.TypeFaceGoogle;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsActivity_ViewBinding implements Unbinder {
  private SettingsActivity target;

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.llLanguageBtn = Utils.findRequiredViewAsType(source, R.id.ll_language_btn, "field 'llLanguageBtn'", TypeFaceGoogle.class);
    target.llCustomerBtn = Utils.findRequiredViewAsType(source, R.id.ll_customer_btn, "field 'llCustomerBtn'", TypeFaceGoogle.class);
    target.llReportIssueBtn = Utils.findRequiredViewAsType(source, R.id.ll_report_issue_btn, "field 'llReportIssueBtn'", TypeFaceGoogle.class);
    target.llTermsBtn = Utils.findRequiredViewAsType(source, R.id.ll_terms_btn, "field 'llTermsBtn'", TypeFaceGoogle.class);
    target.llAboutBtn = Utils.findRequiredViewAsType(source, R.id.ll_about_btn, "field 'llAboutBtn'", TypeFaceGoogle.class);
    target.textViewVersionName = Utils.findRequiredViewAsType(source, R.id.textView_version_name, "field 'textViewVersionName'", TypeFaceGoogle.class);
    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.switchAutoUpgrade = Utils.findRequiredViewAsType(source, R.id.switchAutoUpgrade, "field 'switchAutoUpgrade'", Switch.class);
    target.switchPoolRide = Utils.findRequiredViewAsType(source, R.id.switchPoolRide, "field 'switchPoolRide'", Switch.class);
    target.rlAutoUpgradation = Utils.findRequiredViewAsType(source, R.id.rlAutoUpgradation, "field 'rlAutoUpgradation'", LinearLayout.class);
    target.rlPoolRide = Utils.findRequiredViewAsType(source, R.id.rlPoolRide, "field 'rlPoolRide'", LinearLayout.class);
    target.ll_privacy_policy = Utils.findRequiredViewAsType(source, R.id.ll_privacy_policy, "field 'll_privacy_policy'", TypeFaceGoogle.class);
    target.super_driver = Utils.findRequiredViewAsType(source, R.id.super_driver, "field 'super_driver'", LinearLayout.class);
    target.driver_rating = Utils.findRequiredViewAsType(source, R.id.driver_rating, "field 'driver_rating'", TypeFaceGoogle.class);
    target.refer_menu_btn = Utils.findRequiredViewAsType(source, R.id.refer_menu_btn, "field 'refer_menu_btn'", LinearLayout.class);
    target.set_radius_btn = Utils.findRequiredViewAsType(source, R.id.set_radius_btn, "field 'set_radius_btn'", LinearLayout.class);
    target.driverRating = Utils.findRequiredViewAsType(source, R.id.driverRating, "field 'driverRating'", LinearLayout.class);
    target.top_layout = Utils.findRequiredViewAsType(source, R.id.top_layout, "field 'top_layout'", TextView.class);
    target.language = Utils.findRequiredViewAsType(source, R.id.language, "field 'language'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.llLanguageBtn = null;
    target.llCustomerBtn = null;
    target.llReportIssueBtn = null;
    target.llTermsBtn = null;
    target.llAboutBtn = null;
    target.textViewVersionName = null;
    target.root = null;
    target.switchAutoUpgrade = null;
    target.switchPoolRide = null;
    target.rlAutoUpgradation = null;
    target.rlPoolRide = null;
    target.ll_privacy_policy = null;
    target.super_driver = null;
    target.driver_rating = null;
    target.refer_menu_btn = null;
    target.set_radius_btn = null;
    target.driverRating = null;
    target.top_layout = null;
    target.language = null;
  }
}
