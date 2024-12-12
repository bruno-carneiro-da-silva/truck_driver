// Generated code from Butter Knife. Do not modify!
package com.tkx.driver;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hbb20.CountryCodePicker;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OTPVerifierActivity_ViewBinding implements Unbinder {
  private OTPVerifierActivity target;

  @UiThread
  public OTPVerifierActivity_ViewBinding(OTPVerifierActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OTPVerifierActivity_ViewBinding(OTPVerifierActivity target, View source) {
    this.target = target;

    target.root = Utils.findRequiredViewAsType(source, R.id.root, "field 'root'", LinearLayout.class);
    target.country_id = Utils.findRequiredViewAsType(source, R.id.country_id, "field 'country_id'", TextView.class);
    target.phone_number = Utils.findRequiredViewAsType(source, R.id.edt_enter_phone, "field 'phone_number'", EditText.class);
    target.generate_otp = Utils.findRequiredViewAsType(source, R.id.generate_otp, "field 'generate_otp'", Button.class);
    target.otp_input = Utils.findRequiredViewAsType(source, R.id.edit_verify_otp, "field 'otp_input'", EditText.class);
    target.submit_otp_layout = Utils.findRequiredViewAsType(source, R.id.otp_register, "field 'submit_otp_layout'", LinearLayout.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.phoneLayout = Utils.findRequiredViewAsType(source, R.id.phone_layout, "field 'phoneLayout'", CardView.class);
    target.reenterButton = Utils.findRequiredViewAsType(source, R.id.reenter_button, "field 'reenterButton'", TextView.class);
    target.otpLayout = Utils.findRequiredViewAsType(source, R.id.otp_layout, "field 'otpLayout'", CardView.class);
    target.otp_phone = Utils.findRequiredViewAsType(source, R.id.otp_phone, "field 'otp_phone'", LinearLayout.class);
    target.email_layout = Utils.findRequiredViewAsType(source, R.id.email_layout, "field 'email_layout'", LinearLayout.class);
    target.edt_email = Utils.findRequiredViewAsType(source, R.id.edt_email, "field 'edt_email'", EditText.class);
    target.otp_text = Utils.findRequiredViewAsType(source, R.id.otp_text, "field 'otp_text'", TextView.class);
    target.tvOtpHeading = Utils.findRequiredViewAsType(source, R.id.tvOtpHeading, "field 'tvOtpHeading'", TextView.class);
    target.country_code = Utils.findRequiredViewAsType(source, R.id.country_code1, "field 'country_code'", CountryCodePicker.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OTPVerifierActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.root = null;
    target.country_id = null;
    target.phone_number = null;
    target.generate_otp = null;
    target.otp_input = null;
    target.submit_otp_layout = null;
    target.back = null;
    target.phoneLayout = null;
    target.reenterButton = null;
    target.otpLayout = null;
    target.otp_phone = null;
    target.email_layout = null;
    target.edt_email = null;
    target.otp_text = null;
    target.tvOtpHeading = null;
    target.country_code = null;
  }
}
